package com.learning.basics;

public class Car {

    static String brandName = "Maruthi";

    String color;
    String model;

    //Default constructor
    public Car() {
        System.out.println("Default constructor");
    }

    //Parameterized constructor
    public Car(String color, String model) {
        this.color = color;
        this.model = model;
        System.out.println("Parameterized constructor");
    }

    public static void main(String[] args) {

        //Car -> Reference type
        //swift -> Reference variable
        //new -> fetch the memory from heap
        //Car() -> Constructor -> initialize the variables
        Car obj1 = new Car();
        obj1.color = "Green";
        obj1.model = "Swift";
        System.out.println("obj1.color -> " + obj1.color);
        System.out.println("obj1.model -> " + obj1.model);

        Car obj2 = new Car("White", "Brezza");
        System.out.println("obj2.color -> " + obj2.color);
        System.out.println("obj2.model -> " + obj2.model);


        System.out.println("----------------------------------");
        System.out.println("Brand name for obj1 :- " + obj1.brandName);
        System.out.println("Brand name for obj2 :- " + obj2.brandName);

        obj2.brandName = "Maruthi Suzuki";

        System.out.println("----------------------------------");
        System.out.println("Brand name for obj1 :- " + obj1.brandName);
        System.out.println("Brand name for obj2 :- " + obj2.brandName);

    }
}
