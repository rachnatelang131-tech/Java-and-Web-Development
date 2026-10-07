package Lambda;

interface hello {
    void msg();
}

public class Helloworld {
    public static void main(String[] args) {

        hello h = ()-> System.out.println("Hello World");
        h.msg();
    }
}