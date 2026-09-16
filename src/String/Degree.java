
package String;

import java.util.Scanner;

public class Degree {

	public static void main(String[] args) {

		Degree d = new Degree();

		d.getDegree();

	}

	public void getDegree() {

		Scanner sc = new Scanner(System.in);

		System.out.println("you have a degree or not");

		String degree = sc.next();

		if (degree.equals("yes")) {

			System.out.println("I got a degree");

		}

	}
}
