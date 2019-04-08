package exam.TextFile;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Sin {
    File sinFile;
    PrintWriter writer;

    Sin() {
        sinFile = new File("/home/samdan/Desktop/School/2019_Spring/java/Labs/src/exam/sin.txt");

        try {
            if (!sinFile.exists()) {
                sinFile.createNewFile();
            }
            writeFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void writeFile() throws IOException {
        writer = new PrintWriter(sinFile);

        for (int i = 0; i < 360; i++) {
            writer.println(i + " " + Math.sin(i * Math.PI / 180));
        }

        writer.close();
    }

    public static void main(String[] args) {
        new Sin();
    }
}
