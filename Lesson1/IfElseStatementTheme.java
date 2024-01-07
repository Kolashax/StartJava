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

        if (num > num1) {
            System.out.println("Число " + num + " больше чем " + num1 + "\n");
        } else {
            System.out.println("Число " + num1 + " больше чем " + num);
        }

        System.out.println("3 Проверка числа");
        int num2 = 10;

        if (num2 != 0) {
            if (num2 % 2 == 0) {
                System.out.println("Число " + num2 + "Четное");
            } else {
                System.out.println("Число " + num2 + " Нечетное\n");
            }

            if (num2 > 0) {
                System.out.println("Число " + num2 + " Положительное\n");
            } else {
                System.out.println("Число " + num2 + "Отрицательное");
            }
        } else {
            System.out.println("Число = " + num2);
        }

        System.out.println("4 Поиск одинаковых цифр в числах");
        int num3 = 255;
        int num4 = 355;

        int ones = num3 % 10;
        int tens = num3 / 10 % 10;
        int hundreds = num3 / 100;

        int ones2 = num4 % 10;
        int tens2 = num4 / 10 % 10;
        int hundreds2 = num4 / 100;

        if (ones == ones2 ||  hundreds == hundreds2 || tens == tens2) {
            System.out.println("Исходные числа " + num3 + ":" + num4);
            if (ones == ones2) {
                System.out.println("Единицы равны");
            }

            if (tens == tens2) {
                System.out.println("Десятки равны \n");
            }

            if (hundreds == hundreds2) {
                System.out.println("Сотни равны");
            }
        } else {
            System.out.println("Числа не равны");
        }
        
        System.out.println("5 Определение символа по его коду");
        char symbol = '\u005E';

        if (symbol == 'W') {
            System.out.println("Символ " + symbol + " Является большой буквой");
        } else if (symbol == 'w') {
            System.out.println("Символ " + symbol + " Является маленькой буквой");
        } else if (symbol == '1') {
            System.out.println("Символ " + symbol + " цифра");
        } else {
            System.out.println("Символ " + symbol + " Не буква и не цифра \n");
        }

        System.out.println("6 Подсчет суммы вклада и начисленных банком %");
        int contributionSum = 301000;
        int deposit = contributionSum * 5 / 100;

        if (contributionSum > 100000 && contributionSum <= 300000) {
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
        
        int averagePercent = (historyPercent + programmingPercent) / 2;
        int averageGrade = historyGrade + programmingGrade / 2;
        System.out.println("Процент по истории = " + historyPercent + " Оценка = " + historyGrade);
        System.out.println("Процент по программированию " + programmingPercent + 
                " Оценка " + programmingGrade);
        System.out.println("Средняя оценка по предметам = " + averageGrade);
        System.out.println("Средний процент по предметам = " + averagePercent + "\n");

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
