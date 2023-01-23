package com.learning.oops;

class Employee {
    double salary;

    public Employee(double salary) {
        this.salary = salary;
    }
}

class FullTimeEmployee extends Employee {
    double bonus = 10000;

    public FullTimeEmployee(double salary, double bonus) {
        super(salary);
        this.bonus = bonus;
    }
}

class Contractor extends Employee {
    double allowance = 5000;

    public Contractor(double salary, double allowance) {
        super(salary);
        this.allowance = allowance;
    }
}

public class HierachicalInheritence {

    public static void main(String[] args) {
        FullTimeEmployee fte1 = new FullTimeEmployee(50000, 10000);
        System.out.println("FTE1 -> fte1.salary :- " + fte1.salary);
        System.out.println("FTE1 -> fte1.bonus :- " + fte1.bonus);

        Contractor contractor = new Contractor(45000, 5000);
        System.out.println("Contractor -> contractor.salary :- " + contractor.salary);
        System.out.println("Contractor -> contractor.allowance :- " + contractor.allowance);


    }
}
