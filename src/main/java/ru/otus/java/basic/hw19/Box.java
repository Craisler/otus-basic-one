package ru.otus.java.basic.hw19;

import ru.otus.java.basic.hw19.fruits.Fruit;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> list = new ArrayList<>();
    private int currentWeghtBox;

    @Override
    public String toString() {
        return "В коробке: " + list;
    }

    public void add(T fruit) {
        list.add(fruit);
        currentWeghtBox += fruit.getWeight();
    }

    public int getCurrentWeghtBox() {
        return currentWeghtBox;
    }

    public void setCurrentWeghtBox(int currentWeghtBox) {
        this.currentWeghtBox = currentWeghtBox;
    }

    public void moveToOtherBox(Box<T> box) {
        for (T t : list) {
            box.add(t);
        }
        list.clear();
        currentWeghtBox = 0;
    }

    public boolean compare(Box box) {
        if ((int) this.currentWeghtBox == (int) box.currentWeghtBox) {
            return true;
        }
        return false;
    }
}