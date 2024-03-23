package com.startjava.lesson2_3.calculator;


import java.util.Scanner;

public class Calculator {

    public void calculate(int num1, int num2, char sign) {
        int result = 1;

        switch(sign) {
            case '+':
               result = num1 + num2;
               break;
            case '-':
               result = num1 - num2;
               break;
            case '*':
                if (num1 == 0 || num2 == 0) {
                    System.out.println("На ноль умножать нельзя");
                } else {
                    result = num1 * num2;
                }
                break;
            case '/':
                if (num1 == 0 || num2 == 0) {
                    System.out.println("На ноль делить нельзя");
                } else {
                    result = num1 / num2;
                }
                break;
            case '%':
                if (num1 == 0 || num2 == 0) {
                    System.out.println("На ноль по модулю умножать нельзя");
                } else {
                    result = num1 % num2;
                }
                break;
            case '^':
                for (int i = 0; i < num2; i++) {
                    result *= num1;
                }
                break;
            default:
                System.out.println("Вы ввели неверный математический знак");
                return;
        }
        System.out.println("Результат мат.операции: " + result + "\n");
    }
}

