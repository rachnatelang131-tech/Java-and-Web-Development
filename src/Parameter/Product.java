package Parameter;

public class Product {
	public void prod(int a,int b,int c) { //parametrized
		int result = (a*b*c);
		System.out.println(result);
	}
	public static void main(String[] args) {
		 Product p = new Product();
			p.prod(5, 6, 7);
			p.prod(12, 13, 14);
		}

}
