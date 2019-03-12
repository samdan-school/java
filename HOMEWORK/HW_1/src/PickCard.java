public class PickCard {
    public final String[] SUIT = {"Clubs", "Diamonds", "Hearts", "Spades"};
    public final String[] RANK = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    public int guess;

    public PickCard(int guess) {
        if (validateGuess(guess)) {
            int suit = pickSuit();
            int rank = pickRank();
            System.out.println("The card you picked is " + SUIT[suit] + " of " + RANK[rank]);
        } else {
            System.out.println("Enter number between 1 to 52");
        }
    }

    boolean validateGuess(int guess) {
        return guess > 0 && guess < 53;
    }

    int pickSuit() {
        return (int) Math.random() * this.SUIT.length;
    }

    int pickRank() {
        return (int) Math.random() * this.RANK.length;
    }

    public static void main(String[] args) {
        new PickCard(45);
    }
}
