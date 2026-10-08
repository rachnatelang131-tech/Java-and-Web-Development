package ExceptionHandelling;

public class FailException extends Exception{
	
	@Override
	public String toString() {
		return "Exception occured: Student failed in exam";
	}

}
