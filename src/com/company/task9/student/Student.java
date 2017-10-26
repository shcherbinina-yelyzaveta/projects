package com.company.task9.student;

/**
 * Класс Student содержит переменные:
 * String firstName, lastName;
 * String group;
 */
public class Student {
    private String firstName;
    private String lastName;
    private String group;

    public Student() {
        this.firstName = "first name";
        this.lastName = "last name";
        this.group = "group";
    }

    public Student(String firstName, String lastName, String group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", group='" + group + '\'' +
                '}';
    }

    public void getScholarship() {
        System.out.println("100 grn");
    }
}
