package com.learning.project;

public class Twitter {

    public static void main(String[] args) {

        User obj1 = new User();
        String username = obj1.getUsername();
        System.out.println("Username of obj1 :- " + username);

        System.out.println("----------------------------");
        obj1.setUsername("raghav");
        username = obj1.getUsername();
        System.out.println("Username of obj1 :- " + username);


        User[] myUsers = new User[5]; //The array of user objects

        User virat = new User(); //object creation
        virat.setUsername("Virat Kohli");  //set name of the user

        myUsers[0] = virat; //adding user kohli to 0th index

        User rahul = new User(); //object creation
        rahul.setUsername("KL Rahul");  //set name of the user

        myUsers[1] = rahul; //adding user kohli to 1st index

        for (int i = 0; i < 2; i++) {
            User myUser = myUsers[i];
            System.out.println("User :- "+ myUser.getUsername());
        }
    }
}
