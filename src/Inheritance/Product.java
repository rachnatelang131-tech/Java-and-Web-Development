package Inheritance;


public class Product {

    String productName;
    Double price;
    Integer warrantyMonths;

    public void displayPrice() {
        System.out.println("The price is $" + price);
    }

    public String checkWarranty() {
        return "Warranty: " + warrantyMonths + " months.";
    }
    
}
