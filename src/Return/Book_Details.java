package Return;

public class Book_Details {

    public void display(String title, String author, double price) {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Book_Details b = new Book_Details();
        b.display("Java Programming", "James Gosling", 499.50);
    }
}