package ru.otus.java.basic.hw3;

import static java.lang.Math.random;

public class Main {

    public static void main(String[] args) {
        // Задача 1
        System.out.println("1) Метод sumOfPositiveElements(..), принимающий в качестве аргумента целочисленный двумерный массив,\n" +
                "метод должен посчитать и вернуть сумму всех элементов массива, которые больше 0. \n");
        int[][] array = generate2dArray(5, 5);
        print2dArray(array);
        int sum = sumOfPositiveElements(array);
        System.out.println("\nСумма всех элементов массива, которые больше 0 = " + sum + " \n");

        //Задача 2
        System.out.println("2) Реализовать метод, который принимает в качестве аргумента int size и печатает в\n" +
                " консоль квадрат из символов * со сторонами соответствующей длины;\n");
        arrayStars(5);

        //Задача 3
        System.out.println("\n3) Реализовать метод, принимающий в качестве аргумента двумерный целочисленный массив,\n" +
                "и зануляющий его диагональные элементы (можете выбрать любую из диагоналей, или занулить обе); \n");
        diagonalZero(array);
        print2dArray(array);
        System.out.println();

        //Задача 4
        System.out.println("4) Реализовать метод findMax(int[][] array) который должен найти и вернуть максимальный элемент массива;\n");
        int[][] arrMax = generate2dArray(5, 5);
        print2dArray(arrMax);
        int max = findMax(arrMax);
        System.out.println("\nМаксимальный эллемент массива = " + max + "\n");

        // Задача 5
        System.out.println("5) Реализуйте метод, который считает сумму элементов второй строки двумерного массива, если второй строки не существует,\n" +
                "то в качестве результата необходимо вернуть -1");
        int[][] arr = generate2dArray(5, 1);
        print2dArray(arr);
        int result = sumTwoString2DArray(arr);
        System.out.println("\nCумма элементов второй строки двумерного массива = " + result + "\n");
    }

    /**
     * Подсчет суммы второй строки массива
     * @param arr входной массив
     * @return сумма элементов второй строки двумерного массива
     */
    private static int sumTwoString2DArray(int[][] arr) {
        if (arr.length < 2) {
            return -1;
        }
        int sumTwoString = 0;
        for (int i = 0; i < arr[1].length; i++) {
            sumTwoString += arr[1][i];
        }
        return sumTwoString;
    }

    /**
     * Поиск максимального значения в массиве
     * @param arr входной массив
     * @return возврат максимального значения массива
     */
    private static int findMax(int[][] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

    /**
     * Проставление нулей по диагонали
     * @param array входной массив
     */
    private static void diagonalZero(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 0;
            array[i][array.length - i - 1] = 0;
        }
    }

    /**
     * Вывод массива со звездой
     * @param size размер длины массива
     */
    private static void arrayStars(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /**
     * Вывод массива с новой строки
     * @param arr массив
     */
    private static void print2dArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Генерация двумерного массива
     * @param x кол-во строк
     * @param y кол-во столбцов
     * @return возврат заполненного массива
     */
    private static int[][] generate2dArray(int x, int y) {
        int[][] arr = new int[x][y];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = randomNumber(0, 10);
            }
        }
        return arr;
    }

    /**
     * Генерация рандомного числа
     * @param min минимальноое число
     * @param max максимаьное число
     * @return вывод числа
     */
    private static int randomNumber(int min, int max) {
        return (int) ((random() * (max - min)) + min);
    }

    /**
     * Метод sumOfPositiveElements(..), принимающий в качестве аргумента целочисленный двумерный массив
     * метод должен посчитать и вернуть сумму всех элементов массива, которые больше 0
     * @param arr входные параметры
     * @return возврат суммы массива
     */
    private static int sumOfPositiveElements(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > 0) {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }
}