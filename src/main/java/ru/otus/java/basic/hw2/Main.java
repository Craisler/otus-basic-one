package ru.otus.java.basic.hw2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        metod1(5, "Строка");
        System.out.println(" ");

        metod2(2,4,5,6,6,3,4);
        System.out.println(" ");

        metod3(5, 2, 2, 3, 4, 5, 6);
        System.out.println(" ");

        metod4(10,1, 3, 44, 456, 456);
        System.out.println(" ");

        metod5(1, 3, 2, 1);
        System.out.println(" ");
    }

// -Реализуйте метод,

    public static void metod1(int n, String stroka) {
        // в качестве аргументов целое число и строку, и печатающий в консоль строку указанное количество раз
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите число повторения вывода текста");
//        int n = scanner.nextInt();
//        Scanner scanner2 = new Scanner(System.in);
//        System.out.println("Введите выводимое слово");
//        String s = scanner.nextLine();
        for (int i = 1; i <= n; i++)
            System.out.println(stroka + " " + i);
    }

    public static void metod2(int... arr) {
        // в качестве аргумента целочисленный массив, суммирующий все элементы, значение которых больше 5, и печатающий полученную сумму в консоль.
        int sum = 0;
        for (int arrNumber = 0; arrNumber < arr.length; arrNumber++) {
            if (arr[arrNumber] > 5) {
                sum += arr[arrNumber];
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Сумма чисел в массиве больше 5 = " + sum);
    }

    public static void metod3(int numberArr, int... arr) {
        // в качестве аргументов целое число и ссылку на целочисленный массив, метод должен заполниться каждую ячейку массива указанным числом.
        for (int numArrays = 0; numArrays < arr.length; numArrays++) {
            arr[numArrays] = numberArr;

        }
        System.out.println(Arrays.toString(arr));
    }

    public static void metod4(int numberArr, int... arr) {
//    в качестве аргументов целое число и ссылку на целочисленный массив, увеличивающий каждый элемент которого на указанное число
        for (int arrNumber = 0; arrNumber < arr.length; arrNumber++) {
            arr[arrNumber] = arr[arrNumber] + numberArr;
        }
        System.out.println(Arrays.toString(arr));
    }

    //    принимающий в качестве аргумента целочисленный массив и печатающий в консоль сумму элементов какой из половин массива больше.
    public static void metod5(int... arr) {
        int sum1 = 0;
        int sum2 = 0;
        for (int arrNumber = 0; arrNumber < arr.length / 2; arrNumber++) {
            sum1 += arr[arrNumber];
        }
        for (int arrNumber = arr.length / 2; arrNumber < arr.length; arrNumber++) {
            sum2 += arr[arrNumber];
        }

        if (sum1 == sum2) {
            System.out.println("Первая и вторая половина массива равны");
        } else if (sum1 > sum2) {
            System.out.println("Первая половина массива больше");
        } else {
            System.out.println("Вторая половина массива больше");
        }
    }

}