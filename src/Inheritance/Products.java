package Inheritance;


public class Products {

    protected int productId;
    protected String productName;
    protected double price;

    public void productsInfo() {

        productId = 101;
        productName = "Laptop";
        price = 55000;

        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }
}