package Do_While;

public class Factorial {
	public static void main(String[] args) {
		int i = 1;
		int factorial = 1;
		
		do {
			factorial = factorial + 1 ;
			i++;	
		} while (i <= 5);
		System.out.println("Factorial = " + factorial);
	}

}
