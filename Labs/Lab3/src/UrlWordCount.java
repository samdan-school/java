import java.util.Scanner;

public class UrlWordCount {
    public UrlWordCount() {
        String urlString = "https://www.w3.org/TR/PNG/iso_8859-1.txt";
        String searchWord = "Lincoln";

        try {
            java.net.URL url = new java.net.URL(urlString);
            int count = 0;
            Scanner input = new Scanner(url.openStream());
            String[] numbers;
            while (input.hasNext()) {
                String line = input.nextLine();
                numbers = line.split("/\\b\\[W1-9]+\\b/");
                count += numbers.length;
            }
            System.out.println("The file size is " + count + " words");
        } catch (java.net.MalformedURLException ex) {
            System.out.println("Invalid URL");
        } catch (java.io.IOException ex) {
            System.out.println("I/O Errors: no such file");
        }
    }

    public static void main(String[] agrc){
        new UrlWordCount();
    }
}
