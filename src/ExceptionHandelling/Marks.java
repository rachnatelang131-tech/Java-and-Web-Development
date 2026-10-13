package ExceptionHandelling;

class InvalidMarksException extends Exception {}

public class Marks {
    public static void main(String[] args) {
        int marks = 120;

        try {
            if (marks < 0 || marks > 100)
                throw new InvalidMarksException();

            System.out.println("Valid marks");
        }
        catch (InvalidMarksException e) {
            System.out.println("Invalid marks!");
        }
    }
}