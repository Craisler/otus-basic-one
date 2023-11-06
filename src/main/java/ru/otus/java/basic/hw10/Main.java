package ru.otus.java.basic.hw10;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иван", "+79511111111");
        //    Метод add() должен позволять добавлять запись имя-телефон;
        phoneBook.add("Петр", "+79522222222");
        phoneBook.add("Петр", "+79533333333");
        phoneBook.add("Саша", "+79544444444");
        phoneBook.add("Оля", "+79555555555");
        phoneBook.add("Таня", "+79566666666");
        //    Метод find() выполнять поиск номер(-а, -ов) телефона по имени;
        //    Под одним именем может быть несколько телефонов (в случае однофамильцев, или наличии у одного человека нескольких номеров), тогда при запросе такой фамилии должны выводиться все телефоны;
        System.out.println("Поиск номеров по имени Петр: " + phoneBook.find("Петр"));
        System.out.println("Поиск номеров по имени Саша: " + phoneBook.find("Саша"));
        System.out.println("Поиск номеров по имени Коля: " + phoneBook.find("Коля")); // null, т.к. не найдены результаты
        //    Метод containsPhoneNumber должен проверять наличие телефона в справочнике.
        System.out.println("Поиск номера +79555555555:  " + phoneBook.containsPhoneNumber("+79555555555"));
        System.out.println("Поиск номера +79555555551: " + phoneBook.containsPhoneNumber("+79555555551"));
    }
}
