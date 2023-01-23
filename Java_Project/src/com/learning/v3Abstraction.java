package com.learning;

interface Animal {
    void makeSound();
}

//Inheritance + Overriding
class Dog implements Animal {
    public void makeSound() {
        System.out.println("Bow bow!");
    }
}

public class v3Abstraction {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
    }
}
