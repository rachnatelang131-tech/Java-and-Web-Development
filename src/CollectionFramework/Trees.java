package CollectionFramework;

import java.util.TreeMap;
import java.util.Scanner;

public class Trees {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		TreeMap<String, Double> tm = new TreeMap<String, Double>();
		
		    tm.put("Apple", 120.50);
	        tm.put("Banana", 40.00);
	        tm.put("Mango", 150.75);
	        tm.put("Orange", 80.50);
		
	        System.out.println(tm);

	        System.out.println("Enter key to search:");
	        String key = sc.next();

	        System.out.println(tm.getOrDefault(key, -1.0));
		
	}

}
