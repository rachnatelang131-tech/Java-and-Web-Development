package Constructor;

public class Average {
	public Average () {
		int m1 = 50;
		int m2 = 70;
		int m3 = 80;
		
		int total = m1+m2+m3;
		
		System.out.println("Total is..." + total );
		
		double avg = total/3; 
		
		System.out.println("Avg is ..." + avg);
	}
	public static void main(String[] args) {
		Average obj = new Average();
		
	}

}
