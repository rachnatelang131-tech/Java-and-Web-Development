package Interface;

public class CarRide implements Ride{

	@Override
	public void bookRide(String pickup, String destination) {
		// TODO Auto-generated method stub
		System.out.println("pickup for carride is..." + pickup + " to " + destination);
	}

	@Override
	public void calculateFair(double distanceInKm) {
		// TODO Auto-generated method stub
		System.out.println("distance in km.. " + distanceInKm);
	}
	public static void main(String[] args) {
		CarRide c = new CarRide();
		c.bookRide("lohegaon", "charholi");
		c.calculateFair(35);
		
		BikeRide b = new BikeRide();
		b.bookRide("viman nagar", "phoneix marketcity");
		b.calculateFair(5);
		
	}


}
