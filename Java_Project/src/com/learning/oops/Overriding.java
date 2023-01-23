package com.learning.oops;


class Alexa {
    public void greeting(String userName) {
        System.out.println("Hello " + userName + "!, How are you today? ");
    }
}

class AlexaIndia extends Alexa {
    public void greeting(String userName) {
        System.out.println("Namaste " + userName + "!, Aaaj aap kaise hoo? ");
    }
}

class AlexaFrance extends Alexa {
    public void greeting(String userName) {
        System.out.println("Bonjour " + userName + "! Passe une bonne journee? ");
    }
}


public class Overriding {

    public static void main(String[] args) {
        Alexa alexa = new Alexa();
        alexa.greeting("Richard");

        AlexaIndia alexaIndia = new AlexaIndia();
        alexaIndia.greeting("Narendra Modi");

        AlexaFrance alexaFrance = new AlexaFrance();
        alexaFrance.greeting("Mbappe");
    }

}
