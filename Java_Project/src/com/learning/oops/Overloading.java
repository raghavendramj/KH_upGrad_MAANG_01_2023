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


public class Overloading {

    public static void main(String[] args) {
        //Integer.MAX_VALUE -> -2,147,483,647 to 2,147,483,647
        Overloading object = new Overloading();
        object.add(10, 20); //2 params int
        object.add(23l, 56l); // 2 params long
        object.add(10, 20, 34); // 3 params int
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
