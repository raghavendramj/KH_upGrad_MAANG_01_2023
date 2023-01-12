package com.learning.basics;

public class PrintStars {

    static void printLeftToRightStars() {
        System.out.println("Lets print stars from left to right!!");

        for (int i = 0; i < 4; i++) {
            //j -> 0 - 0 *
            //j -> 0 - 1 * *
            //j -> 0 - 2 * * *
            //j -> 0 - 3 * * * *
            for (int j = 0; j <= i; j++) {
                System.out.print("*   ");
            }
            System.out.println();
        }
    }

    static void printRightToLeftStars() {
        System.out.println("Lets print stars from left to right!!");

        int n = 4;

        for (int i = 0; i < n; i++) {

            // n-1 => Spaces n -> i -> 3, 2, 1
            // n-1 => Spaces n -> i -> 3, 2
            // n-1 => Spaces n -> i -> 3
            for (int j = n - 1; j > i; j--) {
                System.out.print("   ");
            }
            //j -> 0 - 0        *
            //j -> 0 - 1      * *
            //j -> 0 - 2    * * *
            //j -> 0 - 3  * * * *
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        printRightToLeftStars();
        printTest();

    }

    public static void printTest() {
        int n = 5;


//        for (int i = n; i >= 1; i--) {
//            System.out.print(" " + i + " ");
//        }
//        System.out.println();
//        for (int i = n; i >= 2; i--) {
//            System.out.print(" " + i + " ");
//        }
//        System.out.println();
//        for (int i = n; i >= 3; i--) {
//            System.out.print(" " + i + " ");
//        }
//        System.out.println();
//        for (int i = n; i >= 4; i--) {
//            System.out.print(" " + i + " ");
//        }
//        System.out.println();
//        for (int i = n; i >= 5; i--) {
//            System.out.print(" " + i + " ");
//        }
//        System.out.println();

        for (int i = 1; i <= 5; i++) {
            for (int j = n - 1; j >= i; j--) {
                System.out.print("   ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
