package Constructor;

public class Fraction {
	
	// Constructor with no parameter
	public Fraction() {
	}
	
	// constructor with parameters
	public Fraction(int numerator, int denominator) {
		System.out.println(numerator + "/" + denominator);
		
		System.out.println("numerator  " + numerator );
		System.out.println("denominator  " + denominator );
	}
	
	public static void main(String[] args) {
		
		
		Fraction f1 = new Fraction();
		Fraction f2 = new Fraction(20, 10);
	}
	}


