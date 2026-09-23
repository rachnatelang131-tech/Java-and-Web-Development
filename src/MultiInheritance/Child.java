package MultiInheritance;

public class Child extends Parent {

    Child(int a) {
        super(a);
        System.out.println("This is child class");
    }

    public void child() {
        System.out.println("Child is daughter");
    }

    public static void main(String[] args) {

        Child c = new Child(5);

        c.child();
        c.parent();
    }
}