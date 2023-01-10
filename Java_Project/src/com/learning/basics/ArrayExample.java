package com.learning.basics;

public class ArrayExample {

    public static void printArrayElements(int arr[]) {

        System.out.println("Contents of array are...");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = new int[5];

        arr[0] = 11;
        arr[1] = 32;
        arr[2] = 25;
        arr[3] = 25;
        arr[4] = 89;
        //arr[5] = 56; //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
        printArrayElements(arr);
    }

}
