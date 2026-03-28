package PasswordStrengthChecker.service;

import PasswordStrengthChecker.model.Result;
import PasswordStrengthChecker.rules.*;
import java.util.*;

public class StrengthChecker {

    private List<Rule> rules;

    public StrengthChecker() {
        rules = new ArrayList<>();

        rules.add(new LengthRule());
        rules.add(new UppercaseRule());
        rules.add(new NumberRule());
        rules.add(new SpecialCharRule());
        rules.add(new LowercaseRule());
    }

    public Result checkPassword(String password) {
        int score = 0;
        List<String> suggestions = new ArrayList<>();

        for (Rule rule : rules) {
            if (rule.validate(password)) {
                score++;
            } else {
                suggestions.add(rule.getMessage());
            }
        }

        String strength;

if (password.length() < 6) {
    strength = "Very Weak";
} else if (score <= 1) {
    strength = "Weak";
} else if (score <= 3) {
    strength = "Medium";
} else {
    strength = "Strong";
}
if (password.length() > 12 && score >= 4) {
    strength = "Very Strong";
}

        return new Result(strength, suggestions);
    }
}