package Abstraction;

public class Clothes extends Product {
    Clothes(double price) {
        super(price);
    }

    @Override
    double calculateDiscount() {
        if (price > 2000) {
            return price * 0.20;
        }
        return 0;
    }
}