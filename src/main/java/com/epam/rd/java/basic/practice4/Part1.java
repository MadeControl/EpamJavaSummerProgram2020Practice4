package com.epam.rd.java.basic.practice4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Part1 {

    public static void main(String[] args) {
        BufferedReader bufferedReader;
        StringBuilder stringBuilder = new StringBuilder();

        try {

            bufferedReader = new BufferedReader(new InputStreamReader(
                    new FileInputStream("part1.txt"), "cp1251"));

            String temp;
            while ( (temp = bufferedReader.readLine()) != null){
                stringBuilder.append(temp).append(System.lineSeparator());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        String[] stringsOfContent = stringBuilder.toString().split(System.lineSeparator());
        stringBuilder = new StringBuilder();

        for(String str : stringsOfContent){

            String[] wordsOfString = str.split("[\\s\n\r]");

            for (String word : wordsOfString){

                if(word.length() >= 4){
                    stringBuilder.append(word.substring(word.length() - (word.length() - 2)));
                } else {
                    stringBuilder.append(word);
                } stringBuilder.append(" ");

            } stringBuilder
                    .delete(stringBuilder.length()-1, stringBuilder.length())
                    .append(System.lineSeparator());

        }
        System.out.print(stringBuilder.toString());

    }

}