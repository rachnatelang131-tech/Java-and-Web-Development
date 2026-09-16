package Return;

public class Total_Bill {

    public void display(double price, int quantity) {
        double total = price * quantity;
        System.out.println("Total Bill: " + total);
    }

    public static void main(String[] args) {
        Total_Bill t = new Total_Bill();
        t.display(100, 5);
    }
}