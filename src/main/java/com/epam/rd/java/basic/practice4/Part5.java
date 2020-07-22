package com.epam.rd.java.basic.practice4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Part5 {

    private static final Logger LOGGER = Logger.getLogger(Part3.class.getName());

    public static void main(String[] args) {

        try {
            String consoleString;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            while (!(consoleString = br.readLine()).equals("stop")) {
//                System.out.println(getResultOperation(consoleString));
            }
            System.in.close();

        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "IOException", e);
        }

    }

}
