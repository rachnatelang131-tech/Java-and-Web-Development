package CollectionFramework;

import java.util.*;

public class Demo1 {
	
	public static void main(String[] args) {
		HashSet<String>hs = new HashSet<String>();
		hs.add("apple");
		hs.add("bananana");
		hs.add("grapes");
		hs.add("coconut");
		System.out.println(hs);
		
		hs.remove("apple");
		System.out.println(hs);
		
		hs.contains("apple");
		System.out.println(hs);
		
		for(String s:hs) {
			System.out.println(s);
			
			hs.clear();
			System.out.println(hs);
		}
		
	
		
	}

}
