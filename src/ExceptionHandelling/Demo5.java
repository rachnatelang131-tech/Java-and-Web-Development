package ExceptionHandelling;

public class Demo5 {
	
	static String name = "Rachnaa";
	public static void main(String[] args) throws Exception{
		if(name.length() > 5) {
			throw new Exception("string length is greater than 5");
		}
		else {
			System.out.println(name);
		}
	} 

}
