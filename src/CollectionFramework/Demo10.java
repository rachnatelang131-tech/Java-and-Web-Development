
package CollectionFramework;

import java.util.TreeMap;

public class Demo10 {
    public static void main(String[] args) {

        TreeMap<Integer, Student> tm = new TreeMap<Integer, Student>();

        tm.put(3, new Student(101, "Rahul", 85.5));
        tm.put(1, new Student(102, "Amit", 90.0));
        tm.put(2, new Student(103, "Priya", 88.5));

        System.out.println(tm);
    }
}
