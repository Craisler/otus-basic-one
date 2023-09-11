package ru.otus.java.basic.lessom19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class PingServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8088);
        while (true) {
            Socket socket = serverSocket.accept();
            System.out.println("Client connected");
            readRequest(socket);

        }
    }
    private static void readRequest(Socket socket) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        while (true) {
            String str = reader.readLine();
            System.out.println(str);
            if(str == null || str.trim().isEmpty()) {
                break;
            }
        }
    }
}
