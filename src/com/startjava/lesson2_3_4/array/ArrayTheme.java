package com.startjava.lesson2_3_4.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayTheme {
    private static final String[] WORDS = {"JAVA", "PYTHON", "CLOUD", "COMPUTER", "PROGRAMMING"};
    private static final int MAX_ATTEMPTS = 6;
    private static final String[] HANGMAN = {
            "  +---+\n  |   |\n      |\n      |\n      |\n      |\n=========",
            "  +---+\n  |   |\n  O   |\n      |\n      |\n      |\n=========",
            "  +---+\n  |   |\n  O   |\n  |   |\n      |\n      |\n=========",
            "  +---+\n  |   |\n  O   |\n /|   |\n      |\n      |\n=========",
            "  +---+\n  |   |\n  O   |\n /|\\  |\n      |\n      |\n=========",
            "  +---+\n  |   |\n  O   |\n /|\\  |\n /    |\n      |\n=========",
            "  +---+\n  |   |\n  O   |\n /|\\  |\n / \\  |\n      |\n========="
    };



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
        Scanner console = new Scanner(System.in);
        String[] words = {"JAVA", "PYTHON", "CLOUD", "COMPUTER", "PROGRAMMING"};
        String guessWord = words[random.nextInt(words.length)];
        boolean[] guessLetters = new boolean[guessWord.length()];
        StringBuilder wrongLetters = new StringBuilder();
        int attempts = 7;

        while (attempts > 0) {
            System.out.println();
            if (attempts > 0) {
                System.out.println(HANGMAN[7 - attempts]);
            }
            System.out.println("Кол во попыток " + attempts);
            System.out.println("Загаданое слово " + getMaskedWord(guessWord,guessLetters));
            System.out.println("Загаданные буквы " + getGuessLetters(guessWord,guessLetters));
            System.out.println("Ошибочные буквы " + wrongLetters);
            System.out.print("Введите букву ");
            char letter = console.nextLine().toUpperCase().charAt(0);
            if (!Character.isLetter(letter)) {
                System.out.println("Введите корректный тип данных");
                continue;
            }
            int index = guessWord.indexOf(letter);
            if (index != -1) {
                while (index != -1) {
                    guessLetters[index] = true;
                    index = guessWord.indexOf(letter,index + 1);
                }
                if (getGuessWord(guessLetters)) {
                    System.out.println("Вы выиграли слово " + guessWord);
                    return;
                }
            } else {
                if (wrongLetters.indexOf(String.valueOf(letter)) == -1) {
                    wrongLetters.append(letter);
                    attempts--;
                } else {
                    System.out.println("Буква уже была загаданна");
                }
            }
        }
        System.out.println("К сожалению, вы проиграли, слово было " + guessWord);
    }
    public static String getMaskedWord(String guessWord, boolean[] guessLetters) {
        StringBuilder masked = new StringBuilder();
        for (int i = 0; i < guessWord.length(); i++) {
            if (guessLetters[i]) {
                masked.append(guessWord.charAt(i));
            } else {
                masked.append("_");
            }
            masked.append(" ");
        }
        return masked.toString();
    }

    public static String getGuessLetters(String guessWord, boolean[] guessLetters) {
        StringBuilder guess = new StringBuilder();
        for (int i = 0; i < guessWord.length(); i++) {
            if (guessLetters[i]) {
                guess.append(guessWord.charAt(i));
                guess.append(" ");
            }
        }
        return guess.toString();
    }

    public static boolean getGuessWord(boolean[] guessLetters) {
        for (boolean letter : guessLetters) {
            if (!letter) {
                return false;
            }
        }
        return true;
    }
}
