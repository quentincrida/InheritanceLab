package management;

import staff.Employee;

public class Manager extends Employee{

    private String deptName;

   public Manager(String name, int socialSecurity, int salary, String deptName){
       super(name, socialSecurity, salary);
       this.deptName = deptName;
   }
}

