import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class RemoveText {

    public RemoveText(){
        File file = new File("E:\\src\\Remove.txt");
        File newFile = new File("E:\\src\\temp.txt");

        if(!file.exists()){
            System.out.println("Source file does not exist");
            System.exit(0);
        }
        importFile(file, newFile);

    }

    void importFile(File file, File newFile){
        String line;
        String searchWord = "hi";
        String replacedWord = "";
        String replacedString;
        try {
            Scanner input = new Scanner(file);
            PrintWriter print = new PrintWriter(newFile);
            while(input.hasNext()){
                line = input.nextLine().toLowerCase();
                replacedString = line.replaceAll(searchWord.toLowerCase(), replacedWord);
                System.out.println(replacedString);
                print.println(replacedString);
            }
            input.close();
            print.close();
            newFile.renameTo(new File("E:\\src\\newFile.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] agrc){
        new RemoveText();
    }
}
