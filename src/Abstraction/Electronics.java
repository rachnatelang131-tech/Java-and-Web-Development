package Abstraction;

public class Electronics extends Product {
    Electronics(double price) {
        super(price);
    }

    @Override
    double calculateDiscount() {
        return price * 0.10;
    }
}

class Clothing extends Product {
    Clothing(double price) {
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