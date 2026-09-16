package Variables;

public class Demo {
	
	int z; // instance variable -- comp class
	
	public void add() {
		int x = 10;
		int y = 20;
		z = x+y;
		System.out.println(z);
	}
	
	public void display() {
		z = 66;
		System.out.println(z);
	}
	
	public static void main(String[] args) {
		Demo d = new Demo();
		d.add();
		d.display();
	}

}
