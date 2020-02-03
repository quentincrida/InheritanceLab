package management;

import staff.Employee;

public class Director extends Employee {

    private double budget;



    public Director(String name, int socialSecurity, double salary, double budget) {
        super(name, socialSecurity, salary);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }



}
