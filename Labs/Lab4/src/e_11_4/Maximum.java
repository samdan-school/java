package e_11_4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Maximum {
    private ArrayList<Integer> list;

    public Maximum() {
        list = new ArrayList<>();

        importList();

        System.out.println("Max element is " + max(list));
    }

    void importList() {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Enter element or press 0 to exit!");
        while ((number = input.nextInt()) != 0) {
            list.add(number);
        }
    }

    public static Integer max(ArrayList<Integer> list) {
        int max = 0;
        if (!list.isEmpty()) {
            max = Collections.max(list);
        }
        return max;
    }

    public static void main(String[] args) {
        new Maximum();
    }
}
