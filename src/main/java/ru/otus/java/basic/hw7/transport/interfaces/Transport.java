package ru.otus.java.basic.hw7.transport.interfaces;

import ru.otus.java.basic.hw7.Terrain;

public interface Transport {
    public boolean move(int distance, Terrain terrain);
    public void info();
    public boolean checkTerrain(Terrain terrain);
    public boolean use();
    public boolean free();
}
