public class  IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1 Перевод псевдокода на язык Java (это название задачи)");
        boolean isGenderMale = true;
        int age = 19;
        double height = 1.75;
        char firstNameLetter = "Коля".charAt(0);

        if (!isGenderMale) {
            System.out.println("Вы девочка");
        } else {
            System.out.println("Вы мальчик");
        }

        if (age > 18) {
            System.out.println("Вы совершеннолетний");
        } else {
            System.out.println("Вам меньше 18");
        }

        if (height < 1.8) {
            System.out.println("Ваш рост меньше 1.8 ");
        } else {
            System.out.println("Ваш рост больше 1.8 ");
        }

        if (firstNameLetter == 'К') {
            System.out.println("Ваше первая буква имени K \n");
        } else if (firstNameLetter == 'И') {
                   System.out.println("Ваше первая буква имени N \n");
        } else {
            System.out.println("Ваше имя начинается с другой буквы \n");
        }

        System.out.println("2 Поиск большего числа");
        int num = 50;
        int num1 = 40;

        if (num == num1) {
            System.out.println("Числа " + num + " И " + num1 + " Равны \n");
        } else if (num > num1) {
             System.out.println("Число " + num + " Больше \n");
        } else {
            System.out.println("Число " + num1 + " Больше \n");
        }

        System.out.println("3 Проверка числа");
        int num2 = -10;

        if (num2 == 0) {
            System.out.println("Число равно нулю \n");
        } else if (num2 < 0 && num2 % 2 == 0) {
            System.out.println("Число " + num2 + " Четное и отрицательное \n");
        } else if (num2 % 2 == 0){
            System.out.println("Число " + num2 + " Четное \n");
        } else if (num2 > 0) {
            System.out.println("Число " + num2 + " Положительное \n");
        } else {
            System.out.println("Число " + num2 + " Отрицательное \n");
        }

        System.out.println("4 Поиск одинаковых цифр в числах");
        int num3 = 167;
        int num4 = 167;

        int ones = num3 % 10;
        int tens = (num3 / 10) % 10;
        int hundreds = (num3 / 100);

        int ones2 = num4 % 10;
        int tens2 = (num4 / 10) % 10;
        int hundreds2 = (num4 / 100);

        if (ones == ones2 &&  hundreds == hundreds2 && tens == tens2) {
            System.out.println("Исходные числа " + num3 + ":" + num4);
            System.out.println("Одинаковые цифры " + hundreds + ":" + hundreds2 + ":" +
                    tens + ":" + tens2 + ":" +
                    ones + ":" + ones2);
            System.out.println("Сотни = " + hundreds + ":" + hundreds2 + "\n" +
                    "Десятки = " + tens + ":" + tens2 + "\n" +
                    "Единицы = " + ones + ":" + ones2 + "\n");
        } else if (ones == ones2 && tens == tens2) {
            System.out.println("Исходные числа " + num3 + ":" + num4);
            System.out.println("Одинаковые цифры " + ones + ":" + ones2 + ":" +
                    tens + ":" + tens2);
            System.out.println("Десятки = " + tens + ":" + tens2  + "\n" +
                    "Единицы = " + ones + ":" + ones2 + "\n");
        } else if (tens == tens2 &&  hundreds == hundreds2) {
            System.out.println("Исходные числа " + num3 + ":" + num4);
            System.out.println("Одинаковые цифры " + hundreds + ":" + hundreds2 + ":"
                    + tens + tens2);
            System.out.println("Сотни = " + hundreds + ":" + hundreds2  + "\n" +
                    "Десятки = " + tens + ":" + tens2 + "\n");
        } else if (ones == ones2 && hundreds == hundreds2) {
            System.out.println("Исходные числа " + num3 + ":" + num4);
            System.out.println("Одинаковые цифры " + ones + ":" + ones2 + ":"  +
                    hundreds + ":" + hundreds2 );
            System.out.println("Единицы = " + ones + ":" + ones2 + "\n" +
                    "Сотни = " + hundreds + ":" + hundreds2 + "\n");
        } else if (tens == tens2) {
            System.out.println("Исходные числа " + num3 + ":" + num4);
            System.out.println("Одинаковые цифры " + tens + ":" + tens2);
            System.out.println("Десятки "  + tens + ":" + tens2 + "\n");
        } else if (hundreds == hundreds2) {
            System.out.println("Исходные числа " + num3 + ":" + num4);
            System.out.println("Одинаковые цифры = " + hundreds + ":" + hundreds2);
            System.out.println("Сотни = " + hundreds + ":" + hundreds2 + "\n");
        } else if (ones == ones2) {
            System.out.println("Исходные числа " + num3 + ":" + num4);
            System.out.println("Одинаковые цифры = " + ones + ":" + ones2);
            System.out.println("Единицы = " + ones + ":" + ones2 + "\n");
        } else {
            System.out.println("цифры разные \n");
        }

        System.out.println("5 Определение символа по его коду");
        char symbol = '\u005E';

        if (symbol == 'W') {
            System.out.println("Символ " + symbol + " Является большой буквой \n");
        } else if(symbol == 'w') {
            System.out.println("Символ " + symbol + " Является маленькой буквой \n");
        } else if (symbol == '1') {
            System.out.println("Символ " + symbol+ " цифра \n");
        } else {
            System.out.println("Символ " + symbol + " Не буква и не цифра \n");
        }

        System.out.println("6 Подсчет суммы вклада и начисленных банком %");
        int contributionSum = 300000;
        int deposit = 0;
        int sumTotal = contributionSum + deposit;

        if (contributionSum <= 100000) {
            deposit = contributionSum * 5 / 100;
        } else if (contributionSum > 100000 && contributionSum <= 300000) {
            deposit = contributionSum * 7 / 100;
        } else if (contributionSum > 300000) {
            deposit = contributionSum * 10 / 100;
        }

        System.out.println("Сумма вклада " + contributionSum);
        System.out.println("Сумма начисленного % " + deposit);
        System.out.println("Итоговая сумма с % " + sumTotal + "\n");
        
        System.out.println("7 Определение оценки по предметам");
        int storyPercent = 59;
        int programmingPercent = 92;
        int storyGrade = 0;
        int programmingGrade = 0;
        int percentTotal = (storyPercent + programmingPercent) / 2;

        if (storyPercent > 91) {
            storyGrade = 5;
        } else if(storyPercent > 73) {
            storyGrade = 4;
        } else if (storyPercent > 60) {
            storyGrade = 3;
        } else if(storyPercent <= 60) {
            storyGrade = 2;
        }

        if (programmingPercent > 91) {
            programmingGrade = 5;
        } else if(programmingPercent > 73) {
            programmingGrade = 4;
        } else if(programmingPercent > 60) {
            programmingGrade = 3;
        } else if (programmingPercent <= 60) {
            programmingGrade = 2;
        }

        int gradeTotal = storyGrade + programmingGrade / 2;
        System.out.println("Процент по истории = " + storyPercent + " Оценка = " + storyGrade);
        System.out.println("Процент по программированию " + programmingPercent + 
                " Оценка " + programmingGrade);
        System.out.println("Средняя оценка по предметам = " + gradeTotal);
        System.out.println("Средний процент по предметам = " + percentTotal + "\n");

        System.out.println("8 Расчет годовой прибыли");
        int productSale = 13000;
        int rentPlacePrice = 5000;
        int productionCost = 9000;
        int income = productSale - rentPlacePrice - productionCost;

        if (income == 0) {
            System.out.println("Прибыль за год = " + income);
        } else if (income < 0) {
            System.out.println("Прибыль за год = " + income);
        } else {
            System.out.println("Прибыль за год = " + "+" + income);
        }
    }
}