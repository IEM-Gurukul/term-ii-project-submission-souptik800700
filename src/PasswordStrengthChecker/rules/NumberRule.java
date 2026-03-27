package PasswordStrengthChecker.rules;

public class NumberRule extends Rule {

    public NumberRule() {
        super("Password must contain at least one number");
    }

    @Override
    public boolean validate(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) return true;
        }
        return false;
    }
}