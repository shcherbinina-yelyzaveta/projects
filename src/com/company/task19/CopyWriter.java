package com.company.task19;

import java.io.*;

/**
 * Created by student on 01.12.2017.
 */
public class CopyWriter {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src/com/company/task19/copied_file.txt"));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/com/company/task19/newfile.txt"))) {
            String s;
            while ((s = bufferedReader.readLine()) != null) {
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
