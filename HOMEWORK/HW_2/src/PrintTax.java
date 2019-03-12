public class PrintTax {
    static double nextGuess;
    static double lastGuess = Math.random() + 0.0002 * 100;
    static double diff = 1;

    public static double sqrt(long n) {
        nextGuess = (lastGuess + n / lastGuess) / 2;
        if (Math.abs(nextGuess - lastGuess) <= 0.0001) {
            return nextGuess;
        } else {
            lastGuess = nextGuess;
            return sqrt(n);
        }
    }

    public static void main(String args[]) {
        System.out.println(sqrt(1000));
    }
}
