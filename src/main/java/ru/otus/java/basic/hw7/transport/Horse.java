package ru.otus.java.basic.hw7.transport;

import ru.otus.java.basic.hw7.Terrain;
import ru.otus.java.basic.hw7.transport.interfaces.Transport;

import java.util.List;

public class Horse implements Transport {
    private String name;
    private int endurance;
    private boolean inUse;
    private final List<Terrain> availableTerrain = List.of(Terrain.PLAIN, Terrain.DENSE_FOREST);
    public Horse(String name, int endurance) {
        this.name = name;
        this.endurance = endurance;
    }
    @Override
    public boolean checkTerrain(Terrain terrain) {
        return availableTerrain.contains(terrain);
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
        return checkTerrain(terrain) && wasteStamina(distance);
    }
    public boolean wasteStamina(int distance) {
        if (distance > endurance) {
            System.out.println("У лошади нет сил");
            return false;
        }
        endurance -= distance;
        return true;
    }
    @Override
    public void info() {
        System.out.println("Лошадь " + name);
        System.out.println("Остаток сил " + endurance +"\n");
    }
}