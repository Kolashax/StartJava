package com.startjava.lesson1.final_;

public class MyFirstGame {
    public static void main(String[] args) {
        int randomNum = 90;
        int num = 90;

        if (num == randomNum) {
            System.out.println("Вы победили");
        } else if (num > randomNum) {
            System.out.println("Ваше число больше того что загадал компьютер " + num);
        } else {
            System.out.println("Ваше меньше того что загадал компьютер " + num);
        }
    }
}