package PasswordStrengthChecker.rules;

public abstract class Rule {
    protected String message;

    public Rule(String message) {
        this.message = message;
    }

    public abstract boolean validate(String password);

    public String getMessage() {
        return message;
    }
}