package Parameter;

public class Book {

	public void details(String title, String author, int price) {
		System.out.println("Book details: Book title is " + title + " written by " + author
				+ ", The price of the book is " + price + " rupees.");
	}

	public static void main(String[] args) {
		Book d = new Book();

		d.details("The Alchemist", "Paulo Coelho", 350);
		d.details("Rich Dad Poor Dad", "Robert T. Kiyosaki", 450);
		d.details("The Psychology of Money", "Morgan Housel", 399);
	}
}