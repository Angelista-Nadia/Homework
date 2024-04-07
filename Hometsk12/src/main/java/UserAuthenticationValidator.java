public class UserAuthenticationValidator {
    public static boolean validateUser(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        if (login.length() >= 20 || login.contains(" ")) {
            throw new WrongLoginException("Invalid login format");
        }
        if (password.length() >= 20 || password.contains(" ") || !password.matches(".*\\d.*") || !password.equals(confirmPassword)) {
            throw new WrongPasswordException("Invalid password format");
        }
        return true;
    }
}
