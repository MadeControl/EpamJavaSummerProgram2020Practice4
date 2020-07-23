package com.epam.rd.java.basic.practice4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Part6 {

    private static final String REGEX_LATN = "[\\S&&[\\p{L1}]&&[^\\p{Punct}]]+";
    private static final String REGEX_CYRL = "[\\S&&[^\\p{L1}\\p{Punct}]]+";
    private static final String FILE_CONTENT = Part1.readFromFile("part6.txt", "cp1251");
    private static final Logger LOGGER = Logger.getLogger(Part6.class.getName());

    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String consoleString;

            while (!(consoleString = br.readLine()).equals("stop")) {

                System.out.println(printResultOperation(consoleString));

            }
            System.in.close();

        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "IOException", e);
        }

    }

    public static String printResultOperation(String title){

        StringBuilder stringBuilder = new StringBuilder(title + ": ");
        Pattern pattern;
        Matcher matcher;

        switch (title.toLowerCase()){

            case "latn":
                pattern = Pattern.compile(REGEX_LATN);
                break;
            case "cyrl":
                pattern = Pattern.compile(REGEX_CYRL);
                break;
            default: return stringBuilder
                    .append("Incorrect input")
                    .append(System.lineSeparator())
                    .toString();

        }
        matcher = pattern.matcher(FILE_CONTENT);

        while (matcher.find()){
            stringBuilder.append(matcher.group()).append(" ");
        }

        return stringBuilder.toString();

    }

}
