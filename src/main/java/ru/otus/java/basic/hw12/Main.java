package ru.otus.java.basic.hw12;


import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.Scanner;

public class Main {

    //Реализуйте приложение, позволяющее работать с текстовыми файлами
    //При старте приложения, в консоль выводится список текстовых файлов из корневого каталоге проекта
    //Далее программа запрашивает имя файла, с которым хочет работать пользователь
    //Содержимое файла выводится в консоль
    //Затем любую введенную пользователем строку необходимо записывать в указанный файл

    public static void main(String[] args) throws FileNotFoundException {
        String rootDir = "src/main/java/ru/otus/java/basic/hw12/files/";
        System.out.println("Список файлов в директории " + rootDir);
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(Paths.get(rootDir))) {
            for (Path file : stream) {
                System.out.println(file.getFileName());
            }
        } catch (IOException | DirectoryIteratorException ex) {
            System.err.println(ex);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя файла который необходимо прочитать");
        String selectFileRead = scanner.nextLine();
        System.out.println("Содержимое файла: " + selectFileRead);
        String selectFDRead = rootDir + selectFileRead;

        try (BufferedInputStream reader = new BufferedInputStream(new FileInputStream(selectFDRead))) {
            int n = reader.read();
            while (n != -1) {
                System.out.print((char) n);
                n = reader.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();

        System.out.println("Укажите существующее или новое название файла для записи в него текста ");
        Scanner scanner1 = new Scanner(System.in);
        String selectFileWrite = scanner1.nextLine();
        System.out.println("Введите текст, который необходимо записать в файл");
        Scanner scanner2 = new Scanner(System.in);
        String inputText = scanner2.nextLine();

        String selectFDWrite = rootDir + selectFileWrite;
        try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(selectFDWrite, true))) {
            byte[] buffer = inputText.getBytes(StandardCharsets.UTF_8);
            for (int i = 0; i < buffer.length; i++) out.write(buffer[i]);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}