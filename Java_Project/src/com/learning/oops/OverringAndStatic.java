package com.learning.oops;

class Vehicle {
    public static String speedLimit() {
        System.out.println("Vehicle::speedLimit :- 60kmph");
        return "60kmph";
    }

    public void engine() {
        System.out.println("Make the vehicle move!");
    }
}

class Bike extends Vehicle {

    public static String speedLimit() {
        System.out.println("Bike::speedLimit :- 50kmph");
        return "50kmph";
    }

    public void engine() {
        System.out.println("This is a bike engine, and it exiting to drive!");
    }
}

class Car extends Vehicle {
    public void engine() {
        System.out.println("This is a Car engine, and it Safe/Cool to drive!");
    }
}

public class OverringAndStatic {
    public static void main(String[] args) {
        Bike.speedLimit();
        Vehicle.speedLimit();
    }
}
