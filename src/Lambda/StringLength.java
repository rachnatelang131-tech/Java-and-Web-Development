package Lambda;

interface StringDemo {
    int length(String s);
}

public class StringLength {
    public static void main(String[] args) {
        StringDemo l = (s) -> s.length();
        System.out.println(l.length("Hello World"));
    }
}