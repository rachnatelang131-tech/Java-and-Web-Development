package Return;

public class Addition {
	public double add(int a,  int b) {
		double sum = a+b;
		return sum;
	}
	public static void main(String[] args) {
		Addition a = new Addition();
		System.out.println(a.add(15, 30));
		System.out.println(a.add(35,75));
	}

}
