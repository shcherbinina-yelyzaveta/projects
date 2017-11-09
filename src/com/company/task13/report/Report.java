package com.company.task13.report;

import java.util.Date;

public class Report {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];
        employees[0] = new Employee("Ященко Олександр Владимирович", 2000);
        employees[1] = new Employee("Марценюк Богдан Вячеславович", 1011.5);
        employees[2] = new Employee();
        employees[3] = new Employee("Щербинина Елизавета Николаевна", 5500.5);
        generateReport(employees);
    }

    public static void generateReport(Employee[] employees) {
        System.out.printf("Report at %1$te %1$tB, %1$tY", new Date());
        for (Employee employee : employees) {
            System.out.printf("\nEmployee: %s gives salary:\n%62.2f$", employee.getFullName(), employee.getSalary());
        }
    }
}
