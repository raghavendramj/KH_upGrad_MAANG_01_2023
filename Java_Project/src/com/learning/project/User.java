package com.learning.project;

public class User {

    private String username;
    private int userId;

    private User followers[];
    private User following[];
    private User followRequests[];
    private Tweet myTweets[];

    //Parameterized Constructor -> Initialization
    public User(int userId, String username) {
        this.setUsername(username);
        this.userId = userId;
    }

    public User() {
    }

    public void init() {
        this.followers = new User[10];
        this.following = new User[10];
        this.followRequests = new User[10];
        this.myTweets = new Tweet[20];
    }

    //new User("Praveen") -> following -> new User("Virat"), new User("Rahul")

    //new User("Ravi") -> follower -> new User("Praveen")
    //new User("Saurabh") -> follower -> new User("Praveen")
    //new User("Raghav") -> follower -> new User("Praveen")

    //new User("Raghav") -> requested you -> new User("Praven");

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        if (username.length() < 6 || username.contains("~!@#$%^&*()_+")) {
            System.out.println("Invalid Username, Please follow username rules!");
            return;
        } else {
            this.username = username;
            System.out.println("Username " + username + " has been set successfully!");
        }
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", userId=" + userId +
                '}';
    }
}
