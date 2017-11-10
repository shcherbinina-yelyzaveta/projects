package com.company.task15;

/**
 * Created by student on 10.11.2017.
 */
public class User3 {
    private static String login = "shcherbinina";
    private static String password = "myPassword";

    static class Query {
        void printToLog() {
            System.out.printf("Пользователь с логином %s и паролем %s отправил запрос\n", login, password);
        }
    }

    public static void main(String[] args) {
        Query q = new Query();
        q.printToLog();
    }

}
