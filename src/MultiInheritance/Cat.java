package MultiInheritance;

public class Cat extends Dog {

	 Cat (String name) {
	        super(name);
	        System.out.println("Animal is cat");
	    }

	    public void cat() {
	        System.out.println("cat maws");
	    }

	    public static void main(String[] args) {

	        Cat c = new Cat("cutie");

	        c.dog();
	        c.cat();
	        c.animal();
	        
	        Dog d = new Dog("fluffy");
	        d.animal();
	        d.dog();
	    }
	}
	



