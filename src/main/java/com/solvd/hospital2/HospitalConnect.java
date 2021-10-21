package com.solvd.hospital2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HospitalConnect implements AutoCloseable {

    private static final Logger LOGGER = LogManager.getLogger(HospitalConnect.class);

    public void getConnect() {
        LOGGER.info("Get connect");
    }

    @Override
    public void close() throws Exception {
        LOGGER.info("Connect closed");
    }
}
