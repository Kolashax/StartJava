package com.startjava.lesson2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String continuation = "yes";

        do {
            System.out.print("Введите первое число: ");
            int num1 = console.nextInt();
            System.out.print("Введите математический знак: ");
            console.nextLine();
            char sign = console.nextLine().charAt(0);
            System.out.print("Введите второе число: ");
            int num2 = console.nextInt();
            calculator.calculate(num1, num2, sign);
            System.out.print("Вы хотите продолжить [yes/no] ");
            
            do {
                continuation = console.nextLine();
            } while (!continuation.equals("no") && !continuation.equals("yes"));
        } while (continuation.equals("yes"));
    }
}