package CollectionFramework;


import java.util.HashMap;

public class Demo7 {

    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        hm.put(1, "Red");
        hm.put(21, "White");
        hm.put(33, "Blue");
        hm.put(74, "Pink");
        hm.put(1, "Brown");

        System.out.println(hm);
    }
}