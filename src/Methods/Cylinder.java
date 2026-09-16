package Methods;

public class Cylinder {

    public void volume() {
        int r = 7;
        int h = 10;

        double volume = Math.PI * r * r * h;

        System.out.println(volume);
    }

    public void area() {
        int r = 7;
        int h = 10;

        double area = (2 * Math.PI * r * h) + (2 * Math.PI * r * r);

        System.out.println(area);
    }

    public static void main(String[] args) {
        Cylinder obj = new Cylinder();
        obj.volume();
        obj.area();
    }
}
