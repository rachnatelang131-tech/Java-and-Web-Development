package Interface;

public class Child implements Showable,Callable {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("show");
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("call");
	}
	public static void main(String[] args) {
		Child c = new Child();
		c.call();
		c.show();
	}

}
