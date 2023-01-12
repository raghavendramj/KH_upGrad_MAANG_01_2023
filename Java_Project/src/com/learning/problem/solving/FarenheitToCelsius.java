package com.learning.problem.solving;

public class FarenheitToCelsius {

    static float convertFahrenheitToCelsius(float fahrenheit) {
        System.out.println("--->  FAHRENHEIT -> CELSIUS");
        float celsius = ((fahrenheit - 32) * 5) / 9;
        System.out.println("Fahrenheit :- " + fahrenheit);
        System.out.println("Celsius :- " + celsius);
        return celsius;
    }

    static float convertCelsiusToFahrenheit(float celsius) {
        float fahrenheit = (celsius * 9) / 5 + 32;
        System.out.println("---> CELSIUS -> FAHRENHEIT");
        System.out.println("Fahrenheit :- " + fahrenheit);
        System.out.println("Celsius :- " + celsius);
        return celsius;
    }

    public static void main(String[] args) {
        convertFahrenheitToCelsius(32);
        convertFahrenheitToCelsius(212);

        convertCelsiusToFahrenheit(0);
        convertCelsiusToFahrenheit(100);
    }
}
