package MultiInheritance;

public class Main {
	public static void main(String[] args) {
		DemoC c = new DemoC();
		c.b_method();
		c.a_method();
		c.c_method();
		
		System.out.println();
		
		DemoD d = new DemoD();
		d.a_method();
		d.b_method();
		d.d_method();
		
		
	}

}
