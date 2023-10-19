package ru.otus.java.basic.hw3;

import static java.lang.Math.random;

public class Main {

    private static int sumTwoString;
    private static int max;
    private static int sum;

    public static void main(String[] args) {
        // Задача 1
        System.out.println("1) Метод sumOfPositiveElements(..), принимающий в качестве аргумента целочисленный двумерный массив,\n" +
                "метод должен посчитать и вернуть сумму всех элементов массива, которые больше 0. \n");
        int[][] array = generate2dArray(5, 5);
        print2dArray(array);
        sumOfPositiveElements(array);
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

        //Задача 4
        System.out.println("4) Реализовать метод findMax(int[][] array) который должен найти и вернуть максимальный элемент массива;\n");
        int[][] arrMax = generate2dArray(5, 5);
        print2dArray(arrMax);
        findMax(arrMax);
        System.out.println("\nМаксимальный эллемент массива = " + max + "\n");

        // Задача 5
        System.out.println("5) Реализуйте метод, который считает сумму элементов второй строки двумерного массива, если второй строки не существует,\n" +
                "то в качестве результата необходимо вернуть -1");
        int[][] array5 = generate2dArray(1, 1);
        print2dArray(array5);
        sumTwoString2DArray(array5);
        System.out.println("\nCумма элементов второй строки двумерного массива = " + sumTwoString);
    }

    private static int sumTwoString2DArray(int[][] array5) {
        sumTwoString = 0;
        for (int i = 0; i < array5.length; i++) {
            for (int j = 0; j < array5[i].length; j++) {
                if (i == 1) {
                    sumTwoString += array5[i][j];
                }
            }
        }
        return array5.length<2 ? sumTwoString : -1;
    }

    private static int findMax(int[][] array) {
        max = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    private static void diagonalZero(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 0;
            array[i][array.length - i - 1] = 0;
        }
    }

    private static void arrayStars(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void print2dArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] generate2dArray(int x, int y) {
        int[][] arr = new int[x][y];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = randomNumber(0, 10);
            }
        }
        return arr;
    }

    private static int randomNumber(int min, int max) {
        return (int) ((random() * (max - min)) + min);
    }

    private static int sumOfPositiveElements(int[][] arr2d) {
        sum = 0;
        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d[i].length; j++) {
                if (arr2d[i][j] > 0) {
                    sum += arr2d[i][j];
                }
            }
        }
        return sum;
    }
}