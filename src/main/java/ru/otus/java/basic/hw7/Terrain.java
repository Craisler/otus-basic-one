package ru.otus.java.basic.hw7;

public enum Terrain {
    DENSE_FOREST("густой лес"), PLAIN("равнина"), SWAMP("болото");
    private String title;
    Terrain(String title) {
        this.title = title;
    }
    @Override
    public String toString() {
        return title;
    }
}
