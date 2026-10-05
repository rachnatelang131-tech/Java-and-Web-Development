package Interface;

public class add implements Addable {

	@Override
	public void addition() {
		// TODO Auto-generated method stub
		// x = 87;
		System.out.println("add method");
	}

	@Override
	public void addition(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a+b+x);
	}
	
	public static void main(String[] args) {
		add a = new add();
		a.addition();
		a.addition(10, 20);
	}
	

}
