package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(passwordInput("asdfsdfsd1"));
    }
    public static boolean passwordInput(String password) {
        if  (!password.matches((".*[A-Z].*"))) {
            System.out.println("passwort enthält keine Großbuchstaben");
            return false;
        }
        else if (!password.matches(".*[0-9].*")) {
            return false;
        }
        else if (password.length() < 8) {
            return false;
        }
        else return password.length() <= 100;

    }
}