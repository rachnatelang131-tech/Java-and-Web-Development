package HW;

public class Users {
    String username, email;

    Users(String u, String e) {
        if (u.isEmpty() || !e.contains("@"))
            throw new IllegalArgumentException();

        username = u;
        email = e;
    }

    public static void main(String[] args) {
        try {
            Users u = new Users("Rahul", "rahul@gmail.com");
            System.out.println("Valid details");
        }
        catch (Exception e) {
            System.out.println("Invalid details");
        }
    }
}