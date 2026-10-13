package HW;

public class SMSNotifier implements Notifier{
	  String message;

	    SMSNotifier(String message) {
	        this.message = message;
	    }

	    public void notifyUser() {
	        System.out.println("SMS: " + message);
	    }
	
	    public static void main(String[] args) {
	        EmailNotifier e = new EmailNotifier("Hello!");
	        SMSNotifier s = new SMSNotifier("Welcome!");

	        e.notifyUser();
	        s.notifyUser();
	    }
	}

