package com.epam.rd.java.basic.practice4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part3 {

    public static final String REGEX_INT = "(?<!\\.)\\b\\d+\\b(?!\\.)";
    public static final String REGEX_DOUBLE = "\\d*\\.\\d+";
    public static final String REGEX_CHAR = "\\b\\w\\b";
    public static final String REGEX_STRING = "\\b[\\w&&\\D]{2,}\\b";
    public static final String FILE_CONTENT = Part1.readFromFile("part3.txt", "cp1251");
    private static final Logger LOGGER = Logger.getLogger(Part3.class.getName());

    public static void main(String[] args) {

        try {
            String consoleString;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            while (!(consoleString = br.readLine()).equals("stop")) {
                System.out.println(getResultOperation(consoleString));
            }

        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "IOException", e);
        }

    }

    public static String getValuesFromFile(String regEx){

        Pattern pattern = Pattern.compile(regEx, Pattern.UNICODE_CHARACTER_CLASS);
        Matcher matcher = pattern.matcher(FILE_CONTENT);
        StringBuilder stringBuilder = new StringBuilder();

        while (matcher.find()){
            stringBuilder.append(matcher.group()).append(" ");
        } return stringBuilder.toString();

    }

    public static String getResultOperation(String inputData){

        switch (inputData){
            case "char":
                return getValuesFromFile(REGEX_CHAR);
            case "int":
                return getValuesFromFile(REGEX_INT);
            case "String":
                return getValuesFromFile(REGEX_STRING);
            case "double":
                return getValuesFromFile(REGEX_DOUBLE);
            case "stop":
                return "stop";
            default: return "Incorrect input";
        }

    }

}
