package ru.otus.java.basic.hw5.Animal;

public class Horse extends Animal {

    public Horse(String name, int speedRun, int speedSwim, int endurance) {
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
        int enduranceSwim = 4;
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