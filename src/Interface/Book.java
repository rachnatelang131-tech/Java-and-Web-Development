package Interface;

public class Book implements Media{
	@Override
	public void id() {
		// TODO Auto-generated method stub
		System.out.println("id");
		
	}

	@Override
	public void description() {
		// TODO Auto-generated method stub
		System.out.println("Nice book");
		
	}
	public void pagecount() {
		System.out.println("pagecount is 80 pages");
	}

}
