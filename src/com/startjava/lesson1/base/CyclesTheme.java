package com.startjava.lesson1.base;

public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1 Подсчет суммы четных и нечетных чисел");
        int startNum = -10;
        int counter = startNum;
        int endNum = 21;
        int sumEvenNums = 0;
        int sumOddNums = 0;

        do {
            if (counter % 2 == 0) {
                sumEvenNums += counter;
            } else {
                sumOddNums += counter;
            }
            counter++;
        } while (counter <= endNum);
            System.out.println("В интервале " + "[" + startNum + " " + endNum + "] " +
                    "сумма четных чисел = " + sumEvenNums +
                    ", a нечетных = " + sumOddNums);

        System.out.println("\n2 Вывод чисел в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;

        int maxValue = num1;
        int minValue = num1;

        if (num2 > maxValue) {
            maxValue = num2;
        } else if (num2 < minValue) {
            minValue = num2;
        }

        if (num3 > maxValue) {
            maxValue = num3;
        } else if (num3 < minValue) {
            minValue = num3;
        }

        for(int i = maxValue - 1; i > minValue; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3 Вывод реверсивного числа и суммы его цифр");
        int num4 = 1234;
        int sumNums = 0;

        while (num4 > 0) {
            int digit4 = num4 % 10;
            num4 /= 10;
            sumNums += digit4;
            System.out.print(digit4);
        }
        System.out.println(" Сумма Цифр " + sumNums);

        System.out.println("\n4 Вывод чисел в несколько строк");
        for (int i = 1; i <= 24; i += 2) {
            System.out.printf("%2d ", i);
            if (i % 10 == 9) {
                System.out.println();
            }
        }

        int zerosCount = 5 - (24 - 1) / 2 % 5;
        for (int i = 1; i < zerosCount; i++) {
            System.out.printf("%2d ", 0);
        }

        System.out.println("\n\n5 Проверка количества двоек числа на четность/нечетность");
        int num5 = 3242592;
        int copyNum5 = num5;
        int countTwos = 0;

        while (copyNum5 > 0) {
            int digit5 = copyNum5 % 10;
            if (digit5 == 2) {
                countTwos++;
            }
            copyNum5 /= 10;
        }

        if (countTwos % 2 == 0) {
            System.out.println("В числе " + num5 + " Четное количество двоек " + countTwos);
        } else {
            System.out.println("В числе " + num5 + " Нечетное количество двоек " + countTwos);
        }

        System.out.println("\n6 Отображение геометрических фигур");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        int height = 1;
        while (height < 7) {
            int width = 0;
            int endRange = 7 - height - 1;
            while (width < endRange) {
                System.out.print("#");

                width++;
            }
            System.out.println();
            height++;
        }
        System.out.println();
        height = 1;
        System.out.println('$');
        do {
            int width = 1;
            do {
                if (width == 4) {
                    System.out.print("\n$");
                } else if (width == 3) {
                    System.out.print('$');
                }
                width++;
            } while (width < height);
            if (height == 5) {
                System.out.print('$');
            }
            height++;
        } while (height < 8);

        System.out.println("\n\n7 Отображение ASCII-символов");
        System.out.printf("%s%14s%26s\n", "Decimal", "Character", "Description");
        for(int i = 15; i <= 48; i += 2) {
            System.out.printf("%3d%14c%30s\n", i, i, Character.getName(i));
        }
        
        for(int i = 98; i <= 122; i += 2) {
            System.out.printf("%3d%14c%30s\n", i, i, Character.getName(i));
        }

        System.out.println("\n8 Проверка, является ли число палиндромом");
        int palindromNum = 1234321;
        int reverseNum = 0;
        int copyPalindromNum = palindromNum;

        while (copyPalindromNum > 0) {
            int digit = copyPalindromNum % 10;
            reverseNum = (reverseNum * 10) + digit;
            copyPalindromNum /= 10;
        }

        if (palindromNum == reverseNum) {
            System.out.println("Число " + palindromNum + " Палиндром");
        } else {
            System.out.println("Число " + palindromNum + " Не палиндром");
        }

        System.out.println("\n9 Проверка, является ли число счастливым");
        int luckyNum = 123123;
        int tmpNum1 = luckyNum;
        int tmpNum2 = luckyNum;
        int rightHalf = tmpNum1;
        int leftHalf = tmpNum2;
        int sumLuckyNum = 0;
        int sumLuckyNum2 = 0;

        while (tmpNum1 > 0) {
            rightHalf = tmpNum1 % 10;
            tmpNum1 /= 100;
            sumLuckyNum += rightHalf;
            leftHalf  = (tmpNum2 / 1000) % 10;
            tmpNum2 /= 10;
            sumLuckyNum2 += leftHalf;
        }

        System.out.println("Сумма цифр ABC = " + sumLuckyNum + ", a сумма DEF = " + sumLuckyNum2);
        if (sumLuckyNum == sumLuckyNum2) {
            System.out.println("Число счастливое " + luckyNum);
        } else {
            System.out.println("Число не счастливое " + luckyNum);
        }

        System.out.println("\n10 Отображение таблицы умножения Пифагора");
        System.out.print("     2    3    4    5    6    7    8    9 \n");
        System.out.print("__|______________________________________\n");
        for (int i = 2; i <= 9; i++) {
            System.out.print(i + " | ");
            for (int j = 2; j <= 9; j++) {
                int multiplyTable = i * j;
                System.out.printf("%2d%s",multiplyTable, "   ");
            }
            System.out.println();
        }
    }
 }