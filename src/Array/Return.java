package Array;

public class Return {
	public String[] display() {
		
		String str[] = {"abc", "xyz", "pqr" };
		return str;
		
	}
	public static void main(String[] args) {
		Return r = new Return();
		
		String res[] = r.display();
		for (String s:res) {
			System.out.println(s);
		}
	}

}
