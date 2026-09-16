package Methods;

public class Simple_interest {
	public void simple_interest() {
		int p = 10000; //principal amount
		int r = 10; //rate in percent
		int t = 12; // time in months
		double simple_interest = (p*r*t)/100;
		
	    System.out.println(simple_interest);
	}
	public static void main(String[] args) {
		Simple_interest obj = new Simple_interest();
		obj.simple_interest();
		
	}

}
