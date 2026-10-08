package Lambda;

interface FirstChar {
    char get(String s);
}

public class StringChar {
    public static void main(String[] args) {
        FirstChar f = s -> s.charAt(0);
        System.out.println(f.get("Hello"));
    }
}