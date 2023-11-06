package ru.otus.java.basic.hw5.Animal;

public abstract class Animal {
    String name;
    int speedRun;
    int speedSwim;
    int endurance;

    public int getEndurance() {
        return endurance;
    }

    public String info() {
        return "Имя: " + name + "\n" +
                "Скорость бега: " + speedRun + "\n" +
                "Скорость плавания: " + speedSwim + "\n" +
                "Выносливость: " + endurance + "\n";
    }

    public abstract int run(int distance);
    public abstract int swim(int distance);
}