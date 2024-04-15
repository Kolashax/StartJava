package com.startjava.lesson2_3_4.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayTheme {

    public static void main(String[] args) {

        System.out.println("1 Вычисление факториала");
        int[] numbers = new int[9];
        int factorial = 1;
        for (int i = 1; i < numbers.length; i++) {
            numbers[i] += i;
            factorial *= numbers[i];
        }
        System.out.println(factorial + "\n");

        System.out.println("2 Реверс значений массива");
        int[] numbers2 = {12, 34, 56, 12, 34, 78, 89};
        for (int i = numbers2.length - 1; i > 0; i--) {
            System.out.print(numbers2[i] + " ");
        }
        System.out.println();

        System.out.println("\n3 удаление элементов массива");
        Random random = new Random();
        float[] numbers3 = new float[15];
        for (int i = 0; i < numbers3.length; i++) {
            numbers3[i] = random.nextFloat(0, 1);
            System.out.printf("%.3f\n", numbers3[i]);
        }
        System.out.println();

        int sum = 0;
        int avg = 0;
        int countZeros = 0;
        for (int i = 0; i < numbers3.length; i++) {
            sum += i;
            avg = sum / numbers3.length;
            if (numbers3[avg] < numbers3[i]) {
                numbers3[i] = 0;
                countZeros++;
            }
            System.out.printf("%.3f\n", numbers3[i]);
        }
        System.out.println("Кол во обнуленных яйчеек " + countZeros);

        System.out.println("4 Вывод алфавита лесенкой");
        char[] alphabet = new char[90];
        for (int i = alphabet.length - 1; i >= 65; i--) {
            for (int j = i; j < alphabet.length; j++) {
                System.out.print(alphabet[j]);
            }
            System.out.println();
        }

        System.out.println("5 Заполнение Массива Уникальными числами");
        int[] numbers4 = new int[30];
        for (int i = 0; i < numbers4.length; i++) {
            numbers4[i] = random.nextInt(60, 100);
        }

        for (int i = 0; i < numbers4.length; i++) {
            boolean isUniqueNums = true;
            for (int j = i + 1; j < numbers4.length; j++) {
                if (numbers4[i] == numbers4[j]) {
                    isUniqueNums = false;
                }
            }
            if (isUniqueNums) {
                System.out.print(numbers4[i] + " ");
            }
        }

        System.out.println("\n6 Игра виселица");
        Scanner scanner = new Scanner(System.in);
        char[] word = {'J', 'a', 'v', 'a'};
        char[] wordCopy = new char[4];
        int countTry = 7;

        OUTER:
        while (countTry > 0) {
            System.out.println("У вас " + countTry + " Попыток");
            System.out.print("Введите символ ");
            char sign = scanner.nextLine().charAt(0);
            boolean isArraysEquals = Arrays.equals(word, wordCopy);

            if (isArraysEquals) {
                break;
            }

            for (int i = 0; i < wordCopy.length; i++) {
                if (sign == word[i]) {
                    wordCopy[i] = word[i];
                    countTry++;
                    break;
                }
                for (int j = i + 1; j < wordCopy.length; j++) {
                    if (wordCopy[i] == word[j]) {
                        wordCopy[j] = word[j];
                    }
                }
            }
            countTry--;
        }

    }
}






