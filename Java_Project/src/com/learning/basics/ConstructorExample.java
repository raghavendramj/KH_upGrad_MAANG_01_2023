package com.learning.basics;

public class ConstructorExample {

    // Constructor
    //1. No return type
    //2. Same name as class

    //Default constructor
    public ConstructorExample() {
        System.out.println("This is default constructor");
    }

    int empId;
    String empName;

    //Parameterized constructor
    public ConstructorExample(int id, String name ) {
        //this refers to current object you are creating -> obj1, obj2....
        this.empId = id; // initialisation
        this.empName = name; // initialisation
        System.out.println("This is Parameterized constructor");
    }

    public static void main(String[] args) {
        ConstructorExample obj1 = new ConstructorExample();
        System.out.println("obj1.empId -> "+ obj1.empId);
        System.out.println("obj1.empName -> "+ obj1.empName);

        ConstructorExample obj2 = new ConstructorExample(10, "Messi");
        System.out.println("obj2.empId -> "+ obj2.empId);
        System.out.println("obj2.empName -> "+ obj2.empName);

        //1. ConstructorExample -> Reference Type
        //2. cons -> Reference Variable
        //3. new -> Fetch the memory from the heap
        //4. ConstructorExample() -> initialize the object!

    }
}
