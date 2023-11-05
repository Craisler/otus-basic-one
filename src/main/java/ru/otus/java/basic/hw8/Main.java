package ru.otus.java.basic.hw8;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[][] arr1 = {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        String[][] arr2 = {{"1", "2", "3", "4"}, {"1", "2", "", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        String[][] arr3 = {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        String[][] arr4 = {{"1", "2", "3", "Привет"}, {"1", "2", "3", ""}};
        String[][] arr5 = {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "Привет"}};
        try {
            System.out.println(arr4x4(arr1));
        } catch (AppArrayDataException | AppArraySizeException ex) {
            System.out.println(ex.getMessage() + "\n");
        }
        try {
            System.out.println(arr4x4(arr2));
        } catch (AppArrayDataException | AppArraySizeException ex) {
            System.out.println(ex.getMessage() + "\n");
        }
        try {
            System.out.println(arr4x4(arr3));
        } catch (AppArrayDataException | AppArraySizeException ex) {
            System.out.println(ex.getMessage() + "\n");
        }
        try {
            System.out.println(arr4x4(arr4));
        } catch (AppArrayDataException | AppArraySizeException ex) {
            System.out.println(ex.getMessage() + "\n");
        }
        try {
            System.out.println(arr4x4(arr5));
        } catch (AppArrayDataException | AppArraySizeException ex) {
            System.out.println(ex.getMessage() + "\n");
        }
    }

    public static boolean checkArr4x4(String[][] arr) {
        if (!(arr.length == 4)) return false;
        for (int i = 0; i < arr.length; i++) {
            if (!(arr[i].length == 4)) return false;
        }
        return true;
    }

    public static int arr4x4(String[][] arr) throws AppArrayDataException, AppArraySizeException {
        int result = 0;
        System.out.println("Массив: " + Arrays.deepToString(arr));
        if (!checkArr4x4(arr)) throw new AppArraySizeException("Неверный размер массива");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    result += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new AppArrayDataException("Некорректное значение в ячейке: [" + i + "]" + "[" + j + "]");
                }
            }
        }
        return result;
    }
}
