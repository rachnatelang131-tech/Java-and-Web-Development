package Array;

public class Colours {
	public static void main(String[] args) {
		String arr[] = { "Pink", "Yellow", "Green", "White", "Red" };
		
		System.out.println(arr[0]);
		System.out.println(arr[2]);
		
		System.out.println(arr.length);
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
	}
		System.out.println();
		for(String t:arr) {
			System.out.println(t);

		}
	}
}
