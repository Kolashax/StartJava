package com.startjava.lesson2_3.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите имя первого игрока ");
        String name = console.nextLine();
        Player player = new Player(name);
        System.out.print("Введите имя второго игрока ");
        name = console.nextLine();
        Player player1 = new Player(name);
        GuessNumber game = new GuessNumber(player, player1);
        String continuation = "yes";

        do {
            if (continuation.equals("yes")) {
                game.start();
            }
            System.out.print("Вы хотите продолжить[yes/no] ");
            continuation = console.nextLine();
        } while(!continuation.equals("no"));
    }
}