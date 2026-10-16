package CollectionFramework;

import java.util.*;

public class Throw{
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        try {
            if (set.isEmpty()) {
                throw new Exception("Set is empty!");
            }

            System.out.println(set);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}