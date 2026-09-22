package Inheritance;

public class Laptop extends Electronics {
	int RAM = 256;
	String processor;
	
	public void laptop() {
		System.out.println("RAM is good " + RAM);
	}
	public static void main(String[] args) {
		Laptop l = new Laptop();
		Mobile m = new Mobile();
		l.laptop();
		m.display();
		m.mobile();
		
				
	}

}
