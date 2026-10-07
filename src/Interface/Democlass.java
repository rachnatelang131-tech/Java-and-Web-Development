package Interface;

public class Democlass implements Addable {

    @Override
    public void addition() {
        System.out.println("this is public and abstract");
    }

    @Override
    public void addition(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        Democlass d = new Democlass();

        d.addition();
        d.addition(10, 20);
        d.de_method();
    }
}