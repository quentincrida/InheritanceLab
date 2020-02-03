package staff;

public abstract class Employee {
    private String name;
    private int socialSecurity;
    private double salary;

    public Employee(String name, int socialSecurity, double salary) {
        this.name = name;
        this.socialSecurity = socialSecurity;
        this.salary = salary;
    }



    public String getName() {
        return name;
    }



    public int getSocialSecurity() {
        return socialSecurity;
    }


    public double getSalary() {
        return salary;
    }


    public void raiseSalary(double raise){
        salary = salary + raise;
    }

    public double payBonus(){
        return salary * 0.01;
    }



}
