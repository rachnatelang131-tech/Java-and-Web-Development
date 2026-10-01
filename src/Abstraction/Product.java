package Abstraction;

public abstract class Product {
    double price;

    Product(double price) {
        this.price = price;
    }

    abstract double calculateDiscount();

    void display() {
        double discount = calculateDiscount();
        double total = price - discount;

        System.out.println("Original Price: ₹" + price);
        System.out.println("Discount: ₹" + discount);
        System.out.println("Total Price: ₹" + total);
    }
}
