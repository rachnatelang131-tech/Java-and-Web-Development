package Lambda;

interface Show {
	void display(int num);
}
public class PositiveNegative {
	public static void main(String[] args) {
	Checkable c = num->{
		if (num >= 0) {
			return "positive";
		}
		else if (num <= 0) {
			return "negative";
		}
		else {
			return "zero";
		}
	};
System.out.println(c.Check(56));
System.out.println(c.Check(-23));
}

}
