package chap_21.l_e_21_2;

import java.io.File;
import java.util.Scanner;
import java.util.TreeSet;
import java.io.FileNotFoundException;

public class TreeSetRemoveDuplicates {
    Scanner input;
    File textFile;
    TreeSet<String> mySet;
    String txt;

    TreeSetRemoveDuplicates(String file) {
        this.textFile = new File(file);
        mySet = new TreeSet<>();
        txt = "";

        readFromFile(textFile);
        createSet();

        for (String a : mySet) {
            System.out.print(a + " ");
        }
    }

    void readFromFile(File file) {
        try {
            input = new Scanner(file);

            while (input.hasNext()) {
                txt += input.nextLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        input.close();
    }

    void createSet() {
        for (String num : txt.split("[ \n\t\r.,;:!?(){]")) {
            mySet.add(num);
        }
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Enter file name!");
        }
        new TreeSetRemoveDuplicates(args[0]);
    }
}
