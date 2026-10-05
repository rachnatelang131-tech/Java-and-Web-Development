package Interface;

// 2p 2calss not possible
public class Child3 extends Democlass implements Addable{

	@Override
	public void addition() {
		// TODO Auto-generated method stub
		System.out.println("add");
	}

	@Override
	public void addition(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a+b);
	}
public static void main(String[] args) {
	Child3 c = new Child3();
	c.addition();
	c.addition(50, 50);
	c.display();
}
}
