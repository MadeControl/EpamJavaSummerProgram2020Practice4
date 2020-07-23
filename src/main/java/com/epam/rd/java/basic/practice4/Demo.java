package com.epam.rd.java.basic.practice4;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class Demo {

    private static final InputStream STD_IN = System.in;

    public static void main(String[] args) {
        final String[] arguments = {};

        System.out.println("=========================== PART1");
        Part1.main(arguments);

        System.out.println("=========================== PART2");
        Part2.main(arguments);

        System.out.println("=========================== PART3");
        // set the mock input
        System.setIn(new ByteArrayInputStream("char^String^int^double^stop"
                .replace("^", System.lineSeparator()).getBytes(StandardCharsets.UTF_8)));

        Part3.main(arguments);
        // restore the standard input
        System.setIn(STD_IN);

        System.out.println("=========================== PART4");
        Part4.main(arguments);

        System.out.println("=========================== PART5");
        // set the mock input
        System.setIn(new ByteArrayInputStream("table ru^table en^apple ru^stop"
                .replace("^", System.lineSeparator()).getBytes(StandardCharsets.UTF_8)));

        Part5.main(arguments);
        // restore the standard input
        System.setIn(STD_IN);

        System.out.println("=========================== PART6");
        // set the mock input
        System.setIn(new ByteArrayInputStream("Latn^Cyrl^asdf^latn^cyrl^stop"
                .replace("^", System.lineSeparator()).getBytes(StandardCharsets.UTF_8)));

        Part6.main(arguments);
        // restore the standard input
        System.setIn(STD_IN);

    }

}
