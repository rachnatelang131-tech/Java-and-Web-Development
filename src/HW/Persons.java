package HW;

public class Persons {
    private String name, email;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 120)
            this.age = age;
        else
            System.out.println("Invalid age!");
    }

    public void setEmail(String email) {
        if (email.contains("@"))
            this.email = email;
        else
            System.out.println("Invalid email!");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

public static void main(String[] args) {
    Persons p = new Persons();

    p.setName("Rahul");
    p.setAge(20);
    p.setEmail("rahul@gmail.com");

    System.out.println(p.getName());
    System.out.println(p.getAge());
    System.out.println(p.getEmail());
}
}
