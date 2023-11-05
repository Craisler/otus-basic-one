package ru.otus.java.basic.hw7.transport;

import ru.otus.java.basic.hw7.Terrain;
import ru.otus.java.basic.hw7.transport.interfaces.PetrolUse;
import ru.otus.java.basic.hw7.transport.interfaces.Transport;

import java.util.List;

public class Car implements Transport, PetrolUse {
    private String name;
    private int petrol;
    private int fuel;
    private boolean inUse;
    private final List<Terrain> availableTerrain = List.of(Terrain.PLAIN);
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
    public Car(String name, int petrol) {
        this.name = name;
        this.petrol = petrol;
        fuel = petrol;
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
        fuel = petrol;
    }
    @Override
    public void info() {
        System.out.println("Машина " + name);
        System.out.println("Остаток топлива " + fuel  +"\n");
    }
    @Override
    public boolean checkTerrain(Terrain terrain) {
        if (availableTerrain.contains(terrain)) return true;
        System.out.println("Машина не может передвигаться по указанной местности");
        return false;
    }
}