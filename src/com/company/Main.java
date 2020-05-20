package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        guessingGame();
    }

    // Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки угадать это число.
    // При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное, или меньше.
    // После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
    public static void guessingGame() {
        do {
            Random random = new Random();
            int randomNum = random.nextInt(10);
            System.out.print("Компьютер загадал число от 0 до 9, попробуйте угадать!\nВведите число: ");

            int n = 3;
            for (int i = 0; i < n; i++) {
                int userNum = getValidateNum();
                if (userNum > randomNum) {
                    System.out.println("Указанное число больше загаданного");
                } else if (userNum < randomNum) {
                    System.out.println("Указанное число меньше загаданного");
                } else {
                    System.out.println("Угадали! - это число: " + randomNum);
                    break;
                }
                if (i + 1 == n) {
                    System.out.println("Вы проиграли! - загаданное число: " + randomNum);
                }
            }
            if (!isReloadGame()) {
                return;
            }
        } while (true);
    }

    private static boolean isReloadGame() {
        System.out.println("\nПовторить игру еще раз? 1 – да / любое другое – нет");
        return 1 == getValidateNum();
    }

    private static int getValidateNum() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            try {
                return scanner.nextInt();
            } catch (Exception ex) {
                System.out.println("введите целочисленное значение!");
            }
        }
    }
}