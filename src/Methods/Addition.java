package Methods;

public class Addition {
	public void add() {
		int a = 12;
		int b = 13;
		int c = a+b;
		
		System.out.println(c);
		
	}
	
	public void multiply() {
		int x = 12;
		int y = 13;
		int z = x*y;
		System.out.println(z);
	}

	
	public static void main(String[] args) {
		Addition obj = new Addition();
		obj.add();
		obj.multiply();

		}

}
