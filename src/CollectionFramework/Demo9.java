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
    }
}
