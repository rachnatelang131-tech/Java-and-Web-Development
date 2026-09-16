package Constructor;

public class Programming {
	
	public Programming () {
		System.out.println("I love programming languages");
	}
	
	public Programming (String name) {
		System.out.println(("I love" + " " + name));
	}
	
	public static void main(String[] args) {
		
		Programming p1 = new Programming();
		Programming p2 = new Programming("python");
		Programming p3 = new Programming("java");
		
	}
}
