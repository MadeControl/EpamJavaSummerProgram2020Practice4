package com.epam.rd.java.basic.practice4;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Part2 {

    public static final String FILE_INPUT = "part2.txt";
    public static final String FILE_OUTPUT = "part2_sorted.txt";
    public static final String ENCODING = "cp1251";
    private static final String ARROW = " ==> ";
    private static final SecureRandom RANDOM = new SecureRandom();
    private static final Logger LOGGER = Logger.getLogger(Part2.class.getName());

    public static void main(String[] args) {

        String stringOfTenNumbers = getStringOfTenGeneratedNumbers();

        String contentForInputFile = "input" + ARROW + stringOfTenNumbers;
        System.out.println(writeToFile(FILE_INPUT, ENCODING, contentForInputFile));

        String contentForOutputFile = "output" + ARROW + getStringOfTenSortedNumbers(stringOfTenNumbers);
        System.out.println(writeToFile(FILE_OUTPUT, ENCODING, contentForOutputFile));

    }

    public static String getStringOfTenSortedNumbers(String stringNumbers){

        int[] arrayNumbers = Arrays
                                .stream(stringNumbers.split("\\s"))
                                .mapToInt(Integer::parseInt)
                                .sorted()
                                .toArray();

        StringBuilder stringBuilder = new StringBuilder();

        for(int number : arrayNumbers){
            stringBuilder
                    .append(number)
                    .append(" ");
        } return stringBuilder.delete(stringBuilder.length()-1, stringBuilder.length()).toString();

    }

    public static String getStringOfTenGeneratedNumbers(){

        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < 10; i++){
            stringBuilder
                    .append(RANDOM.nextInt(50))
                    .append(" ");
        } return stringBuilder.delete(stringBuilder.length()-1, stringBuilder.length()).toString();

    }

    public static String writeToFile(String fileName, String encoding, String content){

        try(BufferedWriter bufferedWriter = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream(fileName), encoding))) {

            bufferedWriter.write(content);

        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "IOException", e);
        } return content;

    }



}
