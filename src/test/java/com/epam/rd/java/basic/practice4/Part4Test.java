package com.epam.rd.java.basic.practice4;

import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part4Test {

    private static final String REGEX = "\\p{Lu}.*?\\.";
    private static final String FILE_CONTENT = Part1.readFromFile("part4.txt", "cp1251");

    @Test
    public void part4Test(){


        StringBuilder stringBuilder = new StringBuilder();

        for(String s : FILE_CONTENT.split(System.lineSeparator())){
            stringBuilder.append(s).append(" ");
        }

        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(stringBuilder.toString());

        while (matcher.find()){
            System.out.println(matcher.group());
        }

    }

}