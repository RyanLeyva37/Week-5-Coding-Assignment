package com.promineo.ryanleyva1.week5;

public class AsteriskLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println("***" + message + "***");
    }

    @Override
    public void error(String error) {

        String stars = "";
        for(int i = 1; i < error.length()+7; i++){
            stars+= "*";
        }
        System.out.println("*******" + stars);
        System.out.println("***" +  "Error: " + error + "***");
        System.out.println("*******" + stars);

    }


}
