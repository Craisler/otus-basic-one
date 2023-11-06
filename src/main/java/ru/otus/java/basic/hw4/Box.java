package ru.otus.java.basic.hw4;

//    Попробуйте реализовать класс по его описания: объекты класса Коробка должны иметь размеры и цвет.
//    Коробку можно открывать и закрывать. Коробку можно перекрашивать. Изменить размер коробки после создания нельзя.
//    У коробки должен быть метод, печатающий информацию о ней в консоль. В коробку можно складывать предмет (если в ней нет предмета),
//    или выкидывать его оттуда (только если предмет в ней есть), только при условии что коробка открыта (предметом читаем просто строку).
//    Выполнение методов должно сопровождаться выводом сообщений в консоль.

public class Box {
    private final int width;
    private final int length;
    private final int height;
    private String colour;
    private boolean isOpen;
    private String item;

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public void placeItemBox(String object) {
        if (isOpen && isEmptyBox()) {
            this.item = object;
            System.out.println("Положили предмет в коробку");
        } else System.out.println("Коробка закрыта");
    }

    public void throwItemBox() {
        if (isOpen && !isEmptyBox()) {
            this.item = null;
            System.out.println("Выкинули предмет из коробки");
        } else System.out.println("Коробка закрыта и пустая");
    }

    private boolean isEmptyBox() {
        if (Box.this.item == null) ;
        return true;
    }

    public Box(int width, int length, int hight, String colour, boolean isOpen, String item) {
        this.width = width;
        this.length = length;
        this.height = hight;
        this.colour = colour;
        this.isOpen = isOpen;
        this.item = item;
    }

    public String toString() {
        return "Ширина=" + width + "\n"
                + "Высота=" + height + "\n"
                + "Цвет='" + colour + "\n"
                + "Открыта=" + isOpen + "\n"
                + "Объект='" + item + "\n";
    }
}
