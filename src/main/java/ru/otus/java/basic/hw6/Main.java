package ru.otus.java.basic.hw6;

import ru.otus.java.basic.hw6.cat.Cat;
import ru.otus.java.basic.hw6.plate.Plate;

public class Main {
    //    Создать массив котов ((когда создаем котов, они голодны) и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
    public static void main(String[] args) {

        Cat[] cats = {
                new Cat("Мурзик",5),
                new Cat("Барсик",10),
                new Cat("Муся",15),
                new Cat("Вася",20)
        };

        Plate plate = new Plate(30);
        for (Cat cat :cats) {
            cat.eatCat(plate);
            System.out.println(cat.toString());
        }
    }
}
