package ru.otus.java.basic.hw5.Animal;

public class Dog extends Animal {

    public Dog(String name, int speedRun, int speedSwim, int endurance) {
        this.name = name;
        this.speedRun = speedRun;
        this.speedSwim = speedSwim;
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
        int enduranceSwim = 2;
        if (getEndurance() > distance * enduranceSwim) {
            endurance -= distance * enduranceSwim;
            System.out.println("\n" + name + " проплыла " + distance + " метров");
            return distance * speedSwim;
        } else {
            System.out.println("\n" + name + " устала");
            return -1;
        }
    }
}