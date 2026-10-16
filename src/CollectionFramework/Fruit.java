package CollectionFramework;

import java.util.*;

public class Fruit {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        Collections.sort(list);
        System.out.println(list);
    }
}