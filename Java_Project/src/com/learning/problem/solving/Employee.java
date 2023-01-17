package com.learning.problem.solving;

public class Employee {

    int empId = 12;  //Constant
    String name;

    public Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    public Employee() {
        System.out.println("This is default constructor");
    }

    public static void main(String[] args) {
        Employee obj1 = new Employee(1, "Ravi");
        obj1.printDetails();

        Employee obj2 = new Employee(2, "Ramesh");
        obj2.printDetails();

        Employee obj3 = new Employee();
        obj3.printDetails();

        Employee obj4 = new Employee(12, "Ram");
        System.out.println(obj2);

    }

    void printDetails() {
        System.out.println("----------------------------------------");
        System.out.println("This is my obj1.empId :- " + this.empId);
        System.out.println("This is my obj1.name :- " + this.name);
    }
}





