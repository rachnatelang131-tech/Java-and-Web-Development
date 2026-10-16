package CollectionFramework;

import java.util.ArrayList;

public class Empty {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        if (colors.isEmpty()) {
            System.out.println("ArrayList is empty");
        } else {
            System.out.println("ArrayList is not empty");
        }

        colors.add("Red");

        if (colors.isEmpty()) {
            System.out.println("ArrayList is empty");
        } else {
            System.out.println("ArrayList is not empty");
        }
    }
}