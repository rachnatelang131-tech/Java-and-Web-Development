package HW;

public class Order {
	  static int count = 0;

	    Order() {
	        count++;
	    }

	    public static void main(String[] args) {
	        Order o1 = new Order();
	        Order o2 = new Order();
	        Order o3 = new Order();

	        System.out.println("Total orders: " + count);
	    }
	}

