package ru.otus.java.basic.hw14;

import ru.otus.java.basic.hw14.util.Measure;

public class Main {

//    Реализация №1
//
//    Реализуйте метод, который создает double массив длиной 100_000_000 элементов
//    Метод должен должен циклом for пройти по каждому элементу и посчитать его значение по формуле: array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
//    Засеките время выполнения цикла и выведите его в консоль.
//    Реализация №2:
//
//    Сделайте то же самое что и в реализации один, только чтобы массив заполняли 4 потока одновременно. То есть первый поток заполняет первую четверть массива, второй - вторую и т.д.
//    И посмотрите насколько быстрее выполнится работа по сравнению с одним потоком.

    public static void main(String[] args) {

        Measure.stamp();
        createRegArray();
        Measure.print();

        Measure.stamp();
        createThreadArray();
        Measure.print();
    }

    private static void createRegArray() {
        double[] array = new double[100_000_000];
        for (int i = 0; i < array.length; i++)
            array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
    }

    public static void createThreadArray() {
        double[] array = new double[100_000_000];

        for (int j = 0; j < 4; j++) {
            int counter = j;
            new Thread(
                    () -> {
                        int inc;
                        for (int i = 0; i < array.length; i = i + 4) {
                            inc = i + counter;
                            array[inc] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
                        }
                    }
            ).start();
        }
    }
}