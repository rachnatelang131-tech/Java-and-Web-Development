package Abstraction;

public class Square extends Area {

    int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public void cal_area() {
        area = side * side;
    }

    public static void main(String[] args) {

        Square s = new Square(10);

        s.cal_area();
        s.display();
    }
}
