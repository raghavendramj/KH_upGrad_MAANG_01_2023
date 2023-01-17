package com.learning.problem.solving;

public class Student {

    //Constructor Rules
    // No return type
    // Same name as class name

    //Default constructor
    //Case 1
    // No default constructor is specified! -> System gives the default constructor

    //Instance variables
    int studentId;
    String name;
    //Case 2
    public Student() {
        System.out.println("This is my default constructor!");
    }

    //Parameterized Constructor
    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    //A static method ->shared across all the objects
    public static void printDetails(Student student) {
        System.out.println("object3.studentId :- " + student.studentId);
        System.out.println("object3.name :- " + student.name);
        System.out.println("--------------------------------------------");
    }

    public static void main(String[] args) {

        //Case 1:
        //Student object1 = new Student(); //Default constructor -> Implicit!
        //System.out.println("object1 :- " + object1);
        System.out.println("--------------------------------------------");

        //Case 2
        Student object2 = new Student(); //Default constructor -> Explicit!
        System.out.println("object2 :- " + object2);

        System.out.println("object2.studentId :- " + object2.studentId);
        System.out.println("object2.name :- " + object2.name);
        System.out.println("--------------------------------------------");

        //Case 3
        Student object3 = new Student(12, "Vishal"); //Parameterized constructor -> Explicit!

        System.out.println("object3.studentId :- " + object3.studentId);
        System.out.println("object3.name :- " + object3.name);
        System.out.println("--------------------------------------------");


        Student object4 = new Student(34, "Rahul"); //Parameterized constructor -> Explicit!
        System.out.println("object4.studentId :- " + object4.studentId);
        System.out.println("object4.name :- " + object4.name);

        object3.name = "Rishabh";

        System.out.println("--------------------------------------------");
        System.out.println("object3.studentId :- " + object3.studentId);
        System.out.println("object3.name :- " + object3.name);
    }

    //A normal instance method -> allocated for every object
    public int add(int a, int b) {
        return a + b;
    }
}
