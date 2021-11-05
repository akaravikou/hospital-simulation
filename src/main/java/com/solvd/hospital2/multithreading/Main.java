package com.solvd.hospital2.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        ConnectionPool connectionPool = ConnectionPool.getInstance(5);
        List<Thread> threads = new ArrayList<>();

        IntStream.range(0, 100)
                .boxed()
                .forEach(x -> {
                    Thread thread = new Thread(() -> {
                        Connection connection = connectionPool.getConnection();
                        if (connection != null) {
                            connection.create();
                            connection.read();
                            connection.update();
                            connection.delete();
                            connectionPool.releaseConnection(connection);
                        }
                    });
                    threads.add(thread);
                    thread.start();
                });

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        IntStream.range(0, 100)
                .boxed()
                .map(x -> {
                    CompletableFuture<Void> completableFuture = CompletableFuture.supplyAsync(() ->
                            new Connection(), executorService).thenAccept(connection -> connection.read());
                    return completableFuture;
                })
                .collect(Collectors.toList())
                .forEach(CompletableFuture::join);
        CompletableFuture.allOf();
        executorService.shutdown();
    }
}