package String;

public class All {
	public static void main(String[] args) {
		String s = "I love java";
		
		StringBuilder sb = new StringBuilder(s);
		sb.replace(7, 11, "python");
		System.out.println(sb );
		
		// for character replace
		StringBuilder sb1 = new StringBuilder("StringBuffer");
		sb.replace(3, 14, "Z");
		System.out.println(sb1 );
		
		// for chain operation
		StringBuilder sb2 = new StringBuilder(s);
		sb2.append( " java");
		sb2.insert(5, " world");
		System.out.println(sb2 );
	}

}
