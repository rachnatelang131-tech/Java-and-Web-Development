package Aggregation;

public class Demo {
	
	int rollno = 12;
	String name = "rachna";
	
	@Override
	public String toString() {
		// return "Welcome"
		return "values are " + rollno + " " +name;
	}
	
	public static void main(String[] args) {
		Demo d = new Demo();
		System.out.println(d);
	}
	

}
