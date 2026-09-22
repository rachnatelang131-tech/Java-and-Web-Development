package Inheritance;

public class Child extends Parent {
	public void gett() {
		System.out.println("This is child class");
	}
	
	public static void main(String[] args) {
		Child c = new Child();
		Parent p = new Parent();
		c.display();
		c.gett();
		c.school();
		p.display();
	
		
		
	}

}
