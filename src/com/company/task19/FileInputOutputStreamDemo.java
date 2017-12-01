package com.company.task19;

import java.io.*;

public class FileInputOutputStreamDemo {
    public static void main(String[] args) {
        try (OutputStream output = new FileOutputStream("src\\com\\company\\task19\\a.txt");
             InputStream input = new FileInputStream("src\\com\\company\\task19\\a.txt")) {
            char[] c = {'a', 'b', 'c', 'd'};
            for (Character ch : c) {
                output.write(ch);
            }
            int size = input.available();
            for (int j = 0; j < size; j++) {
                System.out.print((char) input.read() + " ");
            }
        } catch (IOException e) {
            System.out.print("Exception");
        }
    }
}
