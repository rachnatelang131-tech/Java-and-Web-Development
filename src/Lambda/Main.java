package Lambda;

interface Count {
    int digits(int n);
}

public class Main {
    public static void main(String[] args) {
        Count c = n -> String.valueOf(n).length();
        System.out.println(c.digits(12345));
    }
}