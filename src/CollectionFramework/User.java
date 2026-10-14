package CollectionFramework;

import java.util.ArrayList;
import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> i = new ArrayList<Integer>();

        for (int j = 0; j < 7; j++) {
            System.out.println("Enter number...");
            i.add(sc.nextInt());  
        }
        System.out.println(i);
        }
}
