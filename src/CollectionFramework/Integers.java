package CollectionFramework;

import java.util.LinkedHashSet;

public class Integers {
	
	public static void main(String[] args) {
		LinkedHashSet<Integer>hs = new LinkedHashSet<Integer>();
		hs.add(12);
		hs.add(10);
		hs.add(22);
		hs.add(56);
		System.out.println(hs);
		
		hs.remove(56);
		System.out.println(hs);
		
		hs.contains(23);
		System.out.println(hs);
		
		hs.clear();
		System.out.println(hs);
	}

}
