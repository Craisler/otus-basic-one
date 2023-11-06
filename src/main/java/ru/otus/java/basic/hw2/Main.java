package ru.otus.java.basic.hw2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        printStringSize(5, "Строка");

        // Задаём одномерный массив (сразу один, не хочу дублировать)
        int[] arrays = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        sumValueMoreFive(arrays.clone());

        fillNum(5, arrays.clone());

        increaseElementNum(10, arrays.clone());

        arraySumHalfMore(arrays.clone());
    }

    /**
     * Метод принимающий в качестве аргументов целое число и строку, и печатающий в консоль строку указанное количество раз
     *
     * @param n    количество распечатываемых строк
     * @param text распечатываемая строка
     */
    private static void printStringSize(int n, String text) {
        System.out.println("Задача 1: Метод принимающий в качестве аргументов целое число и строку, и печатающий в консоль строку указанное количество раз");
        for (int i = 1; i <= n; i++)
            System.out.println(text + " " + i);
    }

    /**
     * Метод принимающий в качестве аргумента целочисленный массив, суммирующий все элементы, значение которых больше 5, и печатающий полученную сумму в консоль.
     *
     * @param arrays входной массив
     */
    private static void sumValueMoreFive(int[] arrays) {
        System.out.println("\nЗадача 2: Метод принимающий в качестве аргумента целочисленный массив, суммирующий все элементы, значение которых больше 5, и печатающий " +
                "полученную сумму в консоль.");
        int sum = 0;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] > 5) {
                sum += arrays[i];
            }
        }
        System.out.println("Массив:" + Arrays.toString(arrays));
        System.out.println("Сумма чисел в массиве больше 5 = " + sum + "\n");
    }

    /**
     * Метод принимающий в качестве аргументов целое число и ссылку на целочисленный массив, метод должен заполниться каждую ячейку массива указанным числом.
     *
     * @param num    целое число
     * @param arrays входной массив
     */
    private static void fillNum(int num, int[] arrays) {
        System.out.println("Задача 3: Метод принимающий в качестве аргументов целое число и ссылку на целочисленный массив, метод должен заполниться каждую ячейку " +
                "массива указанным числом.");
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = num;
        }
        System.out.println("Массив:" + Arrays.toString(arrays) + "\n");
    }

    /**
     * Метод принимающий в качестве аргументов целое число и ссылку на целочисленный массив, увеличивающий каждый элемент которого на указанное число
     *
     * @param num
     * @param arrays
     */
    private static void increaseElementNum(int num, int[] arrays) {
        System.out.println("Задача 4: Метод принимающий в качестве аргументов целое число и ссылку на целочисленный массив, увеличивающий каждый " +
                "элемент которого на указанное число");
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = arrays[i] + num;
        }
        System.out.println("Массив: " + Arrays.toString(arrays) + "\n");
    }

    /**
     * Метод принимающий в качестве аргумента целочисленный массив и печатающий в консоль сумму элементов какой из половин массива больше.
     *
     * @param arrays входной массив
     */
    private static void arraySumHalfMore(int[] arrays) {
        System.out.println("Задача 5: Метод принимающий в качестве аргумента целочисленный массив и печатающий в консоль сумму элементов какой " +
                "из половин массива больше.");
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arrays.length / 2; i++) {
            sum1 += arrays[i];
        }
        for (int i = arrays.length / 2; i < arrays.length; i++) {
            sum2 += arrays[i];
        }
        System.out.println("Массив: " + Arrays.toString(arrays));
        if (sum1 == sum2) {
            System.out.println("Первая и вторая половина массива равны\n");
        } else if (sum1 > sum2) {
            System.out.println("Первая половина массива больше\n");
        } else {
            System.out.println("Вторая половина массива больше\n");
        }
    }
}