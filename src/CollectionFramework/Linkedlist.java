package CollectionFramework;

import java.util.LinkedList;

public class Linkedlist {
	public static void main(String[] args) {
		LinkedList<Integer>hs = new LinkedList<Integer>();
		hs.add(12);
		hs.add(10);
		hs.add(22);
		hs.add(56);
		System.out.println(hs);
		
		hs.remove(56);
		System.out.println(hs);
		
		hs.contains(22);
		System.out.println(hs);
		
		hs.clear();
		System.out.println(hs);

	}

}