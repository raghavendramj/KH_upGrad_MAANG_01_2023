package com.learning.problem.solving;

public class Bird {

    String type;
    int flySpeed;

    public static void main(String[] args) {
        Bird bird1 = new Bird(); // default constructor
        bird1.flySpeed = 60;
        bird1.type = "Wild";

        System.out.println("-----------------------");
        System.out.println("Bird1 speed :- "+ bird1.flySpeed);
        System.out.println("Bird1 type :- "+ bird1.type);

        System.out.println("-----------------------");
        Bird bird2 = new Bird();
        System.out.println("Bird2 speed :- "+ bird2.flySpeed);
        System.out.println("Bird2 type :- "+ bird2.type);
    }
}
