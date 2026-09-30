package Encapsulation;

public class User {

    private String password = "12345";

    public void changePassword(String oldPassword, String newPassword) {

        if (password.equals(oldPassword)) {
            password = newPassword;
            System.out.println("Password changed successfully");
        } else {
            System.out.println("Old password is incorrect");
        }
    }

    public static void main(String[] args) {

        User u = new User();

        u.changePassword("12345", "67890");
    }
}