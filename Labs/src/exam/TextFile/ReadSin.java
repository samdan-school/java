package exam.TextFile;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadSin {

    File sinFile;
    File inputFile;
    Scanner scanner;

    double[][] sinInfo;
    int[] inputInfo;

    ReadSin() {
        sinInfo = new double[360][2];
        sinFile = new File("/home/samdan/Desktop/School/2019_Spring/java/Labs/src/exam/sin.txt");
        inputFile = new File("/home/samdan/Desktop/School/2019_Spring/java/Labs/src/exam/input.txt");

        try {
            if (!sinFile.exists()) {
                return;
            }
            readFile();
            readInput();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        for (int i = 0; i < 360; i++) {
//            for (int j = 0; j < 2; j++) {
//                System.out.print(sinInfo[i][j] + " ");
//            }
//            System.out.println();
//        }

        for(int x : inputInfo) System.out.println("Untug: " + x + " " + sinInfo[x][1]);
    }

    void readFile() throws IOException {
        scanner = new Scanner(sinFile);

        for (int i = 0; i < 360; i++) {
            sinInfo[i][0] = scanner.nextDouble();
            sinInfo[i][1] = scanner.nextDouble();
        }

        scanner.close();
    }

    void readInput() throws IOException {
        scanner = new Scanner(inputFile);

        int length = scanner.nextInt();

        inputInfo = new int[length];

        for (int i = 0; i < length; i++) {
            inputInfo[i] = scanner.nextInt();
        }
    }

    public static void main(String[] args) {
        new ReadSin();
    }
}
