package com.learning.basics;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class StringExample {


    public static void main(String[] args) {
        char[] characters = {'k', 'n', 'o', 'w', 'l', 'e', 'd', 'g', 'e'};
        String newString = new String(characters);
        System.out.println("Array of chars :- " + newString);

        //This is same as below..
        String javaString = "knowledge"; //String literal
        System.out.println("My java string :- " + javaString);

        // String s2 = new String("Welcome");

        String s1 = "sachin";
        s1 = "sachin tendulkar";
        s1 = "Sachin Tendular";
        s1 = "sachin";
        s1 = "sachin tendulkar";

        String s2 = "Sachin Tendulkar";
        String s3 = "sachin";


        String s4 = null;

        System.out.println("Exception line " + s4.toCharArray());

        try {
            fileCheck();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void fileCheck() throws FileNotFoundException {

        //Compile time / checked exception
        FileReader reader = new FileReader("myFile.txt");
        //Handling execption
        try {
            // FileReader reader = new FileReader("myFile.txt");
        } catch (Exception e) {
        }

    }
}
