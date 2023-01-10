package com.learning.basics;

public class TernaryOperators {


    static void valueCheck(int number) {
//        String isValidNumber;
//        if (number > 20) {
//            isValidNumber = "valid";
//        } else {
//            isValidNumber = "invalid";
//        }

        //Ternary operator -> Replacement for only single if else block!
        String isValidNumberTer = number > 20 ? "valid" : "invalid";

        System.out.println(number + " is a " + isValidNumberTer + " number");
    }

    public static void main(String[] args) {
        valueCheck(13);
        valueCheck(45);

    }
}
