package ru.otus.java.basic.hw7.transport;

import ru.otus.java.basic.hw7.Terrain;
import ru.otus.java.basic.hw7.transport.interfaces.PetrolUse;
import ru.otus.java.basic.hw7.transport.interfaces.Transport;

public class Rover implements Transport, PetrolUse {
    private String name;
    private int tank;
    private int fuel;
    private boolean inUse;
    @Override
    public boolean checkTerrain(Terrain terrain) {
        return true;
    }
    @Override
    public boolean use() {
        if (!inUse) return inUse = true;
        return false;
    }
    @Override
    public boolean free() {
        if (inUse) {
            inUse = false;
            return true;
        }
        return false;
    }
    public Rover(String name, int tank) {
        this.name = name;
        this.tank = tank;
        fuel = tank;
    }
    @Override
    public boolean move(int distance, Terrain terrain) {
        return checkTerrain(terrain) && wasteFuel(distance);
    }
    @Override
    public boolean wasteFuel(int distance) {
        if (distance > fuel) {
            System.out.println("Недостаточно топлива");
            return false;
        }
        fuel -= distance;
        return true;
    }
    @Override
    public void refuel() {
        fuel = tank;
    }
    @Override
    public void info() {
        System.out.println("Вездеход " + name);
        System.out.println("Остаток топлива " + fuel +"\n");
    }
}