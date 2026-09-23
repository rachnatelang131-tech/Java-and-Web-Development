package Inheritance;

public class ElectronicProducts extends Products {

    String brand;
    int warranty;

    public void display() {

        brand = "Dell";
        warranty = 2;

        System.out.println("Brand: " + brand);
        System.out.println("Warranty: " + warranty + " years");
    }

    public static void main(String[] args) {

        ElectronicProducts e = new ElectronicProducts();

        e.productsInfo();
        e.display();
    }
}