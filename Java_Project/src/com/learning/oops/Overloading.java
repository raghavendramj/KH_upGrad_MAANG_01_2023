package com.learning.oops;

//Overloading / Compile-time / Static polymorphism
//Rules for Overloading is
//Method name (same)
//AND
//Different number of parameters
// OR/AND
//parameters signature should have different types
// OR/AND
//parameter if different should be in different order.

class Test{
    public static void main(String[] args) {
        Overloading.subtract(12, 23);
        Overloading.subtract(34l, 67l);
    }
}

public class Overloading {

    public static void main(String[] args) {
        //Integer.MAX_VALUE -> -2,147,483,647 to 2,147,483,647

        //Instance/Non-Static methods - Overloading in place
        Overloading object = new Overloading();
        object.add(10, 20); //2 params int
        object.add(23l, 56l); // 2 params long
        object.add(10, 20, 34); // 3 params int

        //Static methods - Overloading in place
        subtract(12, 23);
        subtract(34l, 67l);
    }


    static int subtract(int a, int b) {
        return a - b;
    }

    static long subtract(long a, long b) {
        return (long) (a - b);
    }

    int add(int a, int b) {
        int result = a + b;
        System.out.println("This method is called -> add(int a, int b) | Result :- " + result);
        return result;
    }

    long add(long a, long b) {
        long result = a + b;
        System.out.println("This method is called -> add(long a, long b)| Result :- " + result);
        return result;
    }

    long add(int a, int b, int c) {
        int result = a + b + c;
        System.out.println("This method is called -> add(int a, int b, int c)| Result :- " + result);
        return result; //implicit typecasting from int -> long
    }
}
