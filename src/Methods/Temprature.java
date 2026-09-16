package Methods;

public class Temprature {
	public void temprature() {
		double farenheit = 37.5;
		double celcius =  ((5*(farenheit-32.0))/9.0);
		
		System.out.println(celcius);
		
	}
	public static void main(String[] args) {
		Temprature obj = new Temprature();
		obj.temprature();
		
		
	}

}
