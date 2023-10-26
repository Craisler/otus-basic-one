package ru.otus.java.basic.hw6.cat;

import ru.otus.java.basic.hw6.plate.Plate;

public class Cat {
    //    Кот (имя, аппетит).
    /**
     * Имя
     */
    private String name;
    /**
     * Аппетит
     */
    private int appetite;
    /**
     * Сытость
     */
    //    Каждому коту нужно добавить поле сытость. Если коту удалось покушать (хватило еды), сытость = true.
    private boolean satiety = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    //    Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
    /**
     * Кормим котов
     *
     * @param plate
     * @return
     */
    public boolean eatCat(Plate plate) {
        if (plate.getCurrentFood() >= appetite) {
            plate.reduceFood(appetite);
            satiety = true;
            System.out.println(name + " покушал!");
        } else {
            System.out.println(name + " голодный, будет есть только в том случае, если будет достаточно еды!");
        }
        return false;
    }

    @Override
    public String toString() {
        return "Имя:" + name + '\'' + "\n" +
                "Аппетит" + appetite + "\n" +
                "Требуется еды" + satiety + "\n";
    }
}
