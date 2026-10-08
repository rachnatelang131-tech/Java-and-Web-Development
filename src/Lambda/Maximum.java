package Lambda;

interface Max{
	int Findmax (int a, int b);
}

public class Maximum {
	public static void main(String[] args) {
		Max m = (a, b)->(a>b)?a:b;
		System.out.println(m.Findmax(10, 30));
		
	}

}
