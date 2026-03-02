package com.lpu.service;

import java.util.Scanner;

public class AuthService {

    public static String login(){

        Scanner sc = new Scanner(System.in);

        int attempts = 3;

        while(attempts > 0){

            System.out.print("Username: ");
            String user = sc.next();

            System.out.print("Password: ");
            String pass = sc.next();

            if(user.equals("admin") && pass.equals("root"))
                return "ADMIN";

            if(user.equals("staff") && pass.equals("123"))
                return "STAFF";

            attempts--;

            System.out.println("Invalid credentials. Attempts left: " + attempts);
        }

        System.out.println("Account locked!");
        System.exit(0);

        return null;
    }
}

