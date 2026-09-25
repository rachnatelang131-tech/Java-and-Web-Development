package Inheritance;

public class SportsBike extends bikes {

    String model = "Kawasaki";

    public void display() {

        System.out.println("Child model: " + model);
        System.out.println("Parent model: " + super.model);

        super.run();
    }

    public static void main(String[] args) {

        SportsBike s = new SportsBike();

        s.display();
    }
}