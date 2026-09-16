package Methods;

public class Circle {
	public void Area() {
		int r = 12;
		double Area = 3.14*r*r; 
		System.out.println(Area);
	}
	
	public void Circumference() {
		int r = 12;
		double Circumference = 2*3.14*r;
		System.out.println(Circumference);
	
	}
	
	public static void main(String[] args) {
		Circle obj = new Circle();
		obj.Area(); 
		obj.Circumference();
	}


}


