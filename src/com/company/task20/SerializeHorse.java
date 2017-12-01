package com.company.task20;

import com.company.task10.animals.Horse;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by student on 01.12.2017.
 */
public class SerializeHorse {
    public static void main(String[] args) {
        Horse horse1 = new Horse("Трава", "Конюшня №1", 35, new Halter("string"));
        save(horse1);
        Horse horse2 = load();
        System.out.println(horse2);
    }

    public static Horse load() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/com/company/task20/file.ser"))) {
            return (Horse) ois.readObject();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return new Horse();
        }
    }

    public static void save(Horse horse1) {
        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("src/com/company/task20/file.ser"))) {
            os.writeObject(horse1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
