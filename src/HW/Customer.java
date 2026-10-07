package HW;

public class Customer extends User {
	String n;
	Long p;
	String e;
	
	Customer(String n, Long p, String e) {
        super(n, p, e);
    }
	void placeOrder() {
        System.out.println("Customer placed order");
    }
}


	


