package Lambda;

	@FunctionalInterface
	interface Showable {
	void show();
	default void display() {
		System.out.println("Display method");
	}
	}
public class Demo {
	public static void main(String[] args) {
		Showable s = ()->System.out.println("show method");
		s.show();
		s.display();
	}
	
}

