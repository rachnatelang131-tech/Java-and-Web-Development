package ExceptionHandelling;

public class Demo3 {
	public static void main(String[] args) {
		int arr[] = {45, 55, 65, 75 };
		System.out.println(arr[0]);
		System.out.println(arr[3]);
		try {
			System.out.println(arr[8]);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(arr[2]);
			
		}
		
	}


