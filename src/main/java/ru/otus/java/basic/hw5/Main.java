package ru.otus.java.basic.hw5;

import ru.otus.java.basic.hw5.Animal.Animal;
import ru.otus.java.basic.hw5.Animal.Cat;
import ru.otus.java.basic.hw5.Animal.Dog;
import ru.otus.java.basic.hw5.Animal.Horse;

public class Main {
//    Создайте классы Cat, Dog и Horse с наследованием от класса Animal
//    У каждого животного есть имя, скорость бега и плавания (м/с), и выносливость (измеряется в условных единицах)
//    Затраты выносливости:
//    Все животные на 1 метр бега тратят 1 ед выносливости,
//    Собаки на 1 метр плавания - 2 ед.
//    Лошади на 1 метр плавания тратят 4 единицы
//    Кот плавать не умеет.
//    Реализуйте методы run(int distance) и swim(int distance), которые должны возвращать время, затраченное на указанное действие,
//    и “понижать выносливость” животного. Если выносливости не хватает, то возвращаем время -1 и указываем что у животного появилось состояние усталости.
//    При выполнении действий пишем сообщения в консоль.
//    Добавляем метод info(), который выводит в консоль состояние животного.

    public static void main(String[] args) {
        Animal cat = new Cat("Кошка", 5, 10);
        Animal dog = new Dog("Собака", 10, 15, 50);
        Animal horse = new Horse("Лошадь", 50, 10, 100);

        System.out.println(cat.info());
        System.out.println(dog.info());
        System.out.println(horse.info());

        System.out.println(cat.run(50));
        System.out.println(dog.run(50));
        System.out.println(horse.run(50));

        System.out.println(cat.swim(50));
        System.out.println(dog.swim(50));
        System.out.println(horse.swim(1));
    }
}