package This;

public class Rectangle {
	
	int length;
	int breadth;
	
	// constructor with no parameter
	public Rectangle() {
		this.length = 0;
		this.breadth = 0;	
	}
	
	// constructor with two parameter 
	public Rectangle(int len, int br) {
		this.length = len;
		this.breadth = br;
	}
	
	// constructor with one parameter
	public Rectangle(int side) {
		this.length = side;
		this.breadth = side;
	}
	
	//Function to calculate area
	public void Area() {
		int a = length*breadth;
		
		System.out.println("Area of rectangle is...." + a);
	}
	
	public static void main(String[] args) {
		
		// object with no parameter
		Rectangle r1 = new Rectangle();
		r1.Area();
		
		// object with two parameter
		Rectangle r2 = new Rectangle(10, 5);
		r2.Area();
		
		//object with one parameter
		Rectangle r3 = new Rectangle(15);
		r3.Area();
	}

}
