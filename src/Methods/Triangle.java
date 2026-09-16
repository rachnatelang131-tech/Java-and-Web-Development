package Methods;

public class Triangle {

    public void area() {
        int base = 13;
        int height = 14;

        double area = 0.5 * base * height;
        System.out.println(area);
    }

    public void perimeter() {
        int a = 12;
        int b = 13;
        int c = 14;

        int perimeter = a + b + c;
        System.out.println(perimeter);
    }

    public static void main(String[] args) {
        Triangle obj = new Triangle();
        obj.area();
        obj.perimeter();
    }
}
