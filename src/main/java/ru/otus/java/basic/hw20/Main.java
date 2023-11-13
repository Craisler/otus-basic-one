package ru.otus.java.basic.hw20;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

//Реализуйте метод, который подсчитывает сколько раз в текстовом файле (с кодировкой UTF-8) встречается указанная последовательность символов с учетом регистра;
//При запуске приложения пользователь вводит имя файла и искомую последовательность символов, программа должна выполнить расчет и напечатать результат в консоль.

public class Main {
    public static void main(String[] args) throws IOException {
        String rootDir = "src/main/java/ru/otus/java/basic/hw20/files/";
        ReadFindCount.readDir(rootDir);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя файла: ");
        String chosenFile = rootDir + scanner.nextLine();
        System.out.println("Введите последовательность символов: ");
        String characters = scanner.nextLine();
        File fileForRead = new File(chosenFile);
        try {
            System.out.println("Найдено: " + ReadFindCount.findMatches(fileForRead, characters));
        } catch (FileNotFoundException fileNotFound) {
            System.out.println(fileNotFound.getMessage());
            scanner.close();
        }
    }
}
