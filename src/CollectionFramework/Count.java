package CollectionFramework;

import java.util.*;

public class Count {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 20, 40};

        HashSet<Integer> set = new HashSet<>();
        
        for (int n : arr) {
            set.add(n);
        }

        System.out.println(set.size());
    }
}