package ru.otus.java.basic.hw4;

import java.time.Year;

public class Main {

//    В методе main() Main класса создайте массив из 10 пользователей и заполните его объектами и с помощью цикла
//    выведите информацию только о пользователях старше 40 лет.


    public static void main(String[] args) {
        int currentYear = Year.now().getValue();

        /*
        Массив из объектов пользователей
        */

        User[] arrayUsers = new User[]{
                new User("Иванов1", "Иван1", "Иванович1", 1968, "my1@email.ru"),
                new User("Иванов2", "Иван2", "Иванович2", 1978, "my2@email.ru"),
                new User("Иванов3", "Иван3", "Иванович3", 1988, "my3@email.ru"),
                new User("Иванов4", "Иван4", "Иванович4", 1955, "my4@email.ru"),
                new User("Иванов5", "Иван5", "Иванович5", 1999, "my5@email.ru"),
                new User("Иванов6", "Иван6", "Иванович6", 2000, "my6@email.ru"),
                new User("Иванов7", "Иван7", "Иванович7", 2001, "my7@email.ru"),
                new User("Иванов8", "Иван8", "Иванович8", 2002, "my8@email.ru"),
                new User("Иванов9", "Иван9", "Иванович9", 2003, "my9@email.ru"),
                new User("Иванов10", "Иван10", "Иванович10", 1982, "my10@email.ru"),
        };

        for (User arrayUser : arrayUsers) {
            if (currentYear - arrayUser.getBirthdateYear() > 40) {
                System.out.println(arrayUser.toString());
            }
        }
    }
}
