package ru.otus.java.basic.hw10.util;

public class Measure {
    private static long time;

    public static void stamp() {
        time = System.currentTimeMillis();
    }

    public static void print() {
        time = System.currentTimeMillis() - time;
        System.out.println("Время выполнения:" + time);
    }
}
