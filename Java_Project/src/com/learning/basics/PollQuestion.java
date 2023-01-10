package com.learning.basics;

public class PollQuestion {
    public static void main(String[] args) {

        int i = 1;

        while (i % 8 != 0){
            System.out.println("Mod Value :- "+ i % 8);
            System.out.println("Hi "+ (++i));
            i++;
        }
    }
}
