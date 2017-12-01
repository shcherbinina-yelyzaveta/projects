package com.company.task19;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        try (FileInputStream fileIn = new FileInputStream("src\\com\\company\\task19\\file.txt");
             FileOutputStream fileOut = new FileOutputStream("src\\com\\company\\task19\\copied_file.txt")) {
            int a;
            // Копирование содержимого файла file.txt
            while ((a = fileIn.read()) != -1) {
                // Чтение содержимого файла file.txt и запись в copied_file.txt
                fileOut.write(a);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

