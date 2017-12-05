package com.company.task18.task1;

import java.util.regex.Pattern;

/**
 * Created by student on 24.11.2017.
 */
public class Authentication {
    public static void main(String[] args) {
        System.out.println(isCorrect("login_1", "password_1", "password_1"));
        System.out.println(isCorrect("login1loginloginlogin", "password1", "password1"));
        System.out.println(isCorrect("login1", "password1password1password1", "password1password1password1"));
        System.out.println(isCorrect("login1", "password1", "password2"));
        System.out.println(isCorrect("login1loginloginlogin", "password1", "password2"));
        System.out.println(isCorrect("login/03", "password", "password"));
        System.out.println(isCorrect("login_1", "password**", "password**"));
        System.out.println(isCorrect("login_1", "password**", "password"));
        System.out.println(isCorrect("login//1", "password**", "password"));
        System.out.println(isCorrect("login1", "password9101112131415", "password9101112131415"));
    }


    public static boolean isCorrect(String login, String password, String confPassword) {
        try {
            if (!Pattern.compile("\\w{1,20}").matcher(login).matches()) {
                throw new WrongLoginException("Логин неверный");
            }
            if (!password.equals(confPassword) || !Pattern.compile("\\w{1,20}").matcher(password).matches()) {
                throw new WrongPasswordException("Пароль неверный");
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.print(e.getMessage() + " ");
            return false;
        }
        System.out.print("Login: " + login + " Password: " + password + " ");
        return true;
    }
}
