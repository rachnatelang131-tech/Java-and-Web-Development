package HW;

public class DeliveryPartner extends User{

	 DeliveryPartner(String n, Long p, String e) {
	        super(n, p, e);
	    }

	    void deliverOrder() {
	        System.out.println("Delivery partner delivered order");
	    }
	}


