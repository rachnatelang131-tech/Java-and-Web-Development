package Lambda;

interface Printable {
	void print(String s);
}

interface Divide {
	void div(int a, int b);
		
	}

public class Display {
	public static void main(String[] args) {
		Printable p = (s)->System.out.println(s);
		p.print("Lambada exp");
		
		Divide d = (a,b)->System.out.println(a/b);
		d.div(12, 3);
	}
}
	

