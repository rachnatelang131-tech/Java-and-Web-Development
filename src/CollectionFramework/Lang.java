package CollectionFramework;

import java.util.*;

public class Lang {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("JavaScript");

        for (String s : list) {
            System.out.println(s);
            
            list.addFirst("Kotlin");
            list.addLast("Swift");
            System.out.println(list);
        }
    }
}