package com.company.task14;

import com.company.task13.report.Employee;

import java.text.DateFormat;
import java.util.Date;

public class FullReport {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];
        employees[0] = new Employee("Ященко Олександр Владимирович", 2000, 999999999999L);
        employees[1] = new Employee("Марценюк Богдан Вячеславович", 1011.5, 999999999999L);
        employees[2] = new Employee();
        employees[3] = new Employee("Щербинина Елизавета Николаевна", 5500.5, 999999999999L);
        generateReport(employees);
    }

    public static void generateReport(Employee[] employees) {
        System.out.printf("Report at %1$te %1$tB, %1$tY", new Date());
        for (Employee employee : employees) {
            System.out.printf("\nEmployee: %s gives salary:\n%62.2f$\non the %te day every month",
                    employee.getFullName(), employee.getSalary(), employee.getSalaryDate());
        }
    }
}
