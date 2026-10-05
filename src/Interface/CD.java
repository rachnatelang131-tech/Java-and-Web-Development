package Interface;

public class CD implements Media{

	@Override
	public void id() {
		// TODO Auto-generated method stub
		System.out.println("231");
		
	}

	@Override
	public void description() {
		// TODO Auto-generated method stub
		System.out.println("Plays well");
	}
	public void playtime() {
		System.out.println("playtime is good 23 hrs");
	}
	public static void main(String[] args) {
		CD c = new CD();
		c.description();
		c.id();
		c.playtime();
		
		Book b = new Book();
		b.id();
		b.description();
		b.pagecount();
	}

	

}
