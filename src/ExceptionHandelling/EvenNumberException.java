package ExceptionHandelling;

public class EvenNumberException extends Exception {
	
	@Override
	public String toString() {
		return "Even number is not allowed";
	}

}	