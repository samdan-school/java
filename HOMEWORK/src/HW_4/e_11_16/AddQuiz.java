package HW_4.e_11_16;

import java.util.ArrayList;
import java.util.Scanner;

public class AddQuiz {
    private ArrayList<Integer> oldAns;
    private int op1;
    private int op2;
    private int answer;

    public AddQuiz() {
        oldAns = new ArrayList<>();
        this.op1 = getRandomNumber();
        this.op2 = getRandomNumber();
        answer = op1 + op2;
        askAddition();
    }

    private void askAddition() {
        int userAns;
        Scanner input = new Scanner(System.in);

        System.out.println("What is " + op1 + " + " + op2 + "?");
        while((userAns = input.nextInt()) != answer) {
            if (oldAns.contains(userAns)) {
                System.out.println("You already entered " + userAns);
            } else {
                System.out.println("Wrong answer. Try again. What is " + op1 + " + " + op2 + "?");
                oldAns.add(userAns);
            }
        }
        System.out.println("You got it!");
    }

    private int getRandomNumber() {
        return (int) Math.round(Math.random() * 10);
    }


    public static void main(String[] args) {
        new AddQuiz();
    }
}
