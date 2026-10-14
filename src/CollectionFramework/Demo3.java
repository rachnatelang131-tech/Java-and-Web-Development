package CollectionFramework;

import java.util.LinkedHashSet;

public class Demo3 {
	
	public static void main(String[] args) {
		LinkedHashSet<String>hs = new LinkedHashSet<String>();
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
