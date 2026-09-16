package Parameter;

public class Area{
		public void area(int a, int b) {
			int ar = a * b;
			System.out.println("Area is: " + ar);
			System.out.println();
			}
		
		public static void main(String[] args) {
			Area r = new Area();
			r.area(3, 4);
			r.area(5, 6);
		}
		
	}
