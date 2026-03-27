package PasswordStrengthChecker.rules;

public class LengthRule extends Rule {

    public LengthRule() {
        super("Password must be at least 8 characters long");
    }

    @Override
    public boolean validate(String password) {
        return password.length() >= 8;
    }
}