package Lambda;

interface rectangle {
    void num(int a);
}

public class Square {
    public static void main(String[] args) {
        rectangle s = (a) -> System.out.println(a * a);
        s.num(10);
    }
}