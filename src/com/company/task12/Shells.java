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
        System.out.println("valueOf: " + d1 + " " + d2);
        System.out.println("parseXxx: " + d3);
        System.out.println("autobox: " + d4);

        System.out.println("int " + d2.intValue());
        System.out.println("short " + d2.shortValue());
        System.out.println("long " + d2.longValue());
        System.out.println("byte " + d2.byteValue());
        System.out.println("float " + d2.floatValue());
        System.out.println("double " + d2.doubleValue());

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
        System.out.println("valueOf: " + i1 + " " + i2);
        System.out.println("parseXxx: " + i3);
        System.out.println("autobox: " + i4);

        System.out.println("int " + i2.intValue());
        System.out.println("short " + i2.shortValue());
        System.out.println("long " + i2.longValue());
        System.out.println("byte " + i2.byteValue());
        System.out.println("float " + i2.floatValue());
        System.out.println("double " + i2.doubleValue());

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
        System.out.println("valueOf: " + b1 + " " + b2);
        System.out.println("parseXxx: " + b3);
        System.out.println("autobox: " + b4);

        System.out.println("int " + b2.intValue());
        System.out.println("short " + b2.shortValue());
        System.out.println("long " + b2.longValue());
        System.out.println("byte " + b2.byteValue());
        System.out.println("float " + b2.floatValue());
        System.out.println("double " + b2.doubleValue());

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
        System.out.println("valueOf: " + s1 + " " + s2);
        System.out.println("parseXxx: " + s3);
        System.out.println("autobox: " + s4);

        System.out.println("int " + s2.intValue());
        System.out.println("short " + s2.shortValue());
        System.out.println("long " + s2.longValue());
        System.out.println("byte " + s2.byteValue());
        System.out.println("float " + s2.floatValue());
        System.out.println("double " + s2.doubleValue());

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
        System.out.println("valueOf: " + l1 + " " + l2);
        System.out.println("parseXxx: " + l3);
        System.out.println("autobox: " + l4);

        System.out.println("int " + l2.intValue());
        System.out.println("short " + l2.shortValue());
        System.out.println("long " + l2.longValue());
        System.out.println("byte " + l2.byteValue());
        System.out.println("float " + l2.floatValue());
        System.out.println("double " + l2.doubleValue());

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
        System.out.println("valueOf: " + f1 + " " + f2);
        System.out.println("parseXxx: " + f3);
        System.out.println("autobox: " + f4);

        System.out.println("int " + f2.intValue());
        System.out.println("short " + f2.shortValue());
        System.out.println("long " + f2.longValue());
        System.out.println("byte " + f2.byteValue());
        System.out.println("float " + f2.floatValue());
        System.out.println("double " + f2.doubleValue());

        String s = Float.toString(f3);
        System.out.println(s);
        System.out.println("-------------------------------");
    }
}
