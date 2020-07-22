package com.epam.rd.java.basic.practice4;

import org.junit.Assert;
import org.junit.Test;

public class Part2Test {

    @Test
    public void writeToFileTest(){

        final String expectedString = "Qwerty asdf";
        final String resultString = Part2.writeToFile("test.txt", Part2.ENCODING, "Qwerty asdf");
        Assert.assertEquals(expectedString, resultString);

    }

    @Test
    public void getStringOfTenGeneratedNumbersTest(){

        Assert.assertNotNull(Part2.getStringOfTenGeneratedNumbers());

    }

    @Test
    public void getStringOfTenSortedNumbersTest(){

        final String stringOfGeneratedNumbers = Part2.getStringOfTenGeneratedNumbers();
        Assert.assertNotNull(Part2.getStringOfTenSortedNumbers(stringOfGeneratedNumbers));

    }

}