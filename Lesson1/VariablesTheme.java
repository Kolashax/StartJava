public class VariablesTheme  {
    public static void main(String[] args) {
        System.out.println("1 Вывод характеристик компьютера (это название задачи)");
        byte coreCount = 6;
        float minFrequency = 2.5f;
        short theards = 12;
        int tdp = 65;
        double maxFrequency = 4.4;
        long socket = 1700;
        char symbol = 'F';
        boolean isEnableCpu = true;

        System.out.println("Кол во ядер: " + coreCount);
        System.out.println("Минимальная частота процессора: " + minFrequency + " Hz");
        System.out.println("Максимальная частота процессора: " + maxFrequency + " Hz");
        System.out.println("Кол-во потоков: " + theards);
        System.out.println("Сокет: LGA" + socket);
        System.out.println("Символ: " + symbol);
        System.out.println("Процессор Рабочий? " + isEnableCpu);
        System.out.println("Тепловыделние процессора: " + tdp + "\n");

        System.out.println("2 Расчет стоимости товара со скидкой");
        int penPrice = 100;
        int bookPrice = 200;
        int totalPrice = penPrice + bookPrice;
        int discount = totalPrice * 11/100;
        int discountTotal = totalPrice - discount;

        System.out.println("общуая стоимость товаров без скидки " + totalPrice);
        System.out.println("Сумма скидки " + discount);
        System.out.println("общуая стоимость товаров со скидкой " + discountTotal);

        System.out.println(" 3 Вывод слова JAVA");
        System.out.println("   J   a   v     v  a"); 
        System.out.println("   J  a a   v   v  a a");
        System.out.println("J  J aaaaa   V V  aaaaa");
        System.out.println(" JJ a     a   V  a     a");

        System.out.println("4 Вывод min и max значений целых числовых типов");
        byte maxByte = 127;
        byte minByte = -128;
        short maxShort = 32767;
        short minShort = -32768;
        int maxInt = 2147483647;
        int minInt = -2147483648;
        long maxLong = 9223372036854775807L;
        long minLong = -9223372036854775808L;

        // byte
        maxByte++;
        System.out.println("Значение после инкремента на еденицу " + maxByte);
        maxByte--;
        System.out.println("Значение после декремента на еденицу " + maxByte + "\n");

        minByte++;
        System.out.println("Значение после инкремента на еденицу " + minByte);
        minByte--;
        System.out.println("Значение после декремента на еденицу " + minByte + "\n");

        // short
        maxShort++;
        System.out.println("Значение после инкремента на еденицу " + maxShort);
        maxShort--;
        System.out.println("Значение после декремента на еденицу " + maxShort + "\n");

        
        minShort++;
        System.out.println("Значение после инкремента на еденицу " + minShort);
        minShort--;
        System.out.println("Значение после декремента на еденицу " + minShort + "\n");

        // int
        maxInt++;
        System.out.println("Значение после инкремента на еденицу " + maxInt);
        maxInt--;
        System.out.println("Значение после декремента на еденицу " + maxInt + "\n");

        minInt++;
        System.out.println("Значение после инкремента на еденицу " + minInt);
        minInt--;
        System.out.println("Значение после декремента на еденицу " + minInt + "\n");

        //long
        maxLong++;
        System.out.println("Значение после инкремента на еденицу " + maxLong);
        maxLong--;
        System.out.println("Значение после декремента на еденицу " + maxLong + "\n");

        minLong++;
        System.out.println("Значение после инкремента на еденицу " + minLong);
        minLong--;
        System.out.println("Значение после декремента на еденицу " + minLong + "\n");

        System.out.println("5 перестановка значений");
        int a = 2;
        int b = 5;
        System.out.println("Первоначальное значение " + a + " " + b);

        int c = a;
        a = b;
        b = c;
        System.out.println("Перестановка с третьей переменной " + a + " " + b);
        
        a = 2;
        b = 5;

        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("Перестановка с побитовой операцией " + a + " " + b);

        a = 2;
        b = 5;

        a += b;
        b = a - b;
        a -= b;
        System.out.println("Перестановка c помощью арифметических выражений " + a + " " + b + "\n");

        System.out.println("6 Вывод символов и их кодов");
        char dollar = '$';
        char asterisk = '*'
        char verticalBar = '|';
        char tilde = '~';

        System.out.println("Код символа " + 36 + " Символ " + dollar);
        System.out.println("Код символа " + 42 + " Символ " + asterisk);
        System.out.println("Код символа " + 124 + " Символ " + verticalBar);
        System.out.println("Код символа " + 126 + " Символ " + tilde + "\n");

        System.out.println("7 Вывод в консоль ASCII-арт Дюка");
        char leftParenthesis = '(';
        char rightParenthesis = ')';
        char rightSlash = '\\';
        char leftSlash = '/';
        char underscore = '_';

        System.out.println("    " + leftSlash + "" + rightSlash);
        System.out.println("   " + leftSlash + "  " + rightSlash);
        System.out.println("  " + leftSlash + "" + underscore + "" + leftParenthesis + " " + rightParenthesis + "" + "" + rightSlash);
        System.out.println(" " + leftSlash + "      " + rightSlash);
        System.out.println(leftSlash + "" + underscore + "" + underscore + "" + underscore + "" + underscore + "" + leftSlash + "" + rightSlash + "" + underscore + "" + underscore + "" + rightSlash + "\n");

        System.out.println("8  Вывод количества сотен, десятков и единиц числа");
        int num = 123;
        int hundreds = (num/100) % 10;
        int tens = (num/10) % 10;
        int units = num % 10;
        int sum = hundreds + tens + units;
        int mathProduct = hundreds * tens * units;

        System.out.println("Число " + num + " Содержит: ");
        System.out.println("  сотен - " + hundreds);
        System.out.println("  десятков - " + tens);
        System.out.println("  едениц - " + units);
        System.out.println("Сумма его цифр = " + sum);
        System.out.println("Произведение = " + mathProduct + "\n");

        System.out.println("9 Вывод времени");
        int time = 86399;
        int hour = time / 3600;
        int minute = time % 60;
        int second = time % 60;
        System.out.println(hour + ":" + minute + ":" + second);
    }
}


