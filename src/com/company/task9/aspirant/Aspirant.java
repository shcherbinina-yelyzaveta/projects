package com.company.task9.aspirant;

import com.company.task9.student.Student;

/**
 * Класс Aspirant, аспирант отличается от студента наличием некой научной работы
 */
public class Aspirant extends Student {
    String scientificWork;

    public Aspirant() {
        this.scientificWork = "scientific work";
    }

    public Aspirant(String firstName, String lastName, String group, String scientificWork) {
        super(firstName, lastName, group);
        this.scientificWork = scientificWork;
    }

    public String getScientificWork() {
        return scientificWork;
    }

    public void setScientificWork(String scientificWork) {
        this.scientificWork = scientificWork;
    }

    @Override
    public String toString() {
        return super.toString() + "Aspirant{" +
                "scientificWork='" + scientificWork + '\'' +
                '}';
    }

    public void getScholarship() {
        System.out.println("200 grn");
    }
}
