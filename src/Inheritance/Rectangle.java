package Inheritance;

public class Rectangle extends Area {
	
	int l = 10;
	int b = 5;
	
	public void rectangle() {
		area = l * b;
		name = "rectangle";
	}
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.rectangle();
		r.displayarea();
	}

}
