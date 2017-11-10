package com.company.task15;

/**
 * Created by student on 10.11.2017.
 */
public class User {
    private String login;
    private String password;

    public class Query {
        public void printToLog() {
            System.out.printf("Пользователь с логином %s и паролем %s отправил запрос\n", login, password);
        }
    }

    public void createQuery() {
        Query q = new Query();
        q.printToLog();
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public static void main(String[] args) {
        User user1 = new User("sherbinina", "0000");
        user1.createQuery();

        Query q1 = user1.new Query();
        q1.printToLog();

        Query q2 = new User("login", "password1111").new Query();
        q2.printToLog();
    }
}
