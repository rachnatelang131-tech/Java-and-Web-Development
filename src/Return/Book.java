package Return;

public class Book {

    public void display(String title, String author, int year) {
        System.out.println("\"" + title + "\" by " + author + " (" + year + ")");
    }

    public static void main(String[] args) {
        Book b = new Book();
        b.display("The Alchemist", "Paulo Coelho", 1988);
    }
}