package Inheritance;

public class HDFCBank extends banks {

    public void rules(String name) {

        super.rules();

        System.out.println("HDFC Bank Rules");
        System.out.println("Bank Name is " + name);
    }

    public static void main(String[] args) {

        HDFCBank h = new HDFCBank();

        h.rules("HDFC");
    }
}