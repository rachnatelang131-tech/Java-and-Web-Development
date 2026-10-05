package Interface;

public class rachna implements Showable,Addable{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("show");
	}

	@Override
	public void addition() {
		// TODO Auto-generated method stub
		System.out.println("add method");
	}

	@Override
	public void addition(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a+b);
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("call");
	}
	
	public static void main(String[] args) {
		rachna r = new rachna();
		r.addition();
		r.addition(10, 20);
		r.call();
		r.show();
	}

	
}
