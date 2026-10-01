package Abstraction;

public class Groceries extends Product {
    Groceries(double price) {
        super(price);
    }

    @Override
    double calculateDiscount() {
        return 0;
    }
}