package ru.otus.java.basic.hw7.transport;

import ru.otus.java.basic.hw7.Terrain;
import ru.otus.java.basic.hw7.transport.interfaces.Transport;

import java.util.List;

public class Bike implements Transport {
    private String name;
    private boolean inUse;
    private final List<Terrain> availableTerrain = List.of(Terrain.PLAIN, Terrain.DENSE_FOREST);
    public Bike(String name) {
        this.name = name;
    }
    @Override
    public boolean checkTerrain(Terrain terrain) {
        if (availableTerrain.contains(terrain)) return true;
        return false;
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
    @Override
    public boolean move(int distance, Terrain terrain) {
        return checkTerrain(terrain);
    }
    @Override
    public void info() {
        System.out.println("Велосипед " + name  +"\n");
    }
}
