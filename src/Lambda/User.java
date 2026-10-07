package Lambda;

public class User implements Cloneable {
    int id;
    String name, address;

    public User(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void display() {
        System.out.println(id + " " + name + " " + address);
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        User u = new User(101, "rachna", "pune");
        u.display();

        User u1 = (User) u.clone();
        u1.display();
    }
}