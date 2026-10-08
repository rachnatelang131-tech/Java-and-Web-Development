package ExceptionHandelling;

public class Demo6 {

	public static void main(String[] args) throws EvenNumberException {
		int n = 4;

		if (n % 2 == 0) {
			throw new EvenNumberException();
		} else {
			System.out.println("Number is " + n + " it is odd");
		}
	}
}
