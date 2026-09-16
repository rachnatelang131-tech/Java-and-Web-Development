package Parameter;

public class Book_title {
		public void details(String title, String author, int year) {
			System.out.println(title + " by author " + author + "(" + year + ").");
		}
		
		public static void main(String[] args) {
			Book_title d = new Book_title();
			d.details("The Alchemist", "Paulo Coelho", 1988);
			d.details("Rich Dad Poor Dad", "Robert T. Kiyosaki", 1997);
			d.details("Think and Grow Rich", "Napoleon Hill", 1937);
			d.details("The Psychology of Money", "Morgan Housel", 2020);
		}

	}


