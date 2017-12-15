package com.company.task24;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import static com.company.task24.ConnectionData.*;

public class InsertDataPreparedStatement {
    private static final String INSERT_QUERY =
            "INSERT INTO phones (user_id,phone_number) VALUES (?,?);";

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName(DRIVER);
        try (Connection connection =
                     DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement =
                     connection.prepareStatement(INSERT_QUERY)) {

            preparedStatement.setInt(1,6);
            preparedStatement.setString(2, "0501214444");
            preparedStatement.addBatch();

            preparedStatement.setInt(1,7);
            preparedStatement.setString(2, "0631234567");
            preparedStatement.addBatch();
            preparedStatement.executeBatch();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
