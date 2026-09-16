package Constructor;

public class Multiply {
	
	public void Multiply() {
		int a = 12;
		int b = 13;
		int c = a  * b;
		System.out.println(c);
	}
	
	public Multiply() {
		int x = 22;
		int y = 33;
		int z = x  * y;
		System.out.println(z);
	}
	
	public static void main(String[] args) {
		Multiply obj = new Multiply();
		obj.Multiply();
	}

}
