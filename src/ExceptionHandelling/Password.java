package ExceptionHandelling;

class WeakPasswordException extends Exception {}

public class Password {
    public static void main(String[] args) {
        String pass = "abc123";

        try {
            if (pass.length() < 8)
                throw new WeakPasswordException();

            System.out.println("Strong password");
        }
        catch (WeakPasswordException e) {
            System.out.println("Weak password!");
        }
    }
}