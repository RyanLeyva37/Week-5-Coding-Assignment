package com.promineo.ryanleyva1.week5;

public class App {

    public static void main(String[] args){
        Logger asteriskLogger =  new AsteriskLogger();
        Logger spacedLogger = new SpacedLogger();
        asteriskLogger.log("This is for fun");
        System.out.println(""); //Console Formatting
        asteriskLogger.error("I hate errors");
        System.out.println(""); //Console Formatting
        spacedLogger.log("Wow crazy text omg");
        System.out.println(""); //Console Formatting
        spacedLogger.error("I hate errors");

    }

}
