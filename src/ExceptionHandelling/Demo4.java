package ExceptionHandelling;

public class Demo4 {
	static String s;
	public static void main(String[] args) {
		
		System.out.println("hi");
		try {
			System.out.println(s.length());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("rachna");
		try {
			System.out.println("hello");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("dear");
	}

}
