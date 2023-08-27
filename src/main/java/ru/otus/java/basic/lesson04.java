package ru.otus.java.basic;

import java.util.Scanner;

public class lesson04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aiNumber = (int) (Math.random() * 10);
        System.out.println("Попробуйте угадать число от 0 до 9");
        while (true) {
            int answer = scanner.nextInt();
            if (answer == aiNumber) {
                System.out.println("Вы победили. Было загадано число " + aiNumber);
                break;
            } else if (answer > aiNumber) {
                System.out.println("Не угадали. Загаданное число меньше.");
            } else  {
                System.out.println("Не угадали. Загаданное число больше.");
            }
        }
    }

    public static void intervalInput() {
        int min = 1;
        int max = 10;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число в диапазон от " + min + " до " + max);
        int n;
        do {
            n = scanner.nextInt();
        } while (n < min || n > max);
        System.out.println("Вы ввели число " + n);
    }
}
