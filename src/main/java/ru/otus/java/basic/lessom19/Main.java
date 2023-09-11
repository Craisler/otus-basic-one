package ru.otus.java.basic.lessom19;

import java.net.Socket;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        byte[] bytes = userInput.getBytes();
        try(Socket socket = new Socket("localhost", 8080)) {
            Client client
            new Client(socket)
        }
    }
}
