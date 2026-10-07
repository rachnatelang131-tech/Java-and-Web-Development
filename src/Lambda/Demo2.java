package Lambda;

interface Checkable {
	String Check(int num);
}
public class Demo2 {
	public static void main(String[] args) {
		Checkable c = num->{
			if (num %2 == 0) {
				return "even";
			}
			else {
				return "odd";
			}
		};
	System.out.println(c.Check(56));
	System.out.println(c.Check(88));
	}
}


