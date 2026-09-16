package Constructor;

public class Add {
	
	public void Add() {
		int a = 12;
		int b = 13;
		int c = a  + b;
		System.out.println(c);
	}
	
	public Add() {
		int x = 22;
		int y = 33;
		int z = x  + y;
		System.out.println(z);
	}
	
	public static void main(String[] args) {
		Add obj = new Add();
		obj.Add();
	}

}
