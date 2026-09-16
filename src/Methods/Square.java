package Methods;

public class Square {
	public void Area() {
		int a = 12;
		int Area = a*a;
		System.out.println(Area);
	}
	
	public void Perimeter() {
		int a = 12;
		int Perimeter = 4*a;
		System.out.println(Perimeter);
	
	}
	
	public static void main(String[] args) {
		Square obj = new Square();
		obj.Area(); 
		obj.Perimeter();
	}

}



