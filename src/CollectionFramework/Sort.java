package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class Sort {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Yellow");
        colors.add("Blue");
        colors.add("Red");
        colors.add("Green");

        Collections.sort(colors);

        System.out.println(colors);
    }
}