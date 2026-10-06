package Interface;

public class BikeRide implements Ride{

	@Override
	public void bookRide(String pickup, String destination) {
		// TODO Auto-generated method stub
		System.out.println("Pickup for bikeride is " + pickup + " to " + destination );
	}

	@Override
	public void calculateFair(double distanceInKm) {
		// TODO Auto-generated method stub
		System.out.println("distance in km ...." + distanceInKm);
		
	}
	
	

}
