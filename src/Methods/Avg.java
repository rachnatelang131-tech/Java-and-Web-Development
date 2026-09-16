package Methods;

public class Avg {
	public void Average() {
		int a = 12;
		int b = 13;
		int c = 14;
		int d = 15;
		int e = 16;
	    double Average = (a+b+c+d+e)/5; 
		System.out.println(Average);
	}
	
	
	public static void main(String[] args) {
		Avg obj = new Avg();
		obj.Average(); 
		obj.Average();
	}


}


