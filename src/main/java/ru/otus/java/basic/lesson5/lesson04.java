//package ru.otus.java.basic;
//
//import java.util.Scanner;
//
//public class lesson04 {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Выберите сложность: от 1 до 3");
//        int difficulty = scanner.nextInt();
//        int max;
//        int tries;
//        if (difficulty == 1) {
//            max = 9;
//            tries = 10;
//        } else if (difficulty == 2) {
//            max = 14;
//            tries = 6;
//        } else if (difficulty == 3) {
//            max = 20;
//            tries = 4;
//        } else {
//            System.out.println("Я не буду с Вами играть. Вы читер!");
//            return;
//        }
        int aiNumber = (int) (Math.random() * (max + 1));
        System.out.println("Попробуйте угадать число от 0 до " + max + ". С " + tries + " попыток");
        while (true) {
            int answer = scanner.nextInt();
            if (answer == aiNumber) {
                System.out.println("Вы победили.");
                break;
            } else if (answer > aiNumber) {
                System.out.println("Не угадали. Загаданное число меньше.");
            } else {
                System.out.println("Не угадали. Загаданное число больше.");
            }
            tries--;
            if (tries == 0) {
                System.out.println("Вы проиграли." + "Загаданное число " + aiNumber);
                break;
            }
            System.out.println("У Вас осталось " + tries + " попыток");
        }
    }
//
//    public static void intervalInput() {
//        int min = 1;
//        int max = 10;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите число в диапазон от " + min + " до " + max);
//        int n;
//        do {
//            n = scanner.nextInt();
//        } while (n < min || n > max);
//        System.out.println("Вы ввели число " + n);
//    }
//
//    public static void quessNumber() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Выберите сложность: от 1 до 3");
//        int difficulty = scanner.nextInt();
//        int max;
//        int tries;
//        if (difficulty == 1) {
//            max = 9;
//            tries = 10;
//        } else if (difficulty == 2) {
//            max = 14;
//            tries = 5;
//        } else if (difficulty == 3) {
//            max = 20;
//            tries = 3;
//        } else {
//            System.out.println("Я не буду с Вами играть. Вы читер!");
//            return;
//        }
//        int aiNumber = (int) (Math.random() * (max + 1));
//        System.out.println("Попробуйте угадать число от 0 до " + max + ". С " + tries + " попыток");
//        while (true) {
//            int answer = scanner.nextInt();
//            if (answer == aiNumber) {
//                System.out.println("Вы победили.");
//                break;
//            } else if (answer > aiNumber) {
//                System.out.println("Не угадали. Загаданное число меньше.");
//            } else {
//                System.out.println("Не угадали. Загаданное число больше.");
//            }
//            tries--;
//            if (tries == 0) {
//                System.out.println("Вы проиграли.");
//                break;
//            }
//            System.out.println("У Вас осталось " + tries + " попыток");
//        }
//    }
//
//    public static void simpleCalculator() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите первое число");
//        int a = scanner.nextInt();
//        System.out.println("Введите операцию");
//        char operation = scanner.next().charAt(0);
//        System.out.println("Введите второе число");
//        int b = scanner.nextInt();
//        if (operation == '+') {
//            int result = a + b;
//            System.out.println(a + " + " + b + " = " + result);
//        } else if (operation == '-') {
//            int result = a - b;
//            System.out.println(a + " - " + b + " = " + result);
//        } else if (operation == '*') {
//            int result = a * b;
//            System.out.println(a + " * " + b + " = " + result);
//        } else if (operation == '/') {
//            if (b == 0) {
//                System.out.println("Делить на 0 непозволительно!");
//                return;
//            }
//            int result = a / b;
//            System.out.println(a + " / " + b + " = " + result);
//        } else {
//            System.out.println("Введена неизвестная операция");
//        }
//    }
//}
