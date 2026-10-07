package HW;

public class CreditCardPayment extends Payment {

    public  CreditCardPayment(double amount) {
        super(amount);
    }

    @Override
    public void pay() {
        System.out.println("Paid ₹" + amount + " using Credit Card");
    }
}

