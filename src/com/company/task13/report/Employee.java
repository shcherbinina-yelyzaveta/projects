package com.company.task13.report;

public class Employee {
    private String fullName;
    private double salary;

    public Employee() {
        fullName = "somebody";
        salary = 0;
    }

    public Employee(String fullName, double salary) {
        this.fullName = fullName;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;

        if (Double.compare(employee.getSalary(), getSalary()) != 0) return false;
        return getFullName().equals(employee.getFullName());
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getFullName().hashCode();
        temp = Double.doubleToLongBits(getSalary());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Employee:" +
                "fullName='" + fullName + '\'' +
                ", salary=" + salary +
                '.';
    }
}
