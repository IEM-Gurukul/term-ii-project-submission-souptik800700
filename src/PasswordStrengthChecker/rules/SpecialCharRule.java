package PasswordStrengthChecker.rules;

public class SpecialCharRule extends Rule {

    public SpecialCharRule() {
        super("Password must contain at least one special character");
    }

    @Override
    public boolean validate(String password) {
        return password.matches(".*[^a-zA-Z0-9].*");
    }
}