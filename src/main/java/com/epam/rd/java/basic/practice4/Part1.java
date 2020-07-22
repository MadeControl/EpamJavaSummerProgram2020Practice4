package com.epam.rd.java.basic.practice4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Part1 {

    public static void main(String[] args) {
        BufferedReader br;
        StringBuilder sb = new StringBuilder();

        try {

            br = new BufferedReader(new InputStreamReader(new FileInputStream("part1.txt"), StandardCharsets.UTF_8));

            String temp;
            while ( (temp = br.readLine()) != null){
                sb.append(temp).append(System.lineSeparator());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        
        String[] stringsOfContent = sb.toString().split("\n");
        sb = new StringBuilder();

        for(String str : stringsOfContent){

            String[] wordsOfString = str.split("[\\s\n\r]");

            for (String word : wordsOfString){

                if(word.length() >= 4){
                    sb.append(word.substring(word.length() - (word.length() - 2)));
                } else {
                    sb.append(word);
                } sb.append(" ");

            } sb.append("\n");

        }
        System.out.print(sb.delete(sb.length()-2, sb.length()).toString());

    }

}
