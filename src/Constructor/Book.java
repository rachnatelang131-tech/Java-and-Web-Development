package Constructor;

public class Book {

    String title;
    String authour;
    int pages;

    public void readBookInfo(String t, String a, int p) {
        title = t;
        authour = a;
        pages = p;
    }

    public void showBookTitle() {

        System.out.println("Title is..." + title);
    }

    public void showBookDetails() {

        System.out.println("Title is..." + title);
        System.out.println(" ");
        System.out.println("Authour is..." + authour);
        System.out.println(" ");
        System.out.println("Pages are..." + pages);
        System.out.println(" ");
    }

    public static void main(String[] args) {

        Book b1 = new Book();

        b1.readBookInfo("Wings of fire", "Unknown", 0);

        b1.showBookTitle();

        b1.showBookDetails();
    }
}
