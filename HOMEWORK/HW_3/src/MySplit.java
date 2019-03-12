import java.util.ArrayList;
import java.util.Collections;

public class MySplit {
    public static String[] split(String s, String regex) {
        String[] strings = s.split(regex);

        ArrayList<String> stringList = new ArrayList<String>();
        Collections.addAll(stringList, strings);

        int added = 1;

        for (int i = 0; i < strings.length - 1; i++) {
            int indexOfFirst = s.indexOf(strings[i]);
            int firstWordLength =strings[i].length();
            int indexOfSecond = s.indexOf(strings[i + 1]);
            String substring = s.substring(indexOfFirst, indexOfSecond);
            String delimiter = substring.substring(firstWordLength);
            stringList.add(i + added, delimiter);
            added++;
        }
        return stringList.toArray(new String[0]);
    }


    public static void main(String args[]) {
        // "ab#12#453", "#"
        // "a?b?gf#e", "[?#]"
        for (String a : split("ab#12#453", "#"))
            System.out.print(a + " ");
    }

}
