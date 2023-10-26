package ru.otus.java.basic.hw6.plate;

public class Plate {
    //    Реализуйте классы Тарелка (максимальное количество еды, текущее количество еды)
    //    Количество еды измеряем в условных единицах.
    //    При создании тарелки указывается ее объем и она полностью заполняется едой
    //    В тарелке должен быть метод, позволяющий добавить еду в тарелку. После добавления в тарелке не может оказаться еды больше максимума
    //    В тарелке должен быть boolean метод уменьшения количества еды, при этом после такого уменьшения, в тарелке не может оказаться
    //    отрицательное количество еды (если удалось уменьшить еду так, чтобы в тарелке осталось >= 0 кусков еды, то возвращаем true, в противном случае - false).
    /**
     * Максимальное количество еды
     */
    private final int maxFood;
    /**
     * Текущее количество еды
     */
    public int currentFood;

    public int getCurrentFood() {
        return currentFood;
    }

    public Plate(int maxFood) {
        this.maxFood = maxFood;
        this.currentFood = maxFood;
    }

    /**
     * Добавить еду в тарелку
     *
     * @param addFood количество еды
     */
    public void addFood(int addFood) {
        if (currentFood + addFood > maxFood) {
            System.out.println("В тарелке не может оказаться еды больше " + maxFood);
        } else {
            currentFood += addFood;
        }
    }

    /**
     * Уменьшить еду в тарелке
     *
     * @param reduceFood количество еды
     * @return результат поедания (true/false)
     */
    public boolean reduceFood(int reduceFood) {
        if (currentFood - reduceFood >= 0) {
            currentFood -= reduceFood;
            return true;
        } else {
            return false;
        }
    }


}
