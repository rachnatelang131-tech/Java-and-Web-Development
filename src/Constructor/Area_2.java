package Constructor;

public class Area_2 {

    double area;

    public Area_2(int side) {
        area = side * side;
    }

    public Area_2(int len, int br) {
        area = len * br;
    }

    public void display() {
        System.out.println("Area = " + area);
    }

    public static void main(String[] args) {

        Area_2 square = new Area_2(5);
        square.display();

        Area_2 rectangle = new Area_2(10, 5);
        rectangle.display();
    }
}