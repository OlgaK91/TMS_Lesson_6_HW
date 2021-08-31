public class Task1 {
    public static void main(String[] args) {
        String login = "12313516 ";
        String password = "13135313 ";
        String confirmPassword = "131351313";
        if (checkValidity(login, password, confirmPassword)) {
            System.out.println("Check passed");
        } else {
            System.out.println("Check failed");
        }
    }

    public static boolean checkValidity(String login, String password, String confirmPassword) {
        boolean verificationPassed = true;
        try {
            try {
                if (login.length() >= 20 || login.contains(" ")) {
                    verificationPassed = false;
                    throw new WrongLoginException("Login length should be less than 20 and login can't contain blanks");
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            if (password.length() >= 20 || password.contains(" ") || !password.matches(".*[0-9].*") || !password.equals(confirmPassword)) {
                verificationPassed = false;
                throw new WrongPasswordException("Password length should be less than 20 and login can't contain blanks. Confirm password should be equal to password");
            }
        } catch (WrongPasswordException e) {
            System.out.println(e.getMessage());

        }
        return verificationPassed;

    }
}
