package com.epam.rd.java.basic.practice4;

public class Part1 {

    public static void main(String[] args) {

        if(!(args == null)){
            for(String str : args){
                if(str.length() > 4){
                    System.out.print(str.substring(str.length()-(str.length() - 2)) + " ");
                } else {
                    System.out.print(str + " ");
                }
            }
        } else {
            throw new NullPointerException();
        }

    }

}
