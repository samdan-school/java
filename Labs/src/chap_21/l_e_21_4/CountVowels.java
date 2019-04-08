package chap_21.l_e_21_4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class CountVowels {
    Scanner input;
    File textFile;
    List<Character> vowel = new ArrayList<>();
    List<Character> constant = new ArrayList<>();

    CountVowels(String file) {
        this.textFile = new File(file);

        readFromFile(textFile);
        createList();

        System.out.println(vowel.size());
        System.out.println(constant.size());
    }

    void readFromFile(File file) {
        try {
            String txt = "";
            input = new Scanner(file);


            while (input.hasNext()) {
                txt = input.next();
                for (int i = 0; i < txt.length(); i++) {
                    Character chart = txt.charAt(i);
                    if (Character.isAlphabetic(chart)) {
                        switch (Character.toLowerCase(chart)) {
                            case 'a':
                            case 'e':
                            case 'i':
                            case 'o':
                            case 'u':
                                vowel.add(chart);
                                break;
                            default:
                                constant.add(chart);
                                break;
                        }
                    }

                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        input.close();
    }

    void createList() {
    }

    public static void main(String[] args) {
//        if (args.length != 1) {
//            System.out.println("Enter file name!");
//        }
        new CountVowels("/home/samdan/Desktop/School/2019_Spring/java/Labs/src/chap_21/l_e_21_2/numbers.txt");
    }
}
