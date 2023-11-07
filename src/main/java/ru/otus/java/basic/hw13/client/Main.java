package ru.otus.java.basic.hw13.client;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Сервер: выполняет математические вычисления: +,-,*,/
//        Клиент-серверное взаимодействие:
//        клиент подключается к серверу, получает строку с доступными мат. операциями. Отображает ее пользователю.
//        =пользователь вводит два числа и команду в консоль
//        отправляется запрос на сервер, сервер выполняет вычисления, возвращает результат клиенту.
//        клиент отображает результат в консоль
        Scanner scanner = new Scanner(System.in);
        String userInput = "connection try \n";
        byte[] bytes;

        try (Socket socket = new Socket("localhost", 8088)) {
            Client client = new Client(socket.getInputStream(), socket.getOutputStream());
            bytes = userInput.getBytes();
            client.sendMessage(bytes);
            client.receiveMessage();
            while (true) {
                userInput = scanner.nextLine()+"\n";
                bytes = userInput.getBytes();
                client.sendMessage(bytes);
                client.receiveMessage();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
