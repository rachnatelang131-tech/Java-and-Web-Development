package Lambda;

interface Upper {
    String convert(String s);
}

public class Uppercase {
    public static void main(String[] args) {
        Upper u = s -> s.toUpperCase();
        System.out.println(u.convert("hello world"));
    }
}