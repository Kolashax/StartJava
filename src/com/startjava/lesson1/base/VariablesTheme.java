package com.startjava.lesson1.base;

public class VariablesTheme  {
    public static void main(String[] args) {
        System.out.println("1 Вывод характеристик компьютера (это название задачи)");
        byte coresCount = 6;
        float minFrequency = 2.5f;
        short threads = 12;
        int tdp = 65;
        double maxFrequency = 4.4;
        long socket = 1700;
        char symbol = 'F';
        boolean isEnableCpu = true;

        System.out.println("Количество ядер: " + coresCount);
        System.out.println("Минимальная частота процессора: " + minFrequency + " Hz");
        System.out.println("Максимальная частота процессора: " + maxFrequency + " Hz");
        System.out.println("Количество потоков: " + threads);
        System.out.println("Сокет: LGA" + socket);
        System.out.println("Символ: " + symbol);
        System.out.println("Процессор Рабочий? " + isEnableCpu);
        System.out.println("Тепловыделение процессора: " + tdp + "\n");

        System.out.println("2 Расчет стоимости товара со скидкой");
        int penPrice = 100;
        int bookPrice = 200;
        int priceTotal = penPrice + bookPrice;
        int discount = priceTotal * 11 / 100;
        int discountTotal = priceTotal - discount;

        System.out.println("Общая стоимость товаров без скидки " + priceTotal);
        System.out.println("Сумма скидки " + discount);
        System.out.println("Общая стоимость товаров со скидкой " + discountTotal + "\n");

        System.out.println(" 3 Вывод слова JAVA");
        System.out.println("   J   a   v     v  a");
        System.out.println("   J  a a   v   v  a a");
        System.out.println("J  J aaaaa   V V  aaaaa");
        System.out.println(" JJ a     a   V  a     a \n");

        System.out.println("4 Вывод min и max значений целых числовых типов");
        byte maxByte = 127;
        short maxShort = 32767;
        int maxInt = 2147483647;
        long maxLong = 9223372036854775807L;

        //byte
        System.out.println("Первоначальное значение " + maxByte);
        maxByte++;
        System.out.println("Значение после инкремента на единицу " + maxByte);
        maxByte--;
        System.out.println("Значение после декремента на единицу " + maxByte + "\n");

        // short
        System.out.println("первоначальное значение " + maxShort);
        maxShort++;
        System.out.println("Значение после инкремента на единицу " + maxShort);
        maxShort--;
        System.out.println("Значение после декремента на единицу " + maxShort + "\n");

        // int
        System.out.println("первоначальное значение " + maxInt);
        maxInt++;
        System.out.println("Значение после инкремента на единицу " + maxInt);
        maxInt--;
        System.out.println("Значение после декремента на единицу " + maxInt + "\n");

        //long
        System.out.println("первоначальное значение " + maxLong);
        maxLong++;
        System.out.println("Значение после инкремента на единицу " + maxLong);
        maxLong--;
        System.out.println("Значение после декремента на единицу " + maxLong + "\n");

        System.out.println("5 перестановка значений");
        int a = 2;
        int b = 5;
        System.out.println("Первоначальное значение " + a + " " + b);

        int c = a;
        a = b;
        b = c;
        System.out.println("Перестановка с третьей переменной " + a + " " + b);

        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("Перестановка с побитовой операцией " + a + " " + b);

        a += b;
        b = a - b;
        a -= b;
        System.out.println("Перестановка c помощью арифметических выражений " + a + " " + b + "\n");

        System.out.println("6 Вывод символов и их кодов");
        char dollar = '$';
        char asterisk = '*';
        char atSign = '@';
        char verticalBar = '|';
        char tilde = '~';

        System.out.println("Код символа " + (int) dollar + " Символ " + dollar);
        System.out.println("Код символа " + (int) asterisk + " Символ " + asterisk);
        System.out.println("Код символа " + (int) atSign + " Символ " + atSign);
        System.out.println("Код символа " + (int) verticalBar + " Символ " + verticalBar);
        System.out.println("Код символа " + (int) tilde + " Символ " + tilde + "\n");

        System.out.println("7 Вывод в консоль ASCII-арт Дюка");
        char parenthesisLeft = '(';
        char parenthesisRight = ')';
        char backSlash = '\\';
        char slash = '/';
        char underscore = '_';

        System.out.println("    " + slash + backSlash);
        System.out.println("   " + slash + "  " + backSlash);
        System.out.println("  " + slash + underscore + 
                parenthesisLeft + " " + parenthesisRight + backSlash);
        System.out.println(" " + slash + "      " + backSlash);
        System.out.println("" + slash + underscore + underscore + underscore + underscore +
                slash + backSlash + underscore + underscore + backSlash + "\n");

        System.out.println("8 Вывод количества сотен, десятков и единиц числа");
        int num = 123;
        int hundreds = num / 100;
        int tens = num / 10 % 10;
        int ones = num % 10;
        int sum = hundreds + tens + ones;
        int product = hundreds * tens * ones;
        System.out.println("Число " + num + " Содержит: ");
        System.out.println("  Сотен - " + hundreds);
        System.out.println("  Десятков - " + tens);
        System.out.println("  Единиц - " + ones);
        System.out.println("Сумма цифр = " + sum);
        System.out.println("Произведение = " + product + "\n");

        System.out.println("9 Вывод времени");
        int time = 86399;
        int hour = time / 3600;
        int minute = time / 60 % 60;
        int second = time % 60;
        System.out.println(hour + ":" + minute + ":" + second);
    }
}


