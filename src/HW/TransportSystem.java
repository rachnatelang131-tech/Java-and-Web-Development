package HW;

public class TransportSystem {
		
		public static void main(String[] args) {
	        Transport c = new Car("Car", "C101", 50);
	        Transport b = new Bus("Bus", "B101", 50);
	        Transport t = new Train("Train", "T101", 100);

	        c.calculateFair();
	        b.calculateFair();
	        t.calculateFair();
	}

}
