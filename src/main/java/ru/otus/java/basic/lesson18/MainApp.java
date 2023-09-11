//package ru.otus.java.basic.lesson18;
//
//import java.io.*;
//import java.nio.charset.StandardCharsets;
//
//public class MainApp {
//    public static void main(String[] args) throws java.io.FileNotFoundException {
//        FileInputStream in = new FileInputStream("src/demo.txt");
//        try (in) {
//            byte[] buf = new byte[100];
//            int n = in.read(buf);
//            while (n > 0) {
//                System.out.println("Read: " +n);
//                System.out.print(new String(buf, 0, n));
//                n = in.read();
//            }
//        } catch (java.io.IOException e) {
//            e.printStackTrace();
//        }
//    }
//public static void main(String[] args) {
//    String data = "Hello World";
//    try (FileOutputStream out = new FileOutputStream("src/demo1.txt", append)) {
//        byte[] buffer = data.getBytes(StandardCharsets.UTF_8);
//        for (int i = 0; i < buffer.length; i++) {
//            out.write(buffer[i]);
//
//        }
//    } catch (IOException e) {
//        e.printStackTrace();
//    }
//}
//}
