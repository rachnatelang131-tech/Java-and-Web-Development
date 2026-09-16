package String;

public class Calculator {
	public void operations(int a, int b) {
	    int sum = a + b;
		int sub = a - b;
		int mul = a * b;
		int div = a / b;
		
		System.out.println("Sum is " + sum);
		System.out.println("Substract  is " + sub);
		System.out.println("Product is " + mul);
		System.out.println("division is " + div);
		
	}
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.operations(10, 20);
	}

}
