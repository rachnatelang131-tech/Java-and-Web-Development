package Abstraction;

public class Areas extends Shape {

    @Override
    public void RectangleArea(int length, int breadth) {

        int area = length * breadth;

        System.out.println("Area of Rectangle: " + area);
    }

    @Override
    public void SquareArea(int side) {

        int area = side * side;

        System.out.println("Area of Square: " + area);
    }

    @Override
    public void CircleArea(int radius) {

        double area = 3.14 * radius * radius;

        System.out.println("Area of Circle: " + area);
    }

    public static void main(String[] args) {

        Areas a = new Areas();

        a.RectangleArea(10, 20);
        a.SquareArea(10);
        a.CircleArea(5);
    }
}