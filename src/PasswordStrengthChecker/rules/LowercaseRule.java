package PasswordStrengthChecker.rules;

public class LowercaseRule extends Rule {

    public LowercaseRule() {
        super("Password must contain at least one lowercase letter");
    }

    @Override
    public boolean validate(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) return true;
        }
        return false;
    }
}