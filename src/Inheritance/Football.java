package Inheritance;

public class Football extends Sports{
	String name = "Football";
	
	public void sports() {
		System.out.println("Sports name is " + name);
	}
	public static void main(String[] args) {
		Football f = new Football();
		Cricket c = new Cricket();
		
		f.sports();
		c.cricket();
		f.display();
		
	}

}
