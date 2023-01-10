package com.learning.basics;

public class WhileAndDoWhile {

    public static void main(String[] args) {
        String names[] = {"Raghava", "Keshava", "Madhava"};

        System.out.println("1. Using For loop");
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }



        System.out.println("\n-------------------------------");
        System.out.println("\n2. Using while loop");
        int j = 0;
        while (j < names.length) {
            System.out.print(names[j] + " ");
            j++;
        }

        System.out.println("\n-------------------------------");
        System.out.println("\n3. Using do-while loop");
        int x = 0;
        do {
            System.out.print(names[x] + " ");
            x++;
        } while (x < names.length);


    }
}
