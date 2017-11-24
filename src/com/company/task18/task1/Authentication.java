package com.company.task18.task1;

/**
 * Created by student on 24.11.2017.
 */
public class Authentication {
    public static void main(String[] args) {
        try {
            System.out.println(isCorrect("login1", "password1", "password1"));
            System.out.println(isCorrect("login1loginloginlogin", "password1", "password1"));
            System.out.println(isCorrect("login1", "password1password1password1", "password1password1password1"));

            System.out.println(isCorrect("login1", "password1", "password2"));
            System.out.println(isCorrect("login1loginloginlogin", "password1", "password2"));
        } catch (WrongLoginException e) {
            e.printStackTrace();
        } catch (WrongPasswordException e) {
            e.printStackTrace();
        }
    }

    public static boolean isCorrect(String login, String password, String confPassword) throws WrongLoginException, WrongPasswordException {
        if (login.length() > 20) {
            throw new WrongLoginException("login exp");
        }
        if (password.length() > 20 || !password.equals(confPassword)) {
            throw new WrongPasswordException("password exp");
        }
        return true;
    }
}
