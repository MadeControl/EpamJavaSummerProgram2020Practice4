package com.epam.rd.java.basic.practice4;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part4 implements Iterable<String> {

    private static final String REGEX = "\\p{Lu}.*?\\.";
    private static final String FILE_CONTENT = Part1.readFromFile("part4.txt", "cp1251");

    public static void main(String[] args) {

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

    @Override
    public Iterator<String> iterator() {
        return new MyClass();
    }

    private class MyClass implements Iterator<String> {

        Pattern pattern = Pattern.compile(REGEX, Pattern.UNICODE_CHARACTER_CLASS);
        Matcher matcher = pattern.matcher(FILE_CONTENT);
        boolean hasNext;

        @Override
        public boolean hasNext() {
            hasNext = matcher.find();
            return hasNext;
        }

        @Override
        public String next() {
            if(!hasNext){
                throw new NoSuchElementException();
            }
            return matcher.group();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

}
