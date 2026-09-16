package Methods;

public class Operations {
	public void operations() {
		int a = 12;
		int b = 13;
		int add = a + b;
		int sub = a - b;
		int multiply = a * b;
		int division = a / b;
		
		System.out.println(add);
		System.out.println(sub);
		System.out.println(multiply);
		System.out.println(division);

	}
	public static void main(String[] args) {
		Operations obj = new Operations();
		obj.operations();
		
	}

}
