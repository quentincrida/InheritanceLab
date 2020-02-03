package staff;

public abstract class Employee {
    private String name;
    private int socialSecurity;
    private int salary;

    public Employee(String name, int socialSecurity, int salary) {
        this.name = name;
        this.socialSecurity = socialSecurity;
        this.salary = salary;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSocialSecurity() {
        return socialSecurity;
    }

    public void setSocialSecurity(int socialSecurity) {
        this.socialSecurity = socialSecurity;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void raiseSalary(double raise){
        this.salary += 0.1;
    }

    public double payBonus(){
        return salary * 0.01;
    }



}
