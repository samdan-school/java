public class CheckPassword {
    String password;

    boolean checkLength(String password) {
        return password.length() >= 8;

    }

    boolean checkChars(String password) {
        return ! password.matches(".*(\\W).*");
    }

    boolean checkTwoDigits(String password) {
        int count = 0;
        boolean state = false;
        for (char a : password.toCharArray()) {
            if (Character.isDigit(a))
                count++;
            if (count >= 2) {
                state = true;
                return state;
            }
        }
        return state;
    }

    CheckPassword(String password) {
        this.password = password;

        if (checkLength(this.password) && checkChars(this.password) && checkTwoDigits(this.password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }

    public static void main(String args[]) {
        new CheckPassword("!sam!dan123");
    }
}
