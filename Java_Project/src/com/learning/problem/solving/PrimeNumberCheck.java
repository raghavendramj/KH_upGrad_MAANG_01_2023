package com.learning.problem.solving;

public class PrimeNumberCheck {

    static boolean isPrimeNumber(int number) {
        if (number < 2) {
            return false;
        }
        if (number <= 3) {
            return true;
        }

        boolean isPrime = true;

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("Given number " + number + " is a prime number ");
        } else {
            System.out.println("Given number " + number + " is NOT a prime number ");
        }
        return isPrime;
    }


    public static void main(String[] args) {
        isPrimeNumber(4);
        isPrimeNumber(5);
        isPrimeNumber(9);
        isPrimeNumber(12);
        isPrimeNumber(45);
        isPrimeNumber(47);
    }
}
