package com.learning.basics;

//Reusability
class BiCycle {
    public int speed; //instance variable!

    public BiCycle(int speed) {
        this.speed = speed;
    }

    public void applyBrake() {
        this.speed = 0;
        System.out.println("BiCycle stopped! and speed is :- " + this.speed);
    }

    public void peddleUpCycle(int increaseSpeed) {
        this.speed = this.speed + increaseSpeed;
        System.out.println("BiCycle peddled up! and speed is :- " + this.speed);
    }
}

//Inheritance -> extends and implements
//extends -> inherits 2 methods and 1 variable
class GearCycle extends BiCycle {

    int noOfGears;

    public GearCycle(int speed, int noOfGears) {
        super(speed);
        this.noOfGears = noOfGears;
    }

    public static void main(String[] args) {
        GearCycle biCycle1 = new GearCycle(10, 4);
        System.out.println("biCycle1 -> gears :- " + biCycle1.noOfGears);
        System.out.println("biCycle1 -> speed :- " + biCycle1.speed);
    }
}

public class Inheritance {
}
