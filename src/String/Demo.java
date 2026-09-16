package String;

// string is immutable (can't be changed)
// string builder, string buffer --- mutable strings
public class Demo {
	public static void main(String[] args) {
		String s = "Happy Ganesh Chaturthi....";
		String s1 = new String("Hello, Whatsup?");
		
		System.out.println(s);
		System.out.println(s1);
		
		System.out.println();
		
		System.out.println(s.toLowerCase());
		System.out.println(s1.toLowerCase());
		
		System.out.println(s.toUpperCase());
		System.out.println(s1.toUpperCase());
		
		System.out.println(s.length());
		System.out.println(s1.length());
		
		System.out.println(s.indexOf('a')); // first occurance
		System.out.println(s.indexOf('a', 5));
		System.out.println(s1.indexOf('a')); // first occurance
		System.out.println(s1.indexOf('a', 5));
		
		System.out.println(s.lastIndexOf('a'));
		System.out.println(s.charAt(5));
		System.out.println(s1.lastIndexOf('a'));
		System.out.println(s1.charAt(5));
		
		System.out.println(s.contains("Happy"));
		System.out.println(s.startsWith("H"));
		System.out.println(s.endsWith("i"));
		System.out.println(s1.contains("Happy"));
		System.out.println(s1.startsWith("H"));
		System.out.println(s1.endsWith("i"));
		
		System.out.println(s.substring('5'));
		System.out.println(s.substring(5, 20));
		System.out.println(s1.substring('5'));
		System.out.println(s1.substring(5, 20));
		
		System.out.println(s.replace('a', '@'));
		System.out.println(s.concat("...!!!!"));
		
		System.out.println(s1.replace('a', '@'));
		System.out.println(s1.concat("...!!!!"));
		
		System.out.println(s);
		
		String s2 = "Rachna";
		String s3 = "rachna";
		System.out.println(s2.equals(s3));
		System.out.println(s2.equalsIgnoreCase(s3));
	}

}
