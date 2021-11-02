package com.solvd.hospital2.multithreading;

import com.solvd.hospital2.Main;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyThread1 extends Thread{

    private static final Logger LOGGER = LogManager.getLogger(MyThread1.class);

    public MyThread1(String name) {
        super(name);
    }

    @Override
    public void run() {
        LOGGER.info(String.format("Thread %s started", getName()));
        super.run();
    }
}
