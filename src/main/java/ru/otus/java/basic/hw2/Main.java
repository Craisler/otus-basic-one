package ru.otus.java.basic.hw2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        printStringSize(5, "Строка");
        System.out.println(" ");
        
        sumValueMoreFive(2, 4, 5, 6, 6, 3, 4);
        System.out.println(" ");

        FillNum(5, 2, 2, 3, 4, 5, 6);
        System.out.println(" ");

        increaseElementNum(10, 1, 3, 44, 456, 456);
        System.out.println(" ");

        arraySumHalfMore(1, 3, 2, 1);
        System.out.println(" ");
    }

    /**
     * Метод принимающий в качестве аргументов целое число и строку, и печатающий в консоль строку указанное количество раз
     *
     * @param n    количество распечатываемых строк
     * @param text распечатываемая строка
     */
    public static void printStringSize(int n, String text) {
        System.out.println("Задача 1: Метод принимающий в качестве аргументов целое число и строку, и печатающий в консоль строку указанное количество раз");
        for (int i = 1; i <= n; i++)
            System.out.println(text + " " + i);
    }

    /**
     * Метод принимающий в качестве аргумента целочисленный массив, суммирующий все элементы, значение которых больше 5, и печатающий полученную сумму в консоль.
     *
     * @param arr входной массив
     */
    public static void sumValueMoreFive(int... arr) {
        System.out.println("Задача 2: Метод принимающий в качестве аргумента целочисленный массив, суммирующий все элементы, значение которых больше 5, и печатающий " +
                "полученную сумму в консоль.");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 5) {
                sum += arr[i];
            }
        }
        System.out.println("Массив:" + Arrays.toString(arr));
        System.out.println("Сумма чисел в массиве больше 5 = " + sum);
    }

    /**
     * Метод принимающий в качестве аргументов целое число и ссылку на целочисленный массив, метод должен заполниться каждую ячейку массива указанным числом.
     *
     * @param num целое число
     * @param arr входной массив
     */
    public static void FillNum(int num, int... arr) {
        System.out.println("Задача 3: Метод принимающий в качестве аргументов целое число и ссылку на целочисленный массив, метод должен заполниться каждую ячейку " +
                "массива указанным числом.");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = num;
        }
        System.out.println("Массив:" + Arrays.toString(arr));
    }

    /**
     * Метод принимающий в качестве аргументов целое число и ссылку на целочисленный массив, увеличивающий каждый элемент которого на указанное число
     *
     * @param num
     * @param arr
     */
    public static void increaseElementNum(int num, int... arr) {
        System.out.println("Задача 4: Метод принимающий в качестве аргументов целое число и ссылку на целочисленный массив, увеличивающий каждый " +
                "элемент которого на указанное число");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + num;
        }
        System.out.println("Массив: " + Arrays.toString(arr));
    }

    /**
     * Метод принимающий в качестве аргумента целочисленный массив и печатающий в консоль сумму элементов какой из половин массива больше.
     *
     * @param arr входной массив
     */
    public static void arraySumHalfMore(int... arr) {
        System.out.println("Задача 5: Метод принимающий в качестве аргумента целочисленный массив и печатающий в консоль сумму элементов какой " +
                "из половин массива больше.");
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            sum1 += arr[i];
        }
        for (int i = arr.length / 2; i < arr.length; i++) {
            sum2 += arr[i];
        }
        System.out.println("Массив: " + Arrays.toString(arr));
        if (sum1 == sum2) {
            System.out.println("Первая и вторая половина массива равны");
        } else if (sum1 > sum2) {
            System.out.println("Первая половина массива больше");
        } else {
            System.out.println("Вторая половина массива больше");
        }
    }
}