package Interface;

public interface Addable {
	
	int x = 10;  // static final 
	
	void addition();
	void addition(int a, int b);  // 
	
	static void st_method() {
		System.out.println("this is static");
	}
	
	default void de_method() {
		System.out.println("this is default");
	}
	
	private void pr_method() {
		System.out.println("this is private");
	}
	
	

}
