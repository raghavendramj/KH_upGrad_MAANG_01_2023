package com.learning.oops;

//Abstraction is the process of hiding certain details and showing only essential information to the user.
//Abstraction can be achieved with either abstract classes or interfaces

abstract class Animal {
    public abstract void makeSound();

    public void sleep() {
        System.out.println("zZzZzZ!");
    }
}

//Inheritance + Overriding
class Dog extends Animal {
    public void makeSound() {
        System.out.println("Bow bow!");
    }
}

public class v2Abstraction {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
    }
}
