package com.learning.problem.solving;

public class PatternPrint {

    static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(4);

        AccessModifiers obj1 = new AccessModifiers();
        obj1.defaultSubtract(12, 4);
        obj1.publicDivide(12, 4);
    }
}
