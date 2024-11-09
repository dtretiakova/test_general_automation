package examplesTasksWithStringMethods;


public class PasswordValidator {

    private static final int MIN_LENGTH = 8;
    private static final int MAX_LENGTH = 32;

    public boolean isPasswordValid(String newPassword, String name, String oldPassword) {
        return isLengthOfPasswordValid(newPassword) && isEqualsToOldPassword(newPassword, oldPassword) &&
                isPasswordContainsNameOfUser(newPassword, name) && isPasswordContainsSpecialSymbols(newPassword) &&
                isPasswordContainsUpperCaseLetter(newPassword);
    }


    private boolean isLengthOfPasswordValid(String newPassword) {
        if (newPassword.length() >= MIN_LENGTH && newPassword.length() <= MAX_LENGTH) {
            return true;
        } else {
            throw new InvalidPasswordException("Your password length should be no less than 8 symbols and bigger than 32 symbols");
        }
    }

    private boolean isEqualsToOldPassword(String newPassword, String oldPassword) {
        if (!newPassword.equals(oldPassword)) {
            return true;
        } else {
            throw new InvalidPasswordException("Your password cant equals your old password!");
        }
    }

    private boolean isPasswordContainsNameOfUser(String newPassword, String name) {
        if (!newPassword.contains(name)) {
            return true;
        } else {
            throw new InvalidPasswordException("Your password contains sensitive information, your name.");
        }
    }

    private boolean isPasswordContainsUpperCaseLetter(String newPassword) {
        for (char c : newPassword.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        throw new InvalidPasswordException("Your password should contain at least one upper case letter.");
    }

    private boolean isPasswordContainsSpecialSymbols(String newPassword) {
        for (char c : newPassword.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                return true; // Special symbol found
            }
        }
        throw new InvalidPasswordException("Your password should contain at least one special symbol");
    }

}
