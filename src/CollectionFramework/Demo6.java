package CollectionFramework;

import java.util.HashSet;

public class Demo6 {
    public static void main(String[] args) {
        Book b1 = new Book(101, "Java", "ABC", 560);
        Book b2 = new Book(102, "AD Java", "ABCD", 590);
        Book b3 = new Book(103, "Java Spring", "ABCDE", 660);
        Book b4 = new Book(104, "Java Spring Boot", "ABCDEF", 960);

        HashSet<Book> al = new HashSet<>();

        al.add(b1);
        al.add(b2);
        al.add(b3);
        al.add(b4);
        al.add(b1);

        System.out.println(al);

        for (Book b : al) {
            System.out.println(b);
        }
    }
}
