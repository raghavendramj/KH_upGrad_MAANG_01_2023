package com.learning.oops;

class Shape{

    int sides;

    public Shape(int sides) {
        this.sides = sides;
    }

    public void display(){
        System.out.println("This is display() of Shape!");
    }
}
class Square extends Shape{

    int length;
    int width;

    public Square(int sides, int length, int width) {
        super(sides);
        this.length = length;
        this.width = width;
    }

    public void area(){
        System.out.println("Inside area() of Square");
    }
}
class Cube extends Square{

    int height;

    public Cube(int sides, int length, int width, int height) {
        super(sides, length, width);
        this.height = height;
    }

    public void volume(){
        System.out.println("Inside volume() of Cube");
    }
}

public class MultiLevelInheritence {

    public static void main(String[] args) {
        Cube cube  = new Cube(4, 10, 23, 45);
        cube.volume();
        cube.area();
        cube.display();

        System.out.println("sides= " + cube.sides);
        System.out.println("length= " + cube.length);
        System.out.println("width= " + cube.width);
        System.out.println("height= " + cube.height);
    }
}
