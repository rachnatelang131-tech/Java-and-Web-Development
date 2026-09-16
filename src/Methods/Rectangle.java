package Methods;

public class Rectangle {
	public void Area() {
		int l = 12;
		int b = 13;
		int Area = l*b;
		System.out.println(Area);
	}
	
	public void Perimeter() {
		int l = 12;
		int b = 13;
		int Perimeter = 2*(l+b);
		System.out.println(Perimeter);
	}
	
	public static void main(String[] args) {
		Rectangle obj = new Rectangle();
		obj.Area();
		obj.Perimeter();
	}

}
