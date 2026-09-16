package Parameter;

public class Kilometer_miles {
	public void kilometer(double kilometer) {
		double miles = kilometer*0.621371;
		System.out.println("Miles: " + miles);
		System.out.println();
		System.out.println("kilometer: " + kilometer);
		System.out.println();

	}
	public static void main(String[] args) {
		Kilometer_miles k = new Kilometer_miles();
		k.kilometer(13);
		k.kilometer(15);
	}

}
