package ExceptionHandelling;

public class Demo2 {
	public static void main(String[] args) throws Exception{
		System.out.println("Hello");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Welcome");
	}

}
