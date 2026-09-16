package This;

public class Calculator {
	int a;
	int b;
	
	public static int add(int a, int b) {
		return a+b ;
	}
	
	public static int sub(int a, int b) {
		return a-b ;
	}
	
	public static int product(int a, int b) {
		return a*b ;
	}
	
	public static int division(int a, int b) {
		return a/b ;
		
	}
	
	public static void main(String[] args) {
		System.out.println("Addition is " + Calculator.add(20, 10));
        System.out.println("Subtraction is " + Calculator.sub(20, 10));
        System.out.println("Multiplication is " + Calculator.product(20, 10));
        System.out.println("Division is " + Calculator.division(20, 10));
	
	}
}
