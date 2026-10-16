package CollectionFramework;


public class Book {
    int id;
    String bname, bauthour;
    double bprice;

    public Book(int id, String bname, String bauthour, double bprice) {
        this.id = id;
        this.bname = bname;
        this.bauthour = bauthour;
        this.bprice = bprice;
    }

    public String toString() {
        return id + " " + bname + " " + bauthour + " " + bprice;
    }
}