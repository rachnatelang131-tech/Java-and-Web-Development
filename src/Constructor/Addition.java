package Constructor;

public class Addition {
	
	public Addition() {
		System.out.println(5+5);
	}
	
	public Addition(int a) {
		System.out.println(12+a);
	}
	
	public Addition(int a, int b) {
		System.out.println(a+b);
	}
	
	public Addition(double a) {
		System.out.println(5.2+a);
	}
	
	public static void main(String[] args) {
		Addition ad = new Addition(5.6);
	}

}
