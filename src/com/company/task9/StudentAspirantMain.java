package com.company.task9;

import com.company.task9.aspirant.Aspirant;
import com.company.task9.student.Student;

/**
 * Created by Liza on 21.10.2017
 */
public class StudentAspirantMain {
    public static void main(String[] args) {
        Student smb = new Aspirant("Liza", "Shcherbinina", "kit25a", "JavaCourses");
        System.out.println(smb);
        Student[] students = new Student[3];
        students[0] = smb;
        students[1] = new Aspirant();
        students[2] = new Student();
        for (Student student : students) {
            student.getScholarship();
        }
    }
}
