package com.solvd.hospital2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;
import java.util.function.Consumer;

public class HospitalCallCenter {

    private static final Logger LOGGER = LogManager.getLogger(HospitalCallCenter.class);

    private String address;

    public void callProcessing(Consumer<String> consumer) {
        LOGGER.info("Hello! You call to the hospital.\n" +
                "If you want to call an ambulance press 1.\n" +
                "To call a doctor at home, press 2.\n" +
                "Press 3 to receive the ticket.");
        Scanner scanner = new Scanner(System.in);
        Integer button = scanner.nextInt();
        scanner.nextLine();

        switch(button) {
            case(1):
                LOGGER.info("Please tell your address");
                address = scanner.nextLine();
                break;
            case(2):
            case(3):
                LOGGER.info("Stay on line");
                break;
            default:
                break;
        }
        consumer.accept(address);
    }
}
