package Abstraction;

public class Triangle extends Area{
	int height;
	int base;
	
	public Triangle (int height, int  base) {
		this.base = base;
		this.height = height;
	}
	@Override
	public void cal_area() {
		area = 0.5 * base * height;
	}
	

}
