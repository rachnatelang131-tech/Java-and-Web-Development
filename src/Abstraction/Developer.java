package Abstraction;

public class Developer extends Freelancer {
    Developer(String name, String projectName, double ratePerHour) {
        super(name, projectName, ratePerHour);
    }

    @Override
    double calculateEarnings(int hours) {
        double earnings = hours * ratePerHour;

        if (hours > 40) {
            earnings += earnings * 0.20;
        }

        return earnings;
    }
}