package Static;

public class Instance {
	
	int a = 100; // instance variable
	static int x = 45; // static variable
	
	public void display() {
		int b = 5;
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
	}
	
	public static void gett() {
		// System.out.println(a);
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		Instance i = new Instance();
		i.display();
		gett();
	}

}
