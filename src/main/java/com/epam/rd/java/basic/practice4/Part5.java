package com.epam.rd.java.basic.practice4;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Part5 {

    private static final Logger LOGGER = Logger.getLogger(Part3.class.getName());

    public static void main(String[] args) {

//        Properties properties = new Properties();
//        properties.load(Part5.class.getClassLoader().getResourceAsStream("resources_ru.properties"));
//        for (Map.Entry<Object, Object> o : properties.entrySet()) {
//            System.out.print(o.getKey() + " = " + o.getValue());
//        }

//        String consoleString;
//        String languageString;
//        String keyString;
//        Locale locale;
//        ResourceBundle resourceBundle;
//
//        try {
//            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//            while (!(consoleString = br.readLine()).equals("stop")) {
//                String[] array = consoleString.split(" ");
//                if(array.length >= 2){
//                    keyString = array[0];
//                    languageString = array[1];
//                    locale = new Locale(languageString);
//                    resourceBundle = ResourceBundle.getBundle("resources", locale);
//                    System.out.println(resourceBundle.getString(keyString));
//                }
//            }
//            System.in.close();
//
//        } catch (IOException e) {
//            LOGGER.log(Level.SEVERE, "IOException", e);
//        }

    }

}
