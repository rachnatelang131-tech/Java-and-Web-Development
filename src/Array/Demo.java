package Array;

public class Demo {
	public static void main(String[] args) {
		int arr[] = { 23, 34, 45, 56, 67, 78, 89, 98, 87 };
		
		System.out.println(arr[3]);
		System.out.println(arr[5]);
		
		System.out.println(arr.length);
		
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println();
		for(int t:arr) {
			System.out.println(t);
		}
	}

}
