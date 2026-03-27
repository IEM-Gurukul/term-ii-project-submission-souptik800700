package PasswordStrengthChecker.rules;

public class UppercaseRule extends Rule {

    public UppercaseRule() {
        super("Password must contain at least one uppercase letter");
    }

    @Override
    public boolean validate(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) return true;
        }
        return false;
    }
}