package com.learning.basics;

public class BreakAndContinue {
    static void continueExample() {
        System.out.println("This program prints 1 -10");
        //1, 2, 3, 4, 6, 7, 8, 9
        for (int i = 1; i < 10; i++) {
            if (i == 5 || i == 3)
                continue;
            System.out.print(i + "     ");
        }
    }

    static void breakExample() {
        System.out.println("This program prints A - Z");

        for (int i = 65; i < 91; i++) {

            char myChar = (char) i; //Explicit Typecasting
            if (myChar == 'L') {
                break;
            }
            System.out.print(myChar + "     ");
        }
    }

    public static void main(String[] args) {
        breakExample();
    }
}
