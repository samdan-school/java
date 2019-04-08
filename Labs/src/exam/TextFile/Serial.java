package exam.TextFile;

import java.io.*;

public class Serial {

    double[][] sinInfo;

    ReadSin readSin;

    ObjectOutputStream objectOutputStream;
    File sin2dat;

    Serial() {
        readSin = new ReadSin();

        sin2dat = new File("/home/samdan/Desktop/School/2019_Spring/java/Labs/src/exam/sin2.dat");

        try {
            if (!sin2dat.exists()) {
                sin2dat.createNewFile();
            }
            writeFileSerial();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void writeFileSerial() throws IOException {
        objectOutputStream = new ObjectOutputStream(new FileOutputStream(sin2dat));

        objectOutputStream.writeObject(readSin.sinInfo);

        objectOutputStream.close();
    }

    public static void main(String[] args) {
        new Serial();
    }
}
