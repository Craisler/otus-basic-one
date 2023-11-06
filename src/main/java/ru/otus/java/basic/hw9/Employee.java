package ru.otus.java.basic.hw9;

public class Employee {
//Создайте класс Сотрудник с полями: имя, возраст;

    private final String name;
    private final Integer age;

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Employee(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Имя: " + name +
                ", Возраст: " + age;
    }
}
