package Return;

public class Message_Number {

    public void display(String message, int number) {
        System.out.println(message + ": " + number);
    }

    public static void main(String[] args) {
        Message_Number m = new Message_Number();
        m.display("Visitors today", 10);
    }
}