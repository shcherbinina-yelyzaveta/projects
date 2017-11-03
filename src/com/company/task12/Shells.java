package com.company.task12;

/**
 * Created by student on 03.11.2017.
 */
public class Shells {
    public static void main(String[] args) {
        doubleMethod();
        intMethod();
        byteMethod();
        shortMethod();
        longMethod();
        floatMethod();
    }

    public static void doubleMethod() {
        System.out.println("------------DOUBLE-------------");
        Double d1 = Double.valueOf(1);
        Double d2 = Double.valueOf("3.3154324154854");
        double d3 = Double.parseDouble("451.4");
        Double d4 = 134.583;
        print(d1,d2,d3,d4);

        String s = Double.toString(d3);
        System.out.println(s);
        System.out.println("-------------------------------");
    }

    public static void intMethod() {
        System.out.println("--------------INT--------------");
        Integer i1 = Integer.valueOf(1);
        Integer i2 = Integer.valueOf("356455");
        int i3 = Integer.parseInt("451");
        Integer i4 = 134;
        print(i1,i2,i3,i4);

        String s = Integer.toString(i3);
        System.out.println(s);
        System.out.println("-------------------------------");
    }

    public static void byteMethod() {
        System.out.println("--------------BYTE-------------");
        Byte b1 = Byte.valueOf((byte) 12);
        Byte b2 = Byte.valueOf("127");
        byte b3 = Byte.parseByte("4");
        Byte b4 = 13;
        print(b1,b2,b3,b4);

        String s = Byte.toString(b3);
        System.out.println(s);
        System.out.println("-------------------------------");
    }


    public static void shortMethod() {
        System.out.println("-------------SHORT-------------");
        Short s1 = Short.valueOf((short) 15);
        Short s2 = Short.valueOf("32767");
        short s3 = Short.parseShort("451");
        Short s4 = 134;
        print(s1,s2,s3,s4);

        String s = Short.toString(s3);
        System.out.println(s);
        System.out.println("-------------------------------");
    }

    public static void longMethod() {
        System.out.println("--------------LONG-------------");
        Long l1 = Long.valueOf(1L);
        Long l2 = Long.valueOf("3545455522233");
        long l3 = Long.parseLong("451");
        Long l4 = 134L;
        print(l1,l2,l3,l4);

        String s = Long.toString(l3);
        System.out.println(s);
        System.out.println("-------------------------------");
    }

    public static void floatMethod() {
        System.out.println("-------------FLOAT-------------");
        Float f1 = Float.valueOf(1f);
        Float f2 = Float.valueOf("3.11111111");
        float f3 = Float.parseFloat("451");
        Float f4 = 134.0F;
        print(f1,f2,f3,f4);

        String s = Float.toString(f3);
        System.out.println(s);
        System.out.println("-------------------------------");
    }

    public static void print(Number b1, Number b2, Number b3, Number b4) {
        System.out.println("valueOf: " + b1 + " " + b2);
        System.out.println("parseXxx: " + b3);
        System.out.println("autobox: " + b4);

        System.out.println("int " + b2.intValue());
        System.out.println("short " + b2.shortValue());
        System.out.println("long " + b2.longValue());
        System.out.println("byte " + b2.byteValue());
        System.out.println("float " + b2.floatValue());
        System.out.println("double " + b2.doubleValue());
    }
}
