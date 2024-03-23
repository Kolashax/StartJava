package com.startjava.lesson1.final_;

public class Calculator {
    public static void main(String[] args) {
        int a = 34;
        int b = 3;
        char sign = '^';
        int result = 1;

        if (sign == '+') {
            result = a + b;
        } else if (sign == '-') {
            result = a - b;
        } else if (sign == '/') {
            if (a == 0 || b == 0) {
                System.out.println("На ноль делить нельзя");
            } else {
                result = a / b;
            }
        } else if (sign == '*') {
            if (a == 0 || b == 0) {
                System.out.println("На ноль умножать нельзя");
            } else {
                result = a * b;
            }
        } else if (sign == '^') {
            for(int i = 0; i < b; i++) {
                result *= a;
            }
        }
        System.out.println(a + " " + sign + " " + b + " = " + result);
    }
}