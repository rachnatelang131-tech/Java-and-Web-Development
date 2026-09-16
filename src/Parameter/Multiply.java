package Parameter;

public class Multiply {
	public void mult( int a, int b ) {     //parameterized
		int result = (a*b);
		System.out.println(result);
		
	}
	 public static void main(String[] args) {
		 Multiply m = new Multiply();
			m.mult(5, 6);
			m.mult(12, 13);
		}
	 }

