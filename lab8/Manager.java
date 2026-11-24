package javaapplication97;

import javaapplication97.Employee;

public class Manager extends Employee{
    private String department;
    private double allowance;

    public Manager(String name, int id, double salary,
                   String department, double allowance) {
        super(name, id, salary);
        this.department = department;
        this.allowance = allowance;
    }
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }
    @Override
    public double calculateBonus() {
        return getSalary() * 0.20;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
        System.out.println("Allowance: " + allowance);
    }
    @Override
    public String toString() {

        return super.toString() +
               ", Department: " + department +
               ", Allowance: " + allowance;
    }
}
    

