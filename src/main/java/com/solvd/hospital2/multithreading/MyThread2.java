package com.solvd.hospital2.multithreading;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyThread2 implements Runnable{

    private static final Logger LOGGER = LogManager.getLogger(MyThread2.class);

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MyThread2(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        LOGGER.info(String.format("Thread %s started", name));
    }
}
