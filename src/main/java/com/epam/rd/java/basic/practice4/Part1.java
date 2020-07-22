package com.epam.rd.java.basic.practice4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Part1 {

    private static final Logger LOGGER = Logger.getLogger(Part1.class.getName());
    public static final String LINE_SEPARATOR = System.lineSeparator();

    public static void main(String[] args) {

        final String fileName = "part1.txt";
        final String encoding  = "cp1251";
        System.out.println(part1(fileName, encoding));

    }

    public static String part1(String fileName, String encoding){

        final String contentOfFile = readFromFile(fileName, encoding);
        final String[] stringsOfText = contentOfFile.split(LINE_SEPARATOR);
        StringBuilder stringBuilder = new StringBuilder();

        for(String str : stringsOfText){

            String[] wordsOfString = str.split("[\\s\n\r]");

            for (String word : wordsOfString){

                if(word.length() >= 4){
                    stringBuilder.append(word.substring(word.length() - (word.length() - 2)));
                } else {
                    stringBuilder.append(word);
                } stringBuilder.append(" ");

            } stringBuilder
                    .delete(stringBuilder.length()-1, stringBuilder.length())
                    .append(LINE_SEPARATOR);

        } return stringBuilder.delete(stringBuilder.length()-1, stringBuilder.length()).toString();

    }

    public static String readFromFile(String fileName, String encoding){

        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(
                new FileInputStream(fileName), encoding))) {

            String temp;
            while ( (temp = bufferedReader.readLine()) != null){
                stringBuilder.append(temp).append(LINE_SEPARATOR);
            }

        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "IOException-error", e);
        } return stringBuilder.toString();

    }

}