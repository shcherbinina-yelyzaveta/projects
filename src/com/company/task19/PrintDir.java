package com.company.task19;

import java.io.File;

public class PrintDir {
    public static void main(String[] args) {
        printContent(new File("src"), 0);
    }

    private static void printContent(File file, int level) {
        String path = file.getName();
        System.out.printf("%" + (path.length() + level) + "s%n", path);
        if (file.isDirectory()) {
            for (File f : file.listFiles()) {
                printContent(f, level + 3);
            }
        }
    }
}
