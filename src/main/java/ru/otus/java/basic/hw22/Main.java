package ru.otus.java.basic.hw22;

import java.util.Arrays;

public class Main {
    //Реализовать метод, принимающий в качестве аргумента одномерный целочисленный массив, и возвращающий новый массив, который содержит элементы исходного массива, идущие после последней единицы. Если входной массив не содержит единиц, то должно быть брошено RuntimeException.
    //Примеры:
    //Входной массив: [ 1 2 1 2 2 ] => Результат: [ 2 2 ]
    //Входной массив: [ 2 2 2 2 ] => RuntimeException
    //Реализовать метод, проверяющий входной массив, что он состоит только из чисел 1 и 2. Если в массиве присутствуют числа кроме 1 и 2, или нет хотя бы одной единицы или двойки, то результат должен быть равен false
    //Примеры:
    //[ 1 2 ] => true
    //[ 1 1 ] => false
    //[ 1 3 ] => false
    //[ 1 2 2 1 ] => true
    //Реализовать набор тестов для методов.
    public static void main(String[] args) {
        int[] arrays1 = new int[]{1, 2};
        int[] arrays2 = new int[]{1, 1};
        int[] arrays3 = new int[]{1, 3};
        int[] arrays4 = new int[]{1, 2, 2, 1};
        int[] arrays5 = new int[]{1, 2, 1, 2, 2};
        int[] arrays6 = new int[]{2, 2, 2, 2};


        checkOnlyOneTwo(arrays1);
        System.out.println("Массив " + Arrays.toString(arrays1) + " состоит только из 1 и 2: " + checkOnlyOneTwo(arrays1));
        checkOnlyOneTwo(arrays2);
        System.out.println("Массив " + Arrays.toString(arrays2) + " состоит только из 1 и 2: " + checkOnlyOneTwo(arrays2));
        checkOnlyOneTwo(arrays3);
        System.out.println("Массив " + Arrays.toString(arrays3) + " состоит только из 1 и 2: " + checkOnlyOneTwo(arrays3));
        checkOnlyOneTwo(arrays4);
        System.out.println("Массив " + Arrays.toString(arrays4) + " состоит только из 1 и 2: " + checkOnlyOneTwo(arrays4));

        returnAfterOne(arrays5);
        System.out.println("Массив " + Arrays.toString(arrays5) + " после последней единицы: " + Arrays.toString(returnAfterOne(arrays5)));
        returnAfterOne(arrays6);
        System.out.println("Массив после единицы:" + Arrays.toString(returnAfterOne(arrays6)));


    }

    private static int[] returnAfterOne(int[] arrays) {
        for (int i = arrays.length - 1; i >= 0; i--) {
            if (arrays[i] == 1) {
                return Arrays.copyOfRange(arrays, i + 1, arrays.length);
            }
        }
        throw (new RuntimeException());
    }


    public static boolean checkOnlyOneTwo(int[] arrays) {
        boolean onlyOne = false;
        boolean onlyTwo = false;

        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] < 1 || arrays[i] > 2) {
                return false;
            } else if (arrays[i] == 1) {
                onlyOne = true;
            } else if (arrays[i] == 2)
                onlyTwo = true;
        }
        return onlyOne && onlyTwo;
    }
}
