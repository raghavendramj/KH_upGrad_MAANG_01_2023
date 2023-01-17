package com.learning.basics;

public class StaticVariable {

    static double pi = 3.142; //Memory in the class level memory
    int check; //Heap specific to their objects

    public static void main(String[] args) {
        StaticVariable obj1 = new StaticVariable();
        StaticVariable obj2 = new StaticVariable();
        StaticVariable obj3 = new StaticVariable();

        System.out.println("obj1.pi :- " + obj1.pi);
        System.out.println("obj2.pi :- " + obj2.pi);
        System.out.println("obj3.pi :- " + obj3.pi);

        obj3.pi = 4.345;
        System.out.println("---------------------------------");
        System.out.println("obj1.pi :- " + obj1.pi);
        System.out.println("obj2.pi :- " + obj2.pi);
        System.out.println("obj3.pi :- " + obj3.pi);
    }
}
