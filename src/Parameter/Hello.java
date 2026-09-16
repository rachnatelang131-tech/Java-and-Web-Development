package Parameter;

public class Hello {

    public void hello(String message, String name) {
        System.out.println(message);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Hello h = new Hello();
        h.hello("Hello!!!", "Rachna");
    }
}