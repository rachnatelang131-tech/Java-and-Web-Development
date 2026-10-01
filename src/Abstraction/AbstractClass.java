package Abstraction;

public abstract class AbstractClass {
    AbstractClass() {
        System.out.println("This is constructor of abstract class");
    }

    abstract void a_method();

    void normalMethod() {
        System.out.println("This is a normal method of abstract class");
    }
}

