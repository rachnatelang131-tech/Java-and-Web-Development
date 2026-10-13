package HW;

public class Document implements Printable{
	String content;

    Document(String content) {
        this.content = content;
    }

    public void print() {
        System.out.println(content);
    }

    public static void main(String[] args) {
        Document d = new Document("Hello Java");
        d.print();
    }
}


