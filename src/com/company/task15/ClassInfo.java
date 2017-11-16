package com.company.task15;

import com.company.task8.Person;

import java.util.Arrays;

public class ClassInfo {
    public static void main(String[] args) {
        printInfo(Person.class);
    }

    public static void printInfo(Class aClass) {
        System.out.println("Class name-----------------" + aClass.getSimpleName());
        System.out.println("It's in package " + aClass.getPackage());
        System.out.println("Is array? " + aClass.isArray());
        System.out.println("Is interface? " + aClass.isInterface());
        System.out.println("Is primitive? " + aClass.isPrimitive());
        System.out.println("Fields: " + Arrays.toString(aClass.getDeclaredFields()));
        System.out.println("Methods: " + Arrays.toString(aClass.getMethods()));
        System.out.println("Constructors: " + Arrays.toString(aClass.getConstructors()));
        System.out.println("Super class - " + aClass.getSuperclass());
    }
}
