package CollectionFramework;

import java.util.ArrayList;

public class Insert {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        colors.add(0, "Red");

        System.out.println(colors);
    }
}