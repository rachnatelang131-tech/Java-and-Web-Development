package Abstraction;

public class Rectangle extends Area{
	
	int length;
	int breadth;
	
	public Rectangle (int length, int breadth) {
		this.breadth = breadth;
		this.length = length;
	}
	@Override
	public void cal_area() {
		area = length * breadth;
		
	}
	
	
	

}
