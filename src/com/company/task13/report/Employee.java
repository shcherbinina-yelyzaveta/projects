package com.company.task13.report;

import java.util.Date;

public class Employee {
    private String fullName;
    private double salary;
    private Date salaryDate;

    public Employee() {
        fullName = "somebody";
        salary = 0;
        salaryDate = new Date();
    }

    public Employee(String fullName, double salary, long ms) {
        this.fullName = fullName;
        this.salary = salary;
        this.salaryDate = new Date(ms);
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

    public Date getSalaryDate() {
        return salaryDate;
    }

    public void setSalaryDate(Date salaryDate) {
        this.salaryDate = salaryDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;

        if (Double.compare(employee.getSalary(), getSalary()) != 0) return false;
        if (getFullName() != null ? !getFullName().equals(employee.getFullName()) : employee.getFullName() != null)
            return false;
        return getSalaryDate() != null ? getSalaryDate().equals(employee.getSalaryDate()) : employee.getSalaryDate() == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getFullName() != null ? getFullName().hashCode() : 0;
        temp = Double.doubleToLongBits(getSalary());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (getSalaryDate() != null ? getSalaryDate().hashCode() : 0);
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
