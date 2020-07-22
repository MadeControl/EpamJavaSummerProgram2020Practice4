package com.epam.rd.java.basic.practice4;

import org.junit.Assert;
import org.junit.Test;
import static com.epam.rd.java.basic.practice4.Part1.LINE_SEPARATOR;

public class Part1Test {

    private static final String FILE_NAME = "part1.txt";
    private static final String ENCODING = "cp1251";

    @Test
    public void part1Test(){

        final String expectedString =
                "en I was unger" + LINE_SEPARATOR +
                "So ch unger" + LINE_SEPARATOR +
                "an day" + LINE_SEPARATOR +
                "формацию из йла" + LINE_SEPARATOR +
                "в рхний гистр\r";
        System.out.print(Part1.part1(FILE_NAME, ENCODING));

        Assert.assertEquals(expectedString, Part1.part1(FILE_NAME, ENCODING));

    }

    @Test
    public void readFromFileTest(){

        final String expectedString =
                "When I was younger" + LINE_SEPARATOR +
                        "So much younger" + LINE_SEPARATOR +
                        "Than today" + LINE_SEPARATOR +
                        "Информацию из файла" + LINE_SEPARATOR +
                        "в верхний регистр" + LINE_SEPARATOR;

        Assert.assertEquals(expectedString, Part1.readFromFile(FILE_NAME, ENCODING));

    }

}