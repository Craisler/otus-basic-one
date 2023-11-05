package ru.otus.java.basic.hw7;

import ru.otus.java.basic.hw7.transport.interfaces.Transport;

public class Human {
    private String name;
    private Transport currentTransport;
    public Human(String name) {
        this.name = name;
    }
    public void useTransport(Transport transport) {
        if (transport.use()) {
            currentTransport = transport;
            System.out.println(name + " сел на транспорт");
            currentTransport.info();
        } else System.out.println("Транспорт занят");
    }
    public void freeTransport(Transport transport) {
        if (currentTransport == null) System.out.println(name + " и так без транспорта");
        else {
            currentTransport.free();
            currentTransport = null;
            System.out.println(name + " освободил транспорт");
        }
    }
    public void move(int distance, Terrain terrain) {
        if (currentTransport == null) System.out.println(name + " прошел " + distance + " по " + terrain.toString());
        else if (currentTransport.move(distance, terrain)) {
            System.out.println(name + " проехал " + distance + " по " + terrain.toString());
            currentTransport.info();
        }
    }
}