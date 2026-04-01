package com.example.cencept;

public class Studentgreet {

    public String getGreeting(String name) {
        return "Hello " + name + ", welcome to the Student System!";
    }

    public static void main(String[] args) {
        Studentgreet controller = new Studentgreet();
        String message = controller.getGreeting("John");
        System.out.println(message);
    }
}