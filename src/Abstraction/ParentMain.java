package Abstraction;

public class ParentMain {
    public static void main(String[] args) {
        Firstsubclass f = new Firstsubclass();
        SecondSubclass s = new SecondSubclass();

        f.message();
        s.message();
    }
}