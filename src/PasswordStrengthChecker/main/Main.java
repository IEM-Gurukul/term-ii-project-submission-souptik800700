package PasswordStrengthChecker.main;

import java.util.Scanner;
import PasswordStrengthChecker.service.StrengthChecker;
import PasswordStrengthChecker.model.Result;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Password Strength Checker ===");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a password to check its strength (use letters, numbers, special characters):");
        String password = sc.nextLine();

if (password == null || password.trim().isEmpty()) {
    System.out.println("Error: Password cannot be empty or only spaces.");
    return;
}
}

        StrengthChecker checker = new StrengthChecker();
        Result result = checker.checkPassword(password);

       System.out.println("\nPassword Strength: " + result.getStrength());

        if (!result.getSuggestions().isEmpty()) {
            System.out.println("Suggestions:");
            for (String s : result.getSuggestions()) {
                System.out.println("- " + s);
            }
        } else {
            System.out.println("Good password!");
        }
    }
}