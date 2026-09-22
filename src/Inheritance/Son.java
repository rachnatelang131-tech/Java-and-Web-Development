package Inheritance;

public class Son extends Parents {
	public void message() {
		System.out.println("This is first subclass");
	}
public static void main(String[] args) {
	Son s = new Son();
	Parents p = new Parents();
	Daughter d = new Daughter();
	s.message();
	d.messeges();
	p.display();
}
}
