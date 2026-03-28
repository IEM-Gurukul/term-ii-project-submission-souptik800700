package PasswordStrengthChecker.main;

import PasswordStrengthChecker.model.Result;
import PasswordStrengthChecker.service.StrengthChecker;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Password Strength Checker ===");

        while (true) {
            System.out.print("Enter password: ");
            String password = sc.nextLine();

            if (password.equalsIgnoreCase("exit")) {
                System.out.println("Exiting program...");
                break;
            }

            if (password == null || password.trim().isEmpty()) {
                System.out.println("Error: Password cannot be empty.");
                continue;
            }

            StrengthChecker checker = new StrengthChecker();
            Result result = checker.checkPassword(password);

            System.out.println("\nPassword Strength: " + result.getStrength());

            if (!result.getSuggestions().isEmpty()) {
                System.out.println("\nSuggestions to improve:");
                for (String s : result.getSuggestions()) {
                    System.out.println("• " + s);
                }
            } else {
                System.out.println("Good password!");
            }

            System.out.println("\nType 'exit' to quit or press Enter to continue.");
        }

        sc.close();
    }
}