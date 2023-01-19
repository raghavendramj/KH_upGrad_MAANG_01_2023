package com.learning.basics;

class Test {
    public static void main(String[] args) {
        Login testLogin = new Login();
    }
}

class Login {

    //Hiding data member from outside world
    private String username;

    //Controlling -> getter and setter

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
