package ru.otus.java.basic.hw03;

public class Main {
    public static void main(String[] args) {
        // (1) Реализуйте метод greetings(), который при вызове должен отпечатать в столбец 4 слова: Hello, World, from, Java;
        greetings();
        System.out.println("\n");

        // (2) Реализуйте метод checkSign(..), принимающий в качестве аргументов 3 int переменные a, b и c. Метод должен посчитать
        //их сумму, и если она больше или равна 0, то вывести в консоль сообщение “Сумма положительная”, в противном случае -
        //“Сумма отрицательная”;
        checkSign(-1, 2, -3);
        System.out.println("\n");

        //(3) Реализуйте метод selectColor() в теле которого задайте int переменную data с любым начальным значением. Если data
        //меньше 10 включительно, то в консоль должно быть выведено сообщение “Красный”, если от 10 до 20 включительно, то
        //“Желтый”, если больше 20 - “Зеленый”;
        selectColor();
        System.out.println("\n");

        // (4) Реализуйте метод compareNumbers(), в теле которого объявите две int переменные a и b с любыми начальными
        //значениями. Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”;
        compareNumbers();
        System.out.println("\n");

        // (5) Создайте метод addOrSubtractAndPrint(int initValue, int delta, boolean increment). Если increment = true, то метод должен к
        //initValue прибавить delta и отпечатать в консоль результат, в противном случае - вычесть;
        addOrSubtractAndPrint(2,2, true);
    }

    public static void greetings() {
        System.out.println("Hello \nWorld \nfrom \nJava");
    }

    public static void checkSign(int a, int b, int c) {
        int sum = a + b + c;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательаня");
        }
    }

    public static void selectColor() {
        int data = 22;
        if (data <= 10) {
            System.out.println("Красный");
        } else {
            if (data > 10 && data < 20) {
                System.out.println("Жёлтый");
            } else {
                if (data > 20) {
                    System.out.println("Зелёный");
                }
            }
        }
    }

    public static void compareNumbers() {
        int a = 4;
        int b = 5;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment == true) {
            System.out.println(initValue + delta);
        } else {
            System.out.println(initValue - delta);
        }
    }
}