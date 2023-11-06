package ru.otus.java.basic.hw5.Animal;

public class Cat extends Animal {

    public Cat(String name, int speedRun, int endurance) {
        this.name = name;
        this.speedRun = speedRun;
        this.endurance = endurance;
    }

    @Override
    public int run(int distance) {
        int enduranceRun = 1;
        if (getEndurance() >= distance * enduranceRun) {
            endurance -= distance * enduranceRun;
            System.out.println("\n" + name + " пробежала " + distance + " метров");
            return distance * speedRun;
        } else {
            System.out.println("\n" + name + " устала");
            return -1;
        }
    }

    @Override
    public int swim(int distance) {
        System.out.println("\n" + "Кошка не умеет плавать");
        return -1;
    }


}