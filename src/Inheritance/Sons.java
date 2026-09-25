package Inheritance;

public class Sons extends Dad {

    int age = 43;

    public void get() {

        System.out.println("Dad saying .. " + super.msg);
        System.out.println("Age is " + age);
    }

    public static void main(String[] args) {

        Sons s = new Sons();

        s.get();
    }
}