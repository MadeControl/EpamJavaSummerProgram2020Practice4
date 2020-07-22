package com.epam.rd.java.basic.practice4;

import org.junit.Assert;
import org.junit.Test;

public class Part3Test {

    @Test
    public void getValuesFromFileTest(){

        final String expectedString = "432 89";

        Assert.assertEquals(expectedString, Part3.getValuesFromFile(Part3.REGEX_INT));

    }

    @Test
    public void getResultOperationTest(){

        final String expectedString = "43.43 .98";
        final String inputData = "double";

        Assert.assertEquals(expectedString, Part3.getResultOperation(inputData));

    }

}