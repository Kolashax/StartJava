package com.startjava.lesson2_3.rps;

import java.util.Scanner;
import java.util.Random;

public class RpsGameFormatting {

    private static final String ROCK = "✊";
    private static final String SCISSORS = "✌";
    private static final String PAPER = "✋";

    public static void main(String[] args) throws InterruptedException {
        Scanner console = new Scanner(System.in);
        Random random = new Random();
        String name1 = inputName(console);
        String name2 = inputName(console);

        int position = generatePosition(name1, random);
        String sign = defineSign(position);
        showSign(sign);

        position = generatePosition(name2, random);
        String sign2 = defineSign(position);
        showSign(sign2);
        defineWinner(name1, sign, name2, sign2);
    }

    public static String inputName(Scanner scanner) {
        System.out.print("Введите имя игрока: ");
        return scanner.nextLine();
    }

    public static int generatePosition(String name, Random r) {
        System.out.println("Ход игрока по имени " + name);
        return r.nextInt(1, 100);
    }

    public static String defineSign(int position) {
        String sign = ROCK;
        if (position > 66) {
            sign = PAPER;
        } else if (position > 33) {
            sign = SCISSORS;
        }
        return sign;
    }

    public static void showSign(String sign) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            System.out.print(ROCK + "\r");
            Thread.sleep(100);
            System.out.print(SCISSORS + "\r");
            Thread.sleep(100);
            System.out.print(PAPER + "\r");
            Thread.sleep(100);
        }
        System.out.println("\n" + sign);
    }

    public static void defineWinner(String name, String sign, String name2, String sign2) {
        
        if (sign.equals(sign2)) {
            System.out.println("Победила дружба");
            return;
        }

        boolean isSign1Equal = sign.equals(ROCK) && sign2.equals(SCISSORS) ||
                sign.equals(SCISSORS) && sign2.equals(PAPER) || 
                sign.equals(PAPER) && sign2.equals(ROCK);

        if (isSign1Equal) {
            System.out.println("Игрок по имени " + name +  " Победил");
        } else {
            System.out.println("Игрок по имени " + name2 + " Победил");
        }
    }
}