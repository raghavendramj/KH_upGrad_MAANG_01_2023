package com.learning.oops;


abstract class HotBeverage {
    //They by default are public
    //They don't have body
    abstract String prepareHotBeverage(String []ingredients);

    //Normal methods
    public String serveBeverage() {
        return "prepared beverage";
    }
}

class Coffee extends HotBeverage{
    public static void main(String[] args) {
        HotBeverage hotBeverage = new Coffee();
        hotBeverage.prepareHotBeverage(new String[10]);
    }

    @Override
    String prepareHotBeverage(String[] ingredients) {
        System.out.println("Preparing hot cup of coffee!");
        return "Coffee";
    }
}

abstract class RBIBank{
    abstract int withdraw(int amount);
}

class ICICIBank extends RBIBank{
    int balance = 1000;

    int withdraw(int amount) {
        balance -= amount;
        System.out.println("This is special experience of ICICI Bank");
        return balance;
    }
}



public class Abstraction {
}
