package HW_4.e_11_13;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void removeDuplicate(ArrayList<Integer> list) {
        ArrayList<Integer> tempList = new ArrayList<>();

        for (Integer num : list) {
            if (tempList.contains(num))
                continue;
            tempList.add(num);
        }

        System.out.print("The distinct integers are ");
        for (int num : tempList) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        removeDuplicate(new ArrayList<>(Arrays.asList(34, 5, 3, 5, 6, 4, 33, 2, 2, 4)));
    }
}
