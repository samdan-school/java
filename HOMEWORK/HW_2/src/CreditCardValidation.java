public class CreditCardValidation {
    /**
     * Return true if the card number is valid
     */
    public static boolean isValid(long number) {
        boolean state = false;
        int[] prefixes = {4, 5, 37, 6};
        int prefixMatches = 0;
        if (((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10) == 0 && (getSize(number) >= 13 && getSize(number) <= 16)) {
            state = true;
        }

        for (final int prefix : prefixes) {
            if (prefixMatched(number, prefix)) {
                prefixMatches++;
            }
        }

        if (prefixMatches > 0) state = true;
        else state = false;


        return state;
    }

    /**
     * Get the result from Step 2
     */
    public static int sumOfDoubleEvenPlace(long number) {
        int total = 0;
        while (number != 0) {
            number /= 10;
            total += getDigit((int) (number % 10));
            number /= 10;
        }
        return total;
    }

    /**
     * Return this number if it is a single digit, otherwise,
     * return the sum of the two digits
     */
    public static int getDigit(int number) {
        int doubledNumber = number * 2;
        if (doubledNumber >= 10) {
            doubledNumber = doubledNumber / 10 + doubledNumber % 10;
        }
        return doubledNumber;
    }

    /**
     * Return sum of odd-place digits in number
     */
    public static int sumOfOddPlace(long number) {
        int total = 0;
        while (number != 0) {
            total += (int) (number % 10);
            number /= 100;
        }
        return total;
    }

    /**
     * Return true if the digit d is a prefix for number
     */
    public static boolean prefixMatched(long number, int d) {
        int checkLength = Integer.toString(d).length();
        return getPrefix(number, checkLength) == d;
    }

    /**
     * Return the number of digits in d
     */
    public static int getSize(long d) {
        int size = 0;
        while (d != 0) {
            d /= 10;
            size++;
        }
        return size;
    }

    /**
     * Return the first k number of digits from number. If the
     * number of digits in number is less than k, return number.
     */
    public static long getPrefix(long number, int k) {
        long prefix = 0;
        int numberDigits = Long.toString(number).length();

        if (numberDigits > k) {
            prefix = Integer.parseInt(Long.toString(number).substring(0, k));
        } else {
            prefix = number;
        }
        return prefix;
    }

    public static void main(String args[]) {
        // 4388576018410707L
        // 4388576018402626L
        long number = 4388576018410707L;
        if (isValid(number)) {
            System.out.println(number + " is valid");
        } else {
            System.out.println(number + " is not valid");
        }
    }
}
