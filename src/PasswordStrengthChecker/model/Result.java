package PasswordStrengthChecker.model;

import java.util.List;

public class Result {
    private String strength;
    private List<String> suggestions;

    public Result(String strength, List<String> suggestions) {
        this.strength = strength;
        this.suggestions = suggestions;
    }

    public String getStrength() {
        return strength;
    }

    public List<String> getSuggestions() {
        return suggestions;
    }
}