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


        String[] array = FILE_CONTENT.split(System.lineSeparator());
        StringBuilder stringBuilder1 = new StringBuilder();
        for(String s : array){
            stringBuilder1.append(s);
        }

        String fileContent = stringBuilder1.toString();
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(fileContent);

        while (matcher.find()){
            System.out.println(matcher.group());
        }

    }

}