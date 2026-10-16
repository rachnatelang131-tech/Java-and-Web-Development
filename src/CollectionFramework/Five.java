package CollectionFramework;

import java.util.HashSet;

public class Five {
	public static void main(String[] args) {
	    HashSet<Integer> set = new HashSet<>();

		        set.add(5);
		        set.add(10);
		        set.add(15);
		        set.add(20);
		        set.add(25);

		        System.out.println(set.contains(15));
		        System.out.println(set.contains(100));
		    }
		}

