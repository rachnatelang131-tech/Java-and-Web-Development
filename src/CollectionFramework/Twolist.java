package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Twolist {
    public static void main(String[] args) {
        ArrayList<Integer> hs = new ArrayList<Integer>();

        hs.add(12);
        hs.add(10);
        hs.add(22);
        hs.add(56);
        hs.add(10);
        System.out.println(hs);
        
        
        ArrayList<Integer> set = new ArrayList<Integer>();
        set.add(10);
        set.add(20);
        set.add(10);
        set.add(30);
        set.add(20);
        set.add(40);
        set.add(50);
        System.out.println(set);
        
        HashSet<Integer> sets = new HashSet<>();
        sets.add(10);
        sets.add(20);
        sets.add(10);
        
        hs.addAll(set);
        System.out.println(hs);
        
        hs.removeAll(set);
        System.out.println(hs);
        
        hs.retainAll(set);
        System.out.println(hs);
        
        
        
        
    }
}