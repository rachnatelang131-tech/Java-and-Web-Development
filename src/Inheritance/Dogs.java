package Inheritance;

public class Dogs extends Mammal {
	public void bark() {
		System.out.println("dog is barking");
	}
	public static void main(String[] args) {
		Dogs d = new Dogs();
		d.eat();
		d.walk();
		d.bark();
	}

}
