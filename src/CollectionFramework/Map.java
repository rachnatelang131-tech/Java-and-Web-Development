package CollectionFramework;

import java.util.*;

public class Map {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("India", "New Delhi");
        map.put("USA", "Washington");
        map.put("Japan", "Tokyo");

        System.out.println(map);
        
        System.out.println(map.get("India"));
        
        System.out.println(map.containsKey("USA"));
    }
}