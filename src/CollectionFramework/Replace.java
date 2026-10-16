package CollectionFramework;

import java.util.ArrayList;

public class Replace {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        colors.set(1, "Black");

        System.out.println(colors);
    }
}