package com.company.task17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Student {
    private String fullName;
    private String group;
    private int course;
    private int[] values;

    public Student() {
    }

    public Student(String fullName, String group, int course, int[] values) {
        this.fullName = fullName;
        this.group = group;
        this.course = course;
        this.values = values;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int[] getValues() {
        return values;
    }

    public void setValues(int[] values) {
        this.values = values;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;

        Student student = (Student) o;

        if (getCourse() != student.getCourse()) return false;
        if (getFullName() != null ? !getFullName().equals(student.getFullName()) : student.getFullName() != null)
            return false;
        if (getGroup() != null ? !getGroup().equals(student.getGroup()) : student.getGroup() != null) return false;
        return Arrays.equals(getValues(), student.getValues());
    }

    @Override
    public int hashCode() {
        int result = getFullName() != null ? getFullName().hashCode() : 0;
        result = 31 * result + (getGroup() != null ? getGroup().hashCode() : 0);
        result = 31 * result + getCourse();
        result = 31 * result + Arrays.hashCode(getValues());
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", values=" + Arrays.toString(values) +
                '}';
    }

    public boolean nextCourse() {
        int result = 0;
        for (int i : values) {
            result += i;
        }
        if (result / values.length >= 3) {
            return true;
        }
        return false;
    }

    public static void printStudents(List students) {
        Iterator<Student> iterator = students.iterator();
        System.out.println("Отчисленные студенты:");
        while (iterator.hasNext()) {
            Student s = iterator.next();
            if (!s.nextCourse()) {
                System.out.println(s.fullName + " отчислен");
                //students.remove(s);
                iterator.remove();
            }
        }
    }

    public static void printStudents(List students, int course) {
        Iterator<Student> iterator = students.iterator();
        System.out.println("------Студенты курса " + course);
        while (iterator.hasNext()) {
            Student s = iterator.next();
            if (s.course == course) {
                System.out.println(s.fullName);
            }
        }
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Щербинина Е.Н.", "КИТ 25а", 3, new int[]{5, 5, 5, 5}));
        students.add(new Student("Федорченко Г.В.", "КИТ 14а", 4, new int[]{4, 5, 3, 4}));
        students.add(new Student("Ященко А.В.", "КИТ 25а", 3, new int[]{5, 4, 5, 4}));
        students.add(new Student("Марценюк Б.В.", "КИТ 25а", 3, new int[]{3, 3, 3, 4}));
        students.add(new Student("Заболотная К.С.", "КИТ 36", 2, new int[]{4, 3, 2, 2}));
        printStudents(students);
        printStudents(students, 2);
        printStudents(students, 3);
        printStudents(students, 4);
    }
}
