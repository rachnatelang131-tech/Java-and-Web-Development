package Encapsulation;

public class Employee {

    private int id;
    private String name, dept;
    private double salary, bonus;

    public void setid(int id) {
        this.id = id;
    }

    public int getid() {
        return id;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getname() {
        return name;
    }

    public void setdept(String dept) {
        this.dept = dept;
    }

    public String getdept() {
        return dept;
    }

    public void setsalary(double salary) {
        this.salary = salary;
    }

    public double getsalary() {
        return salary;
    }

    public void setbonus(double bonus) {
        this.bonus = bonus;
    }

    public double getbonus() {
        return bonus;
    }
}

