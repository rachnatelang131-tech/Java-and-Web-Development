package Interface;

public class MarineAnimals implements BlueWhale {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("i am bluewhale");
	}
	public static void main(String[] args) {
		MarineAnimals m = new MarineAnimals();
		Mammal a = new Mammal();
		m.display();
		a.display();
		
	}

}
