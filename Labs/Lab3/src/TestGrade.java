import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class TestGrade {
    TestGrade() {
        int[] grades = new int[100];
        int[] count = new int[4];
        File file = new File("E:\\src\\grades.txt");

        if (!enterGrades(file)) return;

        if (!file.exists()) {
            System.out.println("Source file does not exist");
            System.exit(0);
        }

        if (!readGrades(file, grades)) return;

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] >= 90 && grades[i] <= 100)
                count[0]++;
            else if (grades[i] >= 80 && grades[i] < 90)
                count[1]++;
            else if (grades[i] >= 70 && grades[i] < 80)
                count[2]++;
            else if (grades[i] >= 60 && grades[i] < 70)
                count[3]++;
        }

        Arrays.sort(count);
        System.out.printf("%3s %3s %3s %3s\n", "A", "B", "C", "D" );
        System.out.printf("%3d %3d %3d %3d", count[0], count[1], count[2], count[3]);
    }

    boolean enterGrades(File file) {
        boolean state = true;
        try {
            PrintWriter print = new PrintWriter(file);
            for (int i = 0; i < 100; i++) {
                print.println((int) Math.round(60 + Math.random() * 40));
            }
            print.close();
        } catch (FileNotFoundException e) {
            state = false;
        }
        return state;
    }

    boolean readGrades(File file, int[] grades) {
        boolean state = true;
        try {
            Scanner input = new Scanner(file);
            for (int i = 0; i < grades.length; i++) {
                grades[i] = input.nextInt();
            }
        } catch (FileNotFoundException e) {
            state = false;
        }
        return state;
    }

    public static void main(String[] agrc) {
        new TestGrade();
    }
}
