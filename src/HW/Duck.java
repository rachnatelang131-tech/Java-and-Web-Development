package HW;

public class Duck implements Flyable, Swimmable{
	public void fly() {
		System.out.println("duck can fly");
	}
	
	public void swim() {
		System.out.println("Duck can swim also");
	}
	public static void main(String[] args) {
        Bird b = new Bird();
        Fish f = new Fish();
        Duck d = new Duck();

        b.fly();
        f.swim();
        d.fly();
        d.swim();
    }
}
