package com.learning.basics;


class Employee {
    float salary = 40000;

    public void printSalary() {
        System.out.println("Employee's salary is :- " + this.salary);
    }
}

class Programmer extends Employee {

    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        programmer.printSalary();
    }
}

public class SimpleInheritance {
}
