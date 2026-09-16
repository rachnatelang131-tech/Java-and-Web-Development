package String;

public class BuilderBuffer {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello");
		System.out.println(sb);
		StringBuilder sb1 = new StringBuilder("welcome");
		System.out.println(sb1);
		
		sb.append(" World");
		sb1.append(" to the MS");
		
System.out.println(sb);
System.out.println(sb1);

System.out.println(sb.length());
System.out.println(sb.indexOf("Wo"));
System.out.println(sb.lastIndexOf("Wo")); // -1 NA
System.out.println(sb.charAt(2));
System.out.println(sb.substring(2));

System.out.println(sb.substring(2, 10));

sb.insert(0, "Hi ");
System.out.println(sb);

sb.replace(0, 2, "Ohh ");
System.out.println(sb);

sb.delete(0, 3);
System.out.println(sb);

sb.deleteCharAt(5);
System.out.println(sb);

sb.reverse();
System.out.println(sb);
		
	}

}
