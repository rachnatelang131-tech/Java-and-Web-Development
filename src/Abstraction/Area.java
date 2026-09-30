package Abstraction;

public abstract class Area {

    double area;

    public void display() {
        System.out.println(area);
    }

    public abstract void cal_area();

    public Area() {
        // TODO
        System.out.println("abstract class constructor");
    }
}
