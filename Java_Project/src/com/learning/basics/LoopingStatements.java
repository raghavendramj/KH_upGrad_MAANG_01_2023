package com.learning.basics;

public class LoopingStatements {


    public static void main(String[] args) {


        System.out.println("5 * 1 = " + (5 * 1));
        System.out.println("5 * 2 = " + (5 * 2));
        System.out.println("5 * 3 = " + (5 * 3));
        System.out.println("5 * 4 = " + (5 * 4));

        //int i = 1; ->initialization -> executed only once
        //i <= 10 ->conditional statement ->executed for every loop ->i -> 1, 2, 3... 10
        //i++ ->incremental / decremental statement -> executed for every loop ->i -> 1, 2, 3... 10

        for (int i = 1; i <= 10; i++) {
            System.out.println("5 * " + i + " = " + (5 * i));
        }

        System.out.println("Capital Letters are...");
        for (int i = 65; i < 91; i++) {
            System.out.print((char) i + "  ");
        }
        System.out.println();
        System.out.println("\nLowercase Letters are...");
        for (int i = 122; i > 96; i--) {
            System.out.print((char) i + "  ");
        }


    }
}
