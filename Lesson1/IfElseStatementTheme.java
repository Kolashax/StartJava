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
            System.out.println("Ваше первая буква имени K \n");
        } else if (firstNameLetter == 'И') {
            System.out.println("Ваше первая буква имени И");
        } else {
            System.out.println("Ваше имя начинается с другой буквы");
        }

        System.out.println("2 Поиск большего числа");
        int num = 50;
        int num1 = 40;

        if (num == num1) {
            System.out.println("Числа " + num + " И " + num1 + " Равны");
        } else if (num > num1) {
            System.out.println("Число " + num + " Больше чем " + num1);
        } else {
            System.out.println("Число " + num1 + " Больше чем число " + num + "\n");
        }

        System.out.println("3 Проверка числа");
        int num2 = 9;

        if (num2 == 0) {
            System.out.println("Число равно " + num2);
        } else {
           if (num2 > 0) {
               if (num2 % 2 == 0) {
                   System.out.println("Число четное " + num2);
               } else {
                   System.out.println("Число Нечетное " + num2);
               }
           } else {
              if (num2 % 2 == 0 && num2 < 0) {
                  System.out.println("Число отрицательное и четное " + num2);
              } else {
                  System.out.println("Число отрицательное " + num2);
              }
           }

        System.out.println("4 Поиск одинаковых цифр в числах");
        int num3 = 224;
        int num4 = 223;

        int ones = num3 % 10;
        int tens = num3 / 10 % 10;
        int hundreds = num3 / 100;

        int ones2 = num4 % 10;
        int tens2 = num4 / 10 % 10;
        int hundreds2 = num4 / 100;

        if (ones == ones2 &&  hundreds == hundreds2 && tens == tens2) {
            System.out.println("Исходные числа " + num3 + ":" + num4);
            System.out.println("Одинаковые цифры " + hundreds + ":" + hundreds2 + "|" +
                    tens + ":" + tens2 + "|" +
                    ones + ":" + ones2);
            System.out.println("Сотни \n" + "Десятки \n" + "Единицы");
        } else if (ones == ones2 && tens == tens2) {
            System.out.println("Исходные числа " + num3 + ":" + num4);
            System.out.println("Одинаковые цифры " + ones + ":" + ones2 + "|" +
                    tens + ":" + tens2);
            System.out.println("Единицы \n" + "Десятки");
        } else if (tens == tens2 &&  hundreds == hundreds2) {
            System.out.println("Исходные числа " + num3 + ":" + num4);
            System.out.println("Одинаковые цифры " + hundreds + ":" + hundreds2 + "|" +
                    tens + ":" + tens2);
            System.out.println("Сотни \n" + "Десятки");
        } else if (ones == ones2 && hundreds == hundreds2) {
            System.out.println("Исходные числа " + num3 + ":" + num4);
            System.out.println("Одинаковые цифры " + ones + ":" + ones2 + "|" +
                    hundreds + ":" + hundreds2 );
            System.out.println("Единицы\n" + "Сотни");
        } else if (tens == tens2) {
            System.out.println("Исходные числа " + num3 + ":" + num4);
            System.out.println("Одинаковые цифры " + tens + ":" + tens2);
            System.out.println("Десятки");
        } else if (hundreds == hundreds2) {
            System.out.println("Исходные числа " + num3 + ":" + num4);
            System.out.println("Одинаковые цифры = " + hundreds + ":" + hundreds2);
            System.out.println("Сотни");
        } else if (ones == ones2) {
            System.out.println("Исходные числа " + num3 + ":" + num4);
            System.out.println("Одинаковые цифры = " + ones + ":" + ones2);
            System.out.println("Единицы");
        } else {
            System.out.println("цифры разные");
        }

        System.out.println("5 Определение символа по его коду");
        char symbol = '\u005E';

        if (symbol == 'W') {
            System.out.println("Символ " + symbol + " Является большой буквой \n");
        } else if (symbol == 'w') {
            System.out.println("Символ " + symbol + " Является маленькой буквой \n");
        } else if (symbol == '1') {
            System.out.println("Символ " + symbol + " цифра \n");
        } else {
            System.out.println("Символ " + symbol + " Не буква и не цифра \n");
        }

        System.out.println("6 Подсчет суммы вклада и начисленных банком %");
        int contributionSum = 301000;
        int deposit = 0;

        if (contributionSum <= 100000) {
            deposit = contributionSum * 5 / 100;
        } else if (contributionSum > 100000 && contributionSum <= 300000) {
            deposit = contributionSum * 7 / 100;
        } else if (contributionSum > 300000) {
            deposit = contributionSum * 10 / 100;
        }
            
        int sumTotal = contributionSum + deposit;
        System.out.println("Сумма вклада " + contributionSum);
        System.out.println("Сумма начисленного % " + deposit);
        System.out.println("Итоговая сумма с % " + sumTotal + "\n");
        
        System.out.println("7 Определение оценки по предметам");
        int historyPercent = 59;
        int historyGrade = 2;
        
        if (historyPercent > 91) {
            historyGrade = 5;
        } else if (historyPercent > 73) {
            historyGrade = 4;
        } else if (historyPercent > 60) {
            historyGrade = 3;
        }

        int programmingGrade = 2;
        int programmingPercent = 92;
    
        if (programmingPercent > 91) {
            programmingGrade = 5;
        } else if (programmingPercent > 73) {
            programmingGrade = 4;
        } else if (programmingPercent > 60) {
            historyGrade = 3;
        }
        
        int percentTotal = (historyPercent + programmingPercent) / 2;
        int gradeTotal = historyGrade + programmingGrade / 2;
        System.out.println("Процент по истории = " + historyPercent + " Оценка = " + historyGrade);
        System.out.println("Процент по программированию " + programmingPercent + 
                " Оценка " + programmingGrade);
        System.out.println("Средняя оценка по предметам = " + gradeTotal);
        System.out.println("Средний процент по предметам = " + percentTotal + "\n");

        System.out.println("8 Расчет годовой прибыли");
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
}