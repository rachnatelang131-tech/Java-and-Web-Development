package Abstraction;

public abstract class Freelancer {
    String name, projectName;
    double ratePerHour;

    Freelancer(String name, String projectName, double ratePerHour) {
        this.name = name;
        this.projectName = projectName;
        this.ratePerHour = ratePerHour;
    }

    abstract double calculateEarnings(int hours);
}