package com.solvd.hospital2.multithreading;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        IntStream.range(0, 10)
                .boxed()
                .forEach(x -> {
                    MyThread1 myThread1 = new MyThread1("Thread #" +x);
                    myThread1.start();

                    MyThread2 myThread2 = new MyThread2("Thread # "+x+" from MyThread2");
                    Thread thread = new Thread(myThread2);
                    thread.start();
                });

    }
}
