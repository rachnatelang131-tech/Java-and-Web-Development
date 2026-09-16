package String;

import java.util.Scanner;

public class World {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder("Hello");
		System.out.println(sb);
		StringBuilder sb1 = new StringBuilder("world");
		System.out.println(sb1);
		
		sb.append(" World");
		sb1.append(" to the MS");
		
System.out.println(sb);
System.out.println(sb1);

sb.insert(6, "java");
System.out.println(sb);

	}

}
