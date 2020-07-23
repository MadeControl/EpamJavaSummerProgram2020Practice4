package com.epam.rd.java.basic.practice4;

import org.junit.Assert;
import org.junit.Test;

public class Part5Test {

    @Test
    public void checkCorrectInputTest(){

        Assert.assertTrue(Part5.checkCorrectInput("table", "ru"));
        Assert.assertTrue(Part5.checkCorrectInput("table", "en"));
        Assert.assertTrue(Part5.checkCorrectInput("apple", "ru"));
        Assert.assertTrue(Part5.checkCorrectInput("apple", "en"));

    }

    @Test
    public void checkIncorrectInputTest(){

        Assert.assertFalse(Part5.checkCorrectInput("taable", "ru"));
        Assert.assertFalse(Part5.checkCorrectInput("table", "eng"));
        Assert.assertFalse(Part5.checkCorrectInput("sword", "rus"));
        Assert.assertFalse(Part5.checkCorrectInput("bread", "ua"));

    }

    @Test
    public void printValueOfKeyTest(){

        final String input = "table en";
        final String expectedString = "table";

        Assert.assertEquals(expectedString, Part5.getValueOfKey(input));

    }

}