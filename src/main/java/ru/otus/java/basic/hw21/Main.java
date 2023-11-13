package ru.otus.java.basic.hw21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    //Создайте пул потоков
    //Задайте пулу три задачи: первая должна 5 раз напечатать букву A, вторая - B, третья - C
    //Синхронизируйте потоки в пуле таким образом, чтобы в любой ситуации в консоль печаталась последовательность ABCABCABCABCABC
    //После печати всех символов программа должна завершиться
    public static void main(String[] args) {
        Object mon = new Object();
        Counter counter = new Counter();
        ExecutorService service = Executors.newFixedThreadPool(3);
        counter.setValue(3);

        service.submit(() -> {
            synchronized (mon) {
                try {
                    for (int i = 0; i < 5; i++) {
                        while (counter.getValue() != 3)
                            mon.wait();
                        System.out.print("A");
                        counter.setValue(1);
                        mon.notifyAll();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        service.submit(() -> {
            synchronized (mon) {
                try {
                    for (int i = 0; i < 5; i++) {
                        while (counter.getValue() != 1)
                            mon.wait();
                        System.out.print("B");
                        counter.setValue(2);
                        mon.notifyAll();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        service.submit(() -> {
            synchronized (mon) {
                try {
                    for (int i = 0; i < 5; i++) {
                        while (counter.getValue() != 2)
                            mon.wait();
                        System.out.print("C");
                        counter.setValue(3);
                        mon.notifyAll();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        service.shutdown();
    }
}