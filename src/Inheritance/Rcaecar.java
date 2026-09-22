package Inheritance;

public class Rcaecar extends Automobile {
	public void gett() {
		System.out.println("One of the good automobile");
	}
	public static void main(String[] args) {
		Rcaecar a = new Rcaecar();
		a.display();
		a.gett();
		
		
	}

}
