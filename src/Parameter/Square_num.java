package Parameter;

public class Square_num {
	public void square(int s) {
		int sr = s*s;
		System.out.println("Square of given num. is " + sr );
		System.out.println();
	}
	public static void main(String[] args) {
		Square_num n = new Square_num();
		n.square(4);
		n.square(8);
	}

}
