package com.epam.rd.java.basic.practice4;

import org.junit.Assert;
import org.junit.Test;

public class Part6Test {

    @Test
    public void printResultOperationLatnLowerCaseTest(){

        final String expectedString = "latn: Is there anybody going to listen to my story \r\n";
        final String title = "latn";

        Assert.assertEquals(expectedString, Part6.printResultOperation(title));

    }

    @Test
    public void printResultOperationLatnUpperCaseTest(){

        final String expectedString = "Latn: Is there anybody going to listen to my story \r\n";
        final String title = "Latn";

        Assert.assertEquals(expectedString, Part6.printResultOperation(title));

    }

    @Test
    public void printResultOperationIncorrectInputTest(){

        final String expectedString = "smth: Incorrect input\r\n";
        final String title = "smth";

        Assert.assertEquals(expectedString, Part6.printResultOperation(title));

    }


}