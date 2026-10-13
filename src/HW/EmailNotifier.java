package HW;

public class EmailNotifier implements Notifier{
	String message;

    EmailNotifier(String message) {
        this.message = message;
    }

    public void notifyUser() {
        System.out.println("Email: " + message);
    }
}
	

