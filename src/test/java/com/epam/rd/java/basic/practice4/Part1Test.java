package com.epam.rd.java.basic.practice4;

import org.junit.Assert;
import org.junit.Test;
import static com.epam.rd.java.basic.practice4.Part1.LINE_SEPARATOR;

public class Part1Test {

    @Test
    public void part1Test(){

        final String fileName = "part1.txt";
        final String encoding  = "cp1251";
        final String expectedString =
                "en I was unger" + LINE_SEPARATOR +
                "So ch unger" + LINE_SEPARATOR +
                "an day" + LINE_SEPARATOR +
                "формацию из йла" + LINE_SEPARATOR +
                "в рхний гистр" + LINE_SEPARATOR;
        Assert.assertEquals(expectedString, Part1.part1(fileName, encoding));

    }

}