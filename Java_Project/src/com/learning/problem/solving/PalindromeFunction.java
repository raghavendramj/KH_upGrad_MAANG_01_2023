package com.learning.problem.solving;

public class PalindromeFunction {

    //Logic -> 1. reverse a string -> compare str1 and str2 -> same? palindrome. -> str comparision -> str.equals()

    // madam
    //0 m -> m 4
    //1 a -> a 3
    //2 a -> a 2
    //Stop the iteration

    static String reverseString(String input) {
        String reversedStr = "";
        // r a g h a v
        // 0 1 2 3 4 5

        //reversedStr 5 -> v
        //reversedStr 4 -> va
        //reversedStr 3 -> vah
        //reversedStr 2 -> vahg
        //reversedStr 1 -> vahga
        //reversedStr 0 -> vahgar

        for (int i = input.length() - 1; i >= 0; i--) {
            reversedStr += input.charAt(i);
        }
        return reversedStr;
    }

    static boolean isPalindromeL1(String input) {

        String revStr = reverseString(input);

        System.out.println("Original String :- " + input);
        System.out.println("Reversed String :- " + revStr);

        boolean isStrPalindrome = input.equals(revStr);
        System.out.println("Is given str is a palindrome :- " + isStrPalindrome);

        return isStrPalindrome;
    }

    //Logic -> 2. start ith char with len-1 -> character comparision -> char[i] == char[i-len-1]
    static boolean isPalindromeL2(String input) {

        System.out.println("Original String :- " + input);
        int len = input.length();
        for (int i = 0; i < len / 2; i++) {
            char beginningChar = input.charAt(i);
            char endingChar = input.charAt(len - i - 1);
            System.out.println("beginningChar -> " + beginningChar + " endingChar -> " + endingChar);
            if (beginningChar != endingChar) {
                System.out.println("Given string " + input + " is not a palindrome..");
                return false;
            }
        }
        System.out.println("Given string " + input + " is a palindrome..");
        return true;
    }


    public static void main(String[] args) {

        //madam -> madam  -> Palindrome
        //raghav -> vahgar  -> Not a Palindrome


        isPalindromeL2("madam");
        isPalindromeL2("raghav");
        isPalindromeL2("abba");

        PalindromeFunction.isPalindromeL1("boththeways");

        PalindromeFunction obj1 = new PalindromeFunction();
        obj1.add(10, 23, 54);
        obj1.add(10, 45);
        obj1.add(10.34f, 45.56f);
    }

    //Method overloading // Compile time polymorphism
    int add(int a, int b, int c) {
        int result = a + b + c;
        System.out.println("3 params int result :- " + result);
        return result;
    }

    int add(int a, int b) {
        int result = a + b;
        System.out.println("2 params int result :- " + result);
        return result;
    }

    float add(float a, float b) {
        float result = a + b;
        System.out.println("2 params float result :- " + result);
        return result;
    }

}
