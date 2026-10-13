package ExceptionHandelling;

class InvalidUsernameException extends Exception {}

public class Username {
    public static void main(String[] args) {
        String name = "Ram";

        try {
            if (name.length() < 5)
                throw new InvalidUsernameException();

            System.out.println("Valid username");
        }
        catch (InvalidUsernameException e) {
            System.out.println("Invalid username!");
        }
    }
}