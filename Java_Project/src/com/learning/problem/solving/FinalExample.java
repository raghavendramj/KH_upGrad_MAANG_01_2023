package com.learning.problem.solving;

class Animal {
    String foodType = "TestAnimal";

    void eat(String food) {
        System.out.println("Animal eats");
    }

    void move(String location) {
        System.out.println("Animal eats");
    }
}

class Tiger extends Animal {
}

public class FinalExample {

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.eat("Grass");

    }
}
