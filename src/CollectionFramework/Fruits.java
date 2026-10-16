package CollectionFramework;

import java.util.HashSet;

public class Fruits {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Mango");
        set.add("Banana");
        set.add("Orange");

        set.remove("Mango");

        System.out.println(set);
  
	}

}
