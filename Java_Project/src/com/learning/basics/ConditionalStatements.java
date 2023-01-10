package com.learning.basics;


public class ConditionalStatements {





    public static void timeCheck(int time) {

        System.out.print("Now the time is :- " + time);


        if (time < 8) {
            System.out.println("... Good Morning!");
        } else if (time < 14) {
            System.out.println("... Good Afternoon!");
        } else if (time < 20) {
            System.out.println("... Good Evening!");
        } else {
            System.out.println("... Good Night!");
        }
    }

    public static void nestedIfExample(char eachChar) {
        //A -> 65, z -> 122
        if (eachChar >= 65 && eachChar <= 122) {
            System.out.println(eachChar + " is an alphabet!");

            if (eachChar >= 65 && eachChar < 97) {
                System.out.println(eachChar + " is a UPPERCASE Alphabet!");
            } else {
                System.out.println(eachChar + " is a lowercase Alphabet!");
            }

        } else {
            System.out.println(eachChar + " is not an alphabet!");
        }
    }

    public static void printWeekDay(int number) {

//        if (number == 0) {
//            System.out.println("Sunday");
//        } else if (number == 1) {
//            System.out.println("Monday");
//        } else if (number == 2) {
//            System.out.println("Tuesday");
//        } else if (number == 3) {
//            System.out.println("Wednesday");
//        } else if (number == 4) {
//            System.out.println("Thursday");
//        } else if (number == 5) {
//            System.out.println("Friday");
//        } else if (number == 6) {
//            System.out.println("Saturday");
//        } else {
//            System.out.println("Invalid day!");
//        }

        //This is replacement for multiple if else statements

        String day = "";
        switch (number) {
            case 0:
                day = "Sunday";
                break;
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            default:
                day = "Invalid Day!";
                break;
        }

        System.out.println("The day is :- " + day);

    }


    public static void main(String[] args) {


        printWeekDay(4);
        printWeekDay(2);
        printWeekDay(6);
        printWeekDay(3);
        printWeekDay(13);
        printWeekDay(7);

//        nestedIfExample('A');
//        nestedIfExample('a');
//        nestedIfExample('$');

//        timeCheck(2);
//        timeCheck(10);
//        timeCheck(15);
//        timeCheck(25);
//        timeCheck(17);

//        ConditionalStatements object = new ConditionalStatements();
//        boolean isValidName = object.validateName("RaghavendraMJ");
//        System.out.println("1. Is Name Valid :- " + isValidName);
//
//        System.out.println("\n -------------------------------------");
//
//        isValidName = object.validateName("Raghav");
//        System.out.println("2. Is Name Valid :- " + isValidName);
    }

    public boolean validateName(String name) {
        int lengthOfName = name.length();
        System.out.println("Length of the name is :- " + lengthOfName);

        if (lengthOfName > 8) {
            //System.out.println("Invalid Name, length should be less than 8 characters!");
            return false;
        } else {
            //System.out.println("Valid Name!");
            return true;
        }
    }

}
