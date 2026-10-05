package Interface;

public class Cylinder implements Operations {
	
	double area;
	double volume;
	
	public void calculate(int r, int h) {
		 area = 2 * 3.14 * r * h + 2 * 3.14 * r * r;
	     volume = 2 * 3.14 * r * h;
		
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("Area is " + area);
		
		
	}

	@Override
	public void volume() {
		// TODO Auto-generated method stub
		System.out.println("volume is " + volume);
	}
	public static void main(String[] args) {
		Cylinder c = new Cylinder();
		c.calculate(10, 20);
		c.area();
		c.volume();
		

}
}
