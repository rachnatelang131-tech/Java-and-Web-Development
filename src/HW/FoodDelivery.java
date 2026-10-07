package HW;

public class FoodDelivery {
	public static void main(String[] args) {
        Customer c = new Customer("Rachna", 9876543210L, "rachna@gmail.com");
        DeliveryPartner d = new DeliveryPartner("Amit", 9876501234L, "amit@gmail.com");

        c.display();
        c.placeOrder();

        d.display();
        d.deliverOrder();
    }
}

