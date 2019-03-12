public class ConvertMillseconds {
    static long mills;
    static long hours;
    static long minutes;
    static long seconds;

    public static String convertMillis(long millis) {
        String time = "";
        mills = millis;
        seconds = millis / 1000 % 60;
        minutes = millis / 1000 / 60 % 60;
        hours = millis / 1000 / 60 / 60;

        return hours + ":" + minutes + ":" + seconds;
    }

    public static void main(String args[]) {
        System.out.println(convertMillis(555550000));
    }
}
