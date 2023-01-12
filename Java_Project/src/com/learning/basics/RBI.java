package com.learning.basics;

//By default all the methods are public abstract
public interface RBI {
    double withdraw(int accNum, double amount);
    boolean deposit(int accNum, double amount);
    double checkBalance(int accNum);
}

class HDFC implements  RBI{
    public double withdraw(int accNum, double amount) {
        return 0;
    }
    public boolean deposit(int accNum, double amount) {
        return false;
    }
    public double checkBalance(int accNum) {
        return 0;
    }
}

class ICICI implements RBI{
    public double withdraw(int accNum, double amount) {
        return 0;
    }
    public boolean deposit(int accNum, double amount) {
        return false;
    }
    public double checkBalance(int accNum) {
        return 0;
    }
}

