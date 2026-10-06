package Interface;

public class Dogs extends Cats implements Animal{

	public static void main(String[] args) {
		Dogs d = new Dogs();
		d.cat();
		d.dog();
	}
	

}
