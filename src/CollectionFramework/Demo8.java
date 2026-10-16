package CollectionFramework;

import java.util.LinkedHashMap;

public class Demo8 {

    public static void main(String[] args) {

        LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();

        hm.put(1, "Red");
        hm.put(21, "White");
        hm.put(33, "Blue");
        hm.put(74, "Pink");
        hm.put(1, "Brown");

        System.out.println(hm);
    }
}