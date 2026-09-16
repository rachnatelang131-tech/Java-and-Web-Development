package Parameter;

public class Cylinder {
	public void cylinder(int r, int h) { //radius and height of cylinder
		double ar = 2*3.14*r*h + 2*3.14*r*r;
		double vol = 2*3.14*r*h;
		double Sur = 2*3.14*r*(r+h);
		
		System.out.println("Area is: " + ar);
		System.out.println();
		System.out.println("volume is: " + vol);
		System.out.println();
		System.out.println("Surface_area is: " + Sur);
		System.out.println();

	}
	public static void main(String[] args) {
		Cylinder c = new Cylinder();
		c.cylinder(12, 15);
		c.cylinder(14, 18);

	}

}
