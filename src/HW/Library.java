package HW;

public class Library {
	  public static void main(String[] args) {
	        Book b1 = new Book("Java");
	        Book b2 = new Book("Python");

	        Book[] books = {b1, b2};

	        for (Book b : books)
	            System.out.println(b.name);
	    }
	}


