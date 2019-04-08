package exam.TextFile;

import java.io.*;

public class ReadSerial {
    ObjectInputStream objectInputStream;
    File sin2dat;
    double[][] sin2Info;

    ReadSerial() {
        sin2dat = new File("/home/samdan/Desktop/School/2019_Spring/java/Labs/src/exam/sin2.dat");

        try {
            if (!sin2dat.exists()) {
                sin2dat.createNewFile();
            }
            readFileSerial();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 360; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(sin2Info[i][j] + " ");
            }
            System.out.println();
        }
    }

    void readFileSerial() throws IOException, ClassNotFoundException {
        objectInputStream = new ObjectInputStream(new FileInputStream(sin2dat));

        sin2Info = (double[][]) objectInputStream.readObject();

        objectInputStream.close();
    }

    public static void main(String[] args) {
        new ReadSerial();
    }
}
