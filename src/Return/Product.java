package Return;

public class Product {
	public int product(int a, int b, int c) {
		int product = a*b*c;
		return  product;	
	}
	public static void main(String[] args) {
		Product p = new Product();
		System.out.println(p.product(12, 13, 14));
		System.out.println(p.product(5, 6, 7));
	}

}
