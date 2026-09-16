package Constructor;

public class Mobile {

    // Constructor
    public Mobile() {
        System.out.println("Mobile constructor called");
    }

    // Method
    public void display() {
        System.out.println("Display method called");
    }

    public static void main(String[] args) {

        Mobile m = new Mobile();

        m.display();
    }
}