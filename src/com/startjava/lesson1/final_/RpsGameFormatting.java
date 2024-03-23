package com.startjava.lesson1.final_;

import java.util.Random;

public class RpsGameFormatting {
    public static void main(String[] args) throws InterruptedException {
        String rock ="✊";
        String scissors= "✌";
        String paper = "✋" ;

        String name1 = "Nic";
        Random random = new Random();
        int position1 = random.nextInt(1,100);
        String sign1 = rock;

        if (position1 > 66) {
            sign1 = paper;
        } else if (position1 > 33) {
            sign1 = scissors;
        }

        System.out.println("Ход игрока " + name1);
        for(int i = 0; i < 5; i++) {
            System.out.print (rock + "\n");
            Thread.sleep(100);
            System.out.print (scissors + "\n");
            Thread.sleep(100);
            System.out.print (paper + "\n");
            Thread.sleep(100);
        }
        System.out.println("\n" + sign1 + "\n");

        String name2 = "Jesse";
        int position2 = random.nextInt(1,100);
        String sign2 = rock;

        if (position2 > 66) {
            sign2 = paper;
        } else if (position2 > 33) {
            sign2 = scissors;
        }

        System.out.println("Ход игрока " + name2);
        for(int i = 0; i < 5; i++) {
            System.out.print (rock + "\n");
            Thread.sleep(100);
            System.out.print (scissors + "\n");
            Thread.sleep(100);
            System.out.print (paper + "\n");
            Thread.sleep(100);
        }
        System.out.println("\n" + sign2 + "\n");

        if (sign1.equals(sign2)) {
            System.out.println("Победила дружба");
            return;
        }

        boolean isSign1Equals = sign1.equals(rock) && sign2.equals(scissors) ||
                sign1.equals(scissors) && sign2.equals(paper) ||
                sign1.equals(paper) && sign2.equals(rock);

        if (isSign1Equals) {
            System.out.println("Игрок " + name1 + " Победил");
        } else {
            System.out.println("Игрок " + name2 + " Победил");
        }
    }
}