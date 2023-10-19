package ru.otus.java.basic.lesson8;

import java.util.Scanner;

public class GameApplication {
    static final int SIZE = 3;

    static final char EMPTY_SYMBOL = '*';
    static final char X_SYMBOL = 'X';
    static final char O_SYMBOL = '0';

    static Scanner scanner = new Scanner(System.in);
    static char[][] map;

    public static void main(String[] args) {
        initMap();
        printMap();
        System.out.println("Игра начата");
        while (true) {
            playerTurn();
            printMap();
            if (checkWin(X_SYMBOL)) {
                System.out.println("Вы победили!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(O_SYMBOL)) {
                System.out.println("Победил компьютер");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра завершена");
    }

    public static boolean checkWin(char symbol){
        if (map[0][0] == symbol && map [0][1] == symbol && map [0][2] == symbol) return true;
        if (map[1][0] == symbol && map [1][1] == symbol && map [1][2] == symbol) return true;
        if (map[2][0] == symbol && map [2][1] == symbol && map [2][2] == symbol) return true;

        if (map[0][0] == symbol && map [1][0] == symbol && map [2][0] == symbol) return true;
        if (map[0][1] == symbol && map [1][1] == symbol && map [2][1] == symbol) return true;
        if (map[0][2] == symbol && map [1][2] == symbol && map [2][2] == symbol) return true;

        if (map[0][0] == symbol && map [1][1] == symbol && map [2][2] == symbol) return true;
        if (map[0][2] == symbol && map [1][1] == symbol && map [2][0] == symbol) return true;

        return false;
    }
    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == EMPTY_SYMBOL) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void aiTurn() {
        int x, y;
        do {
            x = (int) (Math.random() * SIZE);
            y = (int) (Math.random() * SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Ход компьютера: " + (x + 1) + "" + (y + 1));
        map[y][x] = O_SYMBOL;
    }

    public static void playerTurn() {
        int x, y;
        do {
            System.out.println("Ход игрока. Укажите координаты X Y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));

        map[y][x] = X_SYMBOL;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE) {
            return false;
        }
        if (map[y][x] != EMPTY_SYMBOL) {
            return false;
        }
        return true;
    }

    private static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = EMPTY_SYMBOL;
            }
        }
    }

}