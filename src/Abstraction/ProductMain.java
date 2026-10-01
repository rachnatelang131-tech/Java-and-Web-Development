package Abstraction;

public class ProductMain {
    public static void main(String[] args) {
        Product p;

        p = new Electronics(5000);
        System.out.println("Electronics");
        p.display();

        p = new Clothing(3000);
        System.out.println("\nClothing");
        p.display();

        p = new Groceries(1000);
        System.out.println("\nGroceries");
        p.display();
    }
}