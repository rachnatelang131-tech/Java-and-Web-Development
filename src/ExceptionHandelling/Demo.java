package ExceptionHandelling;

public class Demo {
	public static void main(String[] args) throws Exception {
		System.out.println("HEllO");
		Thread.sleep(10000);
		System.out.println("World");
		try {
		System.out.println(10/0);     // infinte
		}
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("HEY");
		Thread.sleep(10000);
		System.out.println("Rachna");
	}

}
