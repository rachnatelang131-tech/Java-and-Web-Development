package Abstraction;

public class Main {
	public static void main(String[] args) {
		Circle c = new Circle(25);
		System.out.println("Area of circle is");
		c.display();
		c.cal_area();
		
		Square s = new Square(10);
		System.out.println("area of square is ");
        s.cal_area();
        s.display();
        
        Rectangle r = new Rectangle(5,  6);
        System.out.println("Area of rectangle is");
        r.cal_area();
        r.display();
        
        Triangle t = new Triangle(10, 12);
        System.out.println("Area of traingle is");
        r.cal_area();
        r.display();
      
		
		
	}

}
