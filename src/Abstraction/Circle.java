package Abstraction;

public class Circle extends Area{
	
	int radius;
	
	public Circle (int radius) {
		this.radius = radius;
	}
	@Override
	public void cal_area() {
		area = 3.14 * radius * radius;
	}
	public static void main(String[] args) {
		Circle c = new Circle(5);
		c.display();
		c.cal_area();
		
		
	}

}
