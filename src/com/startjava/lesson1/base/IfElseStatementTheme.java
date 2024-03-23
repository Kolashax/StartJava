package com.startjava.lesson1.base;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1 Перевод псевдокода на язык Java");
        boolean isGenderMale = true;
   
        if (!isGenderMale) {
            System.out.println("Вы девочка");
        } else {
            System.out.println("Вы мальчик");
        }

        int age = 19;
 
        if (age > 18) {
            System.out.println("Вы совершеннолетний");
        } else {
            System.out.println("Вам меньше 18");
        }

        double height = 1.75;

        if (height < 1.8) {
            System.out.println("Ваш рост меньше 1.8");
        } else {
            System.out.println("Ваш рост больше 1.8");
        }

        char firstNameLetter = "Коля".charAt(0);

        if (firstNameLetter == 'К') {
            System.out.println("Ваше первая буква имени K");
        } else if (firstNameLetter == 'И') {
            System.out.println("Ваше первая буква имени И");
        } else {
            System.out.println("Ваше имя начинается с другой буквы");
        }

        System.out.println("\n2 Поиск большего числа");
        int num = 50;
        int num1 = 40;

        if (num == num1) {
            System.out.println("Числа " + num + " И " + num1 + "Равны");
        } else if (num > num1) {
            System.out.println("Число " + num + " больше чем " + num1);
        } else {
            System.out.println("Число " + num1 + " больше чем " + num);
        }

        System.out.println("\n3 Проверка числа");
        int num2 = 10;

        if (num2 != 0) {
            System.out.print("Число " + num2);
            if (num2 % 2 == 0) {
                System.out.print(" четное и");
            } else {
                System.out.print(" нечетное и");
            }

            if (num2 < 0) {
                System.out.print(" отрицательное");
            } else {
                System.out.print(" положительное");
            }
        } else {
            System.out.println("Число = " + num2);
        }

        System.out.println("\n\n4 Поиск одинаковых цифр в числах");
        int num3 = 355;
        int num4 = 355;

        int ones = num3 % 10;
        int tens = num3 / 10 % 10;
        int hundreds = num3 / 100;

        int ones2 = num4 % 10;
        int tens2 = num4 / 10 % 10;
        int hundreds2 = num4 / 100;

        if (ones == ones2 || hundreds == hundreds2 || tens == tens2) {
            System.out.println("Исходные числа " + num3 + ":" + num4);
            System.out.println("Одинаковые цифры ");
            if (ones == ones2) {
                System.out.println(ones + " Первое число " + num3 + "|" + ones2 + " Второе число " + num4);
                System.out.println("Единицы");
            }

            if (tens == tens2) {
                System.out.println(tens + " Первое число " + num3 + "|" + tens2 + " Второе число " + num4);
                System.out.println("Десятки");
            }

            if (hundreds == hundreds2) {
                System.out.println(hundreds + " Первое число " + num3 + "|" + hundreds2 + " Второе число " + num4);
                System.out.println("Сотни");
            }
        } else {
            System.out.println("Числа не равны");
        }

        System.out.println("\n5 Определение символа по его коду");
        char symbol = '\u005E';

        if (symbol == 'W') {
            System.out.println("Символ " + symbol + " Является большой буквой");
        } else if (symbol == 'w') {
            System.out.println("Символ " + symbol + " Является маленькой буквой");
        } else if (symbol == '1') {
            System.out.println("Символ " + symbol + " цифра");
        } else {
            System.out.println("Символ " + symbol + " Не буква и не цифра");
        }

        System.out.println("\n6 Подсчет суммы вклада и начисленных банком %");
        int deposit = 301_000;
        int percent = 10;
        if (deposit < 100_000) {
            percent = 5;
        } else if (deposit <= 300_000) {
            percent = 7;
        }
        int interest = deposit / 100 * percent;
        System.out.println("Сумма вклада: " + deposit +
                "\nСумма начисленного %: " + interest +
                "\nИтоговая сумма с %: " + (deposit + interest));

        System.out.println("\n7 Определение оценки по предметам");
        int historyPercent = 59;
        int historyGrade = 2;

        if (historyPercent > 91) {
            historyGrade = 5;
        } else if (historyPercent > 73) {
            historyGrade = 4;
        } else if (historyPercent > 60) {
            historyGrade = 3;
        }

        int programmingGrade = 5;
        int programmingPercent = 92;

        if (programmingPercent <= 60) {
            programmingGrade = 2;
        } else if (programmingPercent > 60 && programmingPercent <= 73) {
            programmingGrade = 3;
        } else if (programmingPercent > 73 && programmingPercent <= 91) {
            programmingGrade = 4;
        }

        int averagePercent = (historyPercent + programmingPercent) / 2;
        int averageGrade = (historyGrade + programmingGrade) / 2;
        System.out.println("Процент по истории = " + historyPercent + " Оценка = " + historyGrade);
        System.out.println("Процент по программированию " + programmingPercent +
                " Оценка " + programmingGrade);
        System.out.println("Средняя оценка по предметам = " + averageGrade);
        System.out.println("Средний процент по предметам = " + averagePercent);

        System.out.println("\n8 Расчет годовой прибыли");
        int productSale = 13000;
        int rentPlacePrice = 5000;
        int productionCost = 9000;
        int income = (productSale - rentPlacePrice - productionCost) * 12;
        if (income > 0) {
            System.out.println("Прибыль за год равна = +" + income);
        } else {
            System.out.println("Прибыль за год = " + income);
        } 
    }
}
