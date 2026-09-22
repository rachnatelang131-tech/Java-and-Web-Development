package Inheritance;

public class Circle extends Area {

    int r = 10;

    public void circle() {
        area = 3.14 * r * r;
        name = "Circle";
    }

    public static void main(String[] args) {

        Circle c = new Circle();
        c.circle();
        c.displayarea();
    }
}