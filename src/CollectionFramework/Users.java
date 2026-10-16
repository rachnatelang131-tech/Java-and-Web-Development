package CollectionFramework;

import java.util.*;

public class Users{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        
        System.out.println("enter list...");

        try {
            for (int i = 0; i < 5; i++) {
                int n = sc.nextInt();

                if (list.contains(n)) {
                    throw new Exception("Duplicate number!");
                }

                list.add(n);
            }

            System.out.println(list);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}