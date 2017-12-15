package com.company.task24;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import static com.company.task24.ConnectionData.*;

public class CreatingTable {
    private static final String CREATE_TABLE_QUERY =
            "CREATE TABLE `phones2` (" +
                    "`id` INT(5) NOT NULL AUTO_INCREMENT," +
                    "`user_id` INT(5) NOT NULL," +
                    "`phone_number` VARCHAR(10) NULL DEFAULT NULL," +
                    "PRIMARY KEY (`id`)" +
                    ")";

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName(DRIVER);
        try (Connection connection =
                     DriverManager.getConnection(URL, USER, PASSWORD);
             Statement statement = connection.createStatement()) {
            statement.executeUpdate(CREATE_TABLE_QUERY);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


