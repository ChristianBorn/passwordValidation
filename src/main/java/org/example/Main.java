package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(passwordInput("asdasdasdF1"));
    }
    public static boolean passwordInput(String password) {
        if  (!password.matches((".*[A-Z].*"))) {
            System.out.println("Passwort enthält keine Großbuchstaben!");
            return false;
        }
        else if  (!password.matches((".*[a-z].*"))) {
            System.out.println("Passwort enthält keine kleinbuchstaben!");
            return false;
        }
        else if (!password.matches(".*[0-9].*")) {
            System.out.println("Passwort enthält keine Zahlen!");

            return false;
        }
        else if (password.length() < 8) {
            System.out.println("Passwort ist zu kurz!");

            return false;
        }
        else if (password.length() > 100) {
            System.out.println("Passwort ist viel zu lang!");
            return false;
        }
        else return true;
    }
}