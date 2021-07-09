package com.promineo.ryanleyva1.week5;

public class SpacedLogger implements Logger{
    @Override
    public void log(String message) {
        String newMessage = "";
        char[] array = message.toCharArray();
        for(int i = 0; i < message.length(); i++){
            newMessage += array[i]+" ";
        }
        System.out.println(newMessage);
    }

    @Override
    public void error(String error) {
        String newMessage = "";
        char[] array = error.toCharArray();
        for(int i = 0; i < error.length(); i++){
            newMessage += array[i] + " ";
        }
        System.out.println("ERROR: " + newMessage);
    }
}
