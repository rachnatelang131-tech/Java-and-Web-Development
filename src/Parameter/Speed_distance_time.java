package Parameter;

public class Speed_distance_time{
	public void speed(double distance, double time ) {
		double speed = distance/time;
		System.out.println("speed is: " + speed); // speed in m/s
		System.out.println("distance is: " + distance); // distance inn meters
		System.out.println("time is: " + time); // time in seconds
	}
	public static void main(String[] args) {
		Speed_distance_time s = new Speed_distance_time();
		s.speed(12, 10);
	}

}
