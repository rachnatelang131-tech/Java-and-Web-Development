package Static;

public class Demo {
	
	public static void display() {
		System.out.println("Static method");
	}
	
	public static void area(int len, int br) {
		int area = len * br;
		System.out.println("Area " + area);
	}
	
	public static void cube(int a) {
		int cube =  a * a * a;
		System.out.println("cube is " + cube);
		
	}
	public static void main(String[] args) {
		display();
		area(2, 3);
		cube(8);
	}


}
