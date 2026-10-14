package CollectionFramework;

import java.util.TreeSet;

public class Demo2 {
	
	public static void main(String[] args) {
		TreeSet<String>hs = new TreeSet<String>();
		hs.add("apple");
		hs.add("bananana");
		hs.add("grapes");
		hs.add("coconut");
		System.out.println(hs);
		
		hs.remove("apple");
		System.out.println(hs);
		
		hs.contains("apple");
		System.out.println(hs);
		
		hs.clear();
		System.out.println(hs);
	}

}
