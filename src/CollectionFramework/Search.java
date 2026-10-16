package CollectionFramework;

import java.util.ArrayList;

public class Search {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        System.out.println(colors.contains("Green"));
    }
}