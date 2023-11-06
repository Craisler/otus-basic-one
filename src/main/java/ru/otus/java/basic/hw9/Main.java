package ru.otus.java.basic.hw9;

//Реализуйте метод, принимающий в качестве аргументов числа min и max, и возвращающий ArrayList с набором последовательных значений в указанном диапазоне (min и max включительно, шаг - 1);
//Реализуйте метод, принимающий в качестве аргумента список целых чисел, суммирующий все элементы, значение которых больше 5, и возвращающий сумму;
//Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на список, метод должен переписать каждую заполненную ячейку списка указанным числом;
//Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на список, увеличивающий каждый элемент списка на указанное число;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0));
        System.out.println("Набор последовательных значений: " + minMaxArrays(8, 10) + "\n");
        System.out.println("Массив:" + Arrays.toString(new List[]{array}));
        System.out.println("Сумма чисел в массиве больше 5: " + sumValueMoreFive(array) + "\n");
        System.out.println("Сумма чисел в массиве больше 5: " + fillNum(5, array) + "\n");
        System.out.println("Увеличенные элементы списка в массиве: " + increaseElementNum(100, array) + "\n");
    }

    private static List<Integer> minMaxArrays(int min, int max) {
        System.out.println("\nЗадача 1: Реализуйте метод, принимающий в качестве аргументов числа min и max, и возвращающий ArrayList с набором последовательных значений в " +
                "указанном диапазоне (min и max включительно, шаг - 1);");
        List<Integer> arrList = new ArrayList();
        for (int i = min; i <= max; i += 1) {
            arrList.add(i);
        }
        return arrList;
    }

    private static int sumValueMoreFive(List<Integer> arr) {
        System.out.println("\nЗадача 2: Реализуйте метод, принимающий в качестве аргумента список целых чисел, суммирующий все элементы, значение которых больше 5, и " +
                "возвращающий сумму;");
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 5) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    private static List<Integer> fillNum(int num, List<Integer> arr) {
        System.out.println("Задача 3: Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на список, метод должен переписать каждую " +
                "заполненную ячейку списка указанным числом;");
        for (int i = 0; i < arr.size(); i++) {
            arr.set(i, num);
        }
        return arr;
    }

    private static List<Integer> increaseElementNum(int num, List<Integer> arr) {
        System.out.println("Задача 4: Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на список, увеличивающий каждый элемент списка на указанное число;");
        for (int i = 0; i < arr.size(); i++) {
            arr.set(i, arr.get(i) + num);
        }
        return arr;
    }
}