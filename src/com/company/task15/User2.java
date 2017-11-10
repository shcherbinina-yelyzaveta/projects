package com.company.task15;

/**
 * Created by student on 10.11.2017.
 */
public class User2 {
    private String login;
    private String password;

    public User2(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void createQuery() {
        class Query {
            public void printToLog() {
                System.out.printf("Пользователь с логином %s и паролем %s отправил запрос\n", login, password);
            }
        }
        Query q = new Query();
        q.printToLog();
    }

    public static void main(String[] args) {
        User2 user = new User2("shcherbinina", "mypassword");
        user.createQuery();
    }
}
