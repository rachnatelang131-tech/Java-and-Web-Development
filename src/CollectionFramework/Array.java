package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class Array {
	
	public static void main(String[] args) {
		ArrayList<Integer>hs = new ArrayList<Integer>();
		hs.add(12);
		hs.add(10);
		hs.add(22);
		hs.add(56);
		hs.add(10);
		System.out.println(hs);
		
		
		System.out.println(hs.size());
		
		hs.contains(23);
		System.out.println(hs);
		
		hs.remove(0);
		System.out.println(hs);
		
		hs.set(1, 99);
		System.out.println(hs);
		
		System.out.println(hs.get(3));
		
		Collections.sort(hs);
		System.out.println(hs);
		
		Collections.reverse(hs);
		System.out.println(hs);
		
		Collections.shuffle(hs);
		System.out.println(hs);
		
		System.out.println(Collections.max(hs));
		System.out.println(Collections.min(hs));
		
		hs.clear();
		System.out.println(hs);
	}

}
