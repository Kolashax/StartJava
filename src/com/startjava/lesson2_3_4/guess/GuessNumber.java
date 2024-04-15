package com.startjava.lesson2_3.guess;

import java.util.Scanner;

public class GuessNumber {

    private Player player;
    private Player player1;

    public GuessNumber(Player player, Player player1) {
        this.player = player;
        this.player1 = player1;
    }

    public void start() {
        Scanner console = new Scanner(System.in);
        int guessNumber = (int) (Math.random() * 100) + 1;
        Player currentPlayer = player;

        while (true) {
            System.out.print("Игрок по имени " + currentPlayer.getName() + " Введите число ");
            int num = console.nextInt();
            if (num == guessNumber) {
                System.out.println("Игрок по имени " + currentPlayer.getName() + " Выиграл");
                break;
            }

            if (num > guessNumber) {
                System.out.println("Игрок по имени " + currentPlayer.getName() +
                        " Загадал число больше того, что загадал компьютер");
            } else {
                System.out.println("Игрок по имени " + currentPlayer.getName() +
                        " Загадал число меньше того, что загадал компьютер");
            }
            currentPlayer = (currentPlayer == player) ? player1 : player;
        }
    }
}

