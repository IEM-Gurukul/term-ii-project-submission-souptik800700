package PasswordStrengthChecker.service;

import java.util.*;
import PasswordStrengthChecker.rules.*;
import PasswordStrengthChecker.model.Result;

public class StrengthChecker {

    private List<Rule> rules;

    public StrengthChecker() {
        rules = new ArrayList<>();

        rules.add(new LengthRule());
        rules.add(new UppercaseRule());
        rules.add(new NumberRule());
        rules.add(new SpecialCharRule());
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

        if (score <= 1) strength = "Weak";
        else if (score <= 3) strength = "Medium";
        else strength = "Strong";

        return new Result(strength, suggestions);
    }
}