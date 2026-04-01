package com.example.cencept;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LoginValidator {

    // Simple in-memory username-password store
    private Map<String, String> userDatabase;

    public LoginValidator() {
        userDatabase = new HashMap<>();
        // Predefined users
        userDatabase.put("john", "12345");
        userDatabase.put("alice", "password");
        userDatabase.put("admin", "admin");
    }

    // Method to validate login
    public boolean validate(String username, String password) {
        if(userDatabase.containsKey(username)) {
            return userDatabase.get(username).equals(password);
        }
        return false;
    }

    // Main method to test
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LoginValidator validator = new LoginValidator();

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if(validator.validate(username, password)) {
            System.out.println("Login successful! Welcome " + username);
        } else {
            System.out.println("Invalid username or password!");
        }

        scanner.close();
    }
}