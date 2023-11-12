package ru.otus.java.basic.hw19;

import ru.otus.java.basic.hw19.fruits.Apple;
import ru.otus.java.basic.hw19.fruits.Fruit;
import ru.otus.java.basic.hw19.fruits.Orange;

public class Main {

// Создайте классы Fruit, Apple extends Fruit, Orange extends Fruit;
// Создайте класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта: Box только для яблок, Box только для апельсин, Box и для тех, и для других фруктов. Для хранения фруктов внутри коробки используйте ArrayList;
// Реализуйте метод добавления фрукта в коробку;
// Реализуйте метод weight, который высчитывает вес коробки (например, из веса одного фрукта и их количества, или может через суммирование, как посчитаете нужным). Вес фрукта задаете самостоятельно, единицы измерения не важны;
// Реализуйте метод compare, позволяющий сравнить текущую коробку с переданной в качестве аргумента. true – если их массы равны. Можно сравнивать коробки с разными типами фруктов;
// Реализуйте метод, позволяющий пересыпать фрукты из текущей коробки в другую. Помним про сортировку фруктов в коробках;

    public static void main(String[] args) {

        Box<Fruit> boxFruit = new Box<>();
        boxFruit.add(new Orange(5));
        boxFruit.add(new Apple(4));
        System.out.println(boxFruit);
        System.out.println("\nВес коробки с фруктами: " + boxFruit.getCurrentWeghtBox());

        Box<Orange> boxOrange = new Box<>();

        boxOrange.add(new Orange(5));
        boxOrange.add(new Orange(13));

        System.out.println(boxOrange);
        System.out.println("\nВес коробки с апельсинами: " + boxOrange.getCurrentWeghtBox());

        Box<Apple> boxApple = new Box<>();
        boxApple.add(new Apple(4));
        boxApple.add(new Apple(4));
        boxApple.add(new Apple(5));
        boxApple.add(new Apple(5));

        System.out.println(boxApple);
        System.out.println("\nВес коробки с яблоками: " + boxApple.getCurrentWeghtBox());

        System.out.println("\nСравниванием вес коробки фруктов с коробкой апельсинов (true – если их массы равны): " + boxFruit.compare(boxOrange));
        System.out.println("\nСравниванием вес коробки фруктов с коробкой яблок (true – если их массы равны): " + boxFruit.compare(boxApple));
        System.out.println("\nСравниванием вес коробки яблок с коробкой апельсинов (true – если их массы равны): " + boxOrange.compare(boxApple));

        Box<Fruit> newBoxFruit = new Box<>();
        newBoxFruit.moveToOtherBox(newBoxFruit);
        System.out.println("\nПересыпаем фрукты в новую коробку");
        System.out.println("\nСравниванием вес старой коробки фруктов с новой (true – если их массы равны): " + boxFruit.compare(newBoxFruit));

        Box<Orange> newBoxOrange = new Box<>();
        boxOrange.moveToOtherBox(newBoxOrange);
        System.out.println("\nПересыпаем апельсины в новую коробку");

        Box<Apple> newBoxApple = new Box<>();
        boxApple.moveToOtherBox(newBoxApple);
        System.out.println("\nПересыпаем яблоки в новую коробку");
    }
}