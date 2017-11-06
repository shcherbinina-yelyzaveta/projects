package com.company.task13;

/**
 * Created by student on 06.11.2017.
 */
public class StringAppendDemo {
    public static void main(String[] args) {
        int a = 3;
        int b = 56;
        StringBuilder sb = new StringBuilder(10);
        System.out.println(sb.append(a).append("+").append(b).append("=").append((a + b)).toString());
        insertMethod(sb);
        System.out.println(sb.append(a).append("-").append(b).append("=").append((a - b)).toString());
        replaceMethod(sb);
        System.out.println(sb.append(a).append("*").append(b).append("=").append((a * b)).toString());
        insertMethod(sb);
    }

    public static void insertMethod(StringBuilder sb) {
        sb.deleteCharAt(4);
        sb.insert(4, "равно");
        System.out.println(sb);
        sb.delete(0, sb.capacity());
    }

    public static void replaceMethod(StringBuilder sb) {
        sb.replace(4, 5, "равно");
        System.out.println(sb);
        sb.delete(0, sb.capacity());
    }
}
