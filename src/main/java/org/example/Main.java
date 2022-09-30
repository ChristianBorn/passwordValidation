package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public static boolean passwordInput(String password) {
        if (password.length() < 8) {
            return false;
        }
        else return password.length() <= 100;
    }
}