package com.epam.rd.java.basic.practice4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Part5 {

    private static final Logger LOGGER = Logger.getLogger(Part5.class.getName());

    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String consoleString;

            while (!(consoleString = br.readLine()).equals("stop")) {

                String outputString = getValueOfKey(consoleString);

                if(!outputString.equals("Incorrect input")){
                    System.out.println(outputString);
                }

            }
            System.in.close();

        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "IOException", e);
        }

    }

    public static String getValueOfKey(String input){

        Locale locale;
        ResourceBundle resourceBundle;
        String[] arrayKeyAndLanguage = input.split(" ");
        String languageString;
        String keyString;

        if(arrayKeyAndLanguage.length >= 2){
            keyString = arrayKeyAndLanguage[0];
            languageString = arrayKeyAndLanguage[1];

            if(checkCorrectInput(keyString, languageString)){

                locale = new Locale(languageString);
                resourceBundle = ResourceBundle.getBundle("resources", locale);

                return resourceBundle.getString(keyString);

            }
        } return "Incorrect input";

    }

    public static boolean checkCorrectInput(String key, String language){

        List<String> arrayOfCorrectInputWords = Arrays.asList("ru", "en", "table", "apple");
        return arrayOfCorrectInputWords.contains(key) && arrayOfCorrectInputWords.contains(language);

    }

}
