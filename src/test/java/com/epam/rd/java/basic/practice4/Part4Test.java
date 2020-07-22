package com.epam.rd.java.basic.practice4;

import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;

public class Part4Test {

    @Test
    public void part4Test(){

        final String expectedString =
                "The class should parse a text file and return sentences from the file.\r\n" +
                "A sentence is understood as a sequence that starts with a capital letter and ends with a dot.\r\n" +
                "Take the original file small in size.\r\n" +
                "A few lines and a few sentences are enough.\r\n";
        Iterator<String> iterator = new Part4().iterator();
        StringBuilder stringBuilder = new StringBuilder();

        while (iterator.hasNext()){
            stringBuilder.append(iterator.next()).append(System.lineSeparator());
        }

        Assert.assertEquals(expectedString, stringBuilder.toString());

    }

}