package CollectionFramework;


import java.util.TreeMap;

public class Demo9 {

    public static void main(String[] args) {

        TreeMap<String, Double> tm = new TreeMap<String, Double>();

        tm.put("Apple", 120.50);
        tm.put("Banana", 40.00);
        tm.put("Mango", 150.75);
        tm.put("Orange", 80.50);
        tm.put("Apple", 130.00);

        System.out.println(tm);
        
        System.out.println(tm.size());

        System.out.println(tm.get("Apple"));
        
        tm.replace("Apple", 220.3);
        System.out.println(tm);
        
        System.out.println(tm.keySet());
        System.out.println(tm.values());
        System.out.println(tm.containsValue(40.00));
        
        tm.putIfAbsent("Grape", 320.50);
        System.out.println(tm);
        
        System.out.println(tm.get("Mango"));
        System.out.println(tm.getOrDefault("Grapes", 0.0));
        
        
        
        
    }
}
