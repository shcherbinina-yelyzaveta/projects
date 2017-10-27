package com.company.task11.printable;

/**
 * Created by student on 27.10.2017.
 */
public class Magazine implements Printable {
    private String magazineName;

    public Magazine() {
        this.magazineName = "smth magazine";
    }

    public Magazine(String magazineName) {
        this.magazineName = magazineName;
    }

    public String getMagazineName() {
        return magazineName;
    }

    public void setMagazineName(String magazineName) {
        this.magazineName = magazineName;
    }

    @Override
    public void print() {
        System.out.println("Это журнал!");
    }

    public static void printMagazines(Printable[] printable) {
        for (Printable printable1 : printable) {
            if (printable1 instanceof Magazine) {
                printable1.print();
                System.out.println(((Magazine) printable1).getMagazineName());
            }
        }
    }
}
