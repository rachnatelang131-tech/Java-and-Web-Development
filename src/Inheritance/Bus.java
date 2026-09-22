package Inheritance;

public class Bus extends Car {
	
	public void gett() {
		System.out.println("This is bus class"); 
	}
	public static void main(String[] args) {
		Bus c = new Bus();
		c.display();
		c.gett();
	}

}
