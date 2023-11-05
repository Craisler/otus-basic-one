package ru.otus.java.basic.hw7;

import ru.otus.java.basic.hw7.transport.Bike;
import ru.otus.java.basic.hw7.transport.Car;
import ru.otus.java.basic.hw7.transport.Horse;
import ru.otus.java.basic.hw7.transport.Rover;
import ru.otus.java.basic.hw7.transport.interfaces.Transport;

public class MainApp {
    public static void main(String[] args) {
        Human man1 = new Human("Василий");
        man1.move(10, Terrain.DENSE_FOREST);
        Transport car1 = new Car("Лада", 50);
        man1.useTransport(car1);
        man1.move(10, Terrain.PLAIN);
        man1.move(10, Terrain.DENSE_FOREST);
        man1.move(50, Terrain.SWAMP);
        Human man2 = new Human("Иван");
        man2.useTransport(car1);
        man1.freeTransport(car1);
        Transport rover1 = new Rover("Вездеход", 100);
        man1.useTransport(rover1);
        man1.move(1000, Terrain.SWAMP);
        man1.freeTransport(rover1);
        Transport bike = new Bike("Десна");
        man1.useTransport(bike);
        man1.move(100, Terrain.DENSE_FOREST);
        man1.freeTransport(bike);
        man1.freeTransport(bike);
        Transport horse = new Horse("Черныш", 20);
        man1.useTransport(horse);
        man1.move(10, Terrain.SWAMP);
        man1.move(10, Terrain.PLAIN);
    }
}