package HW_3;

public class MyStringBuilder1 {
    private String s;

    public MyStringBuilder1(String s) {
        this.s = s;
    }

    public MyStringBuilder1 append(MyStringBuilder1 s) {
        return new MyStringBuilder1(this.s + s);
    }

    public MyStringBuilder1 append(int i) {
        return new MyStringBuilder1(this.s + i + "");
    }

    public int length() {
        return this.s.length();
    }

    public char charAt(int index) {
        return this.s.charAt(index);
    }

    public MyStringBuilder1 toLowerCase() {
        return new MyStringBuilder1(this.s.toLowerCase());
    }

    public MyStringBuilder1 substring(int begin, int end) {
        return new MyStringBuilder1(this.s.substring(begin, end));
    }

    public String toString() {
        return this.s;
    }

    public static void main(String args[]) {
        MyStringBuilder1 ex = new MyStringBuilder1("Hello World");
        System.out.println(ex);

        MyStringBuilder1 newBuilder1 = ex.append(new MyStringBuilder1(" Added"));
        System.out.println(newBuilder1);

        MyStringBuilder1 newBuilder2 = ex.append(27);
        System.out.println(newBuilder2);

        System.out.println(ex.length());
        System.out.println(ex.charAt(0));
        System.out.println(ex.toLowerCase());
        System.out.println(ex.substring(0, 4));
    }
}
