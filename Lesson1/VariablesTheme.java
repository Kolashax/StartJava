public class VariablesTheme  {
    public static void main(String[] args) {
        System.out.println("1 Вывод характеристик компьютера (это название задачи)");
        String cpu = " i5-12-400F";
        byte coreCount = 6;
        String vendorCpu = "Intel";
        float minFrequency = 2.5f;
        short theard = 12;
        int tdp = 65;
        double maxFrequency = 4.4;
        long socket = 1700;
        char sym = 'F';
        boolean isCpuEnable = true;

        System.out.println("Название процессора: " + cpu);
        System.out.println("Производитель: " + vendorCpu);
        System.out.println("Кол во ядер: " + coreCount);
        System.out.println("Минимальная частота процессора: " + minFrequency + " Hz");
        System.out.println("Максимальная частота процессора: " + maxFrequency + " Hz");
        System.out.println("Кол-во потоков: " + theard);
        System.out.println("Сокет: LGA" + socket);
        System.out.println("Символ: " + sym);
        System.out.println("Процессор Рабочий? " + isCpuEnable);
        System.out.println("Тепловыделние процессора: " + tdp + "\n");

        System.out.println("2 Расчет стоимости товара со скидкой");
        int pricePen = 100;
        int priceBook = 200;
        int discountBook = 200 * 11/100;
        int discountPen = 100 * 11/100;
        int discountTotal = discountPen + discountBook;
        
        System.out.println("Общая стоимость товара " + (priceBook + pricePen));
        System.out.println("Сумма скидки: " + (pricePen + priceBook) * 11/100);
        System.out.println("Общая стоимость товара со скидкой: " + (priceBook + pricePen - discountTotal) + "\n");

        System.out.println(" 3 Вывод слова JAVA");
        System.out.println("   J" + "    a " + " v     v " + "a " ); 
        System.out.println("   J" + "   a a " + " v   v " +  "a a ");
        System.out.println("J  J" + "  aaaaa " + " V V " +  "aaaaa  ");
        System.out.println(" JJ" + "  a     a " + " V " + "a     a " + "\n"  );

        System.out.println("4 Вывод min и max значений целых числовых типов");
        byte max = 127;
        byte min = -128;
        short max2 = 32767;
        short min2 = -32768;
        int max3 = 2147483647;
        int min3 = -2147483648;
        long max4 = 9223372036854775807L;
        long min4 = -9223372036854775808L;

       // byte
        System.out.println("Первоначальное значение: " + max);
        max++;
        System.out.println("Значение после инкремента на еденицу " + max);
        max--;
        System.out.println("Значение после декремента на еденицу " + max + "\n");

        System.out.println("Первоначальное значение: " + min);
        min++;
        System.out.println("Значение после инкремента на еденицу " + min);
        min--;
        System.out.println("Значение после декремента на еденицу " + min + "\n");

        // short
        System.out.println("Первоначальное значение " + max2);
        max2++;
        System.out.println("Значение после инкремента на еденицу " + max2);
        max2--;
        System.out.println("Значение после декремента на еденицу " + max2 + "\n");

        System.out.println("Первоначальное значение " + min2);
        min2++;
        System.out.println("Значение после инкремента на еденицу " + min2);
        min2--;
        System.out.println("Значение после декремента на еденицу " + min2 + "\n");

        // int
        System.out.println("Первоначальное значение " + max3);
        max3++;
        System.out.println("Значение после инкремента на еденицу " + max3);
        max3--;
        System.out.println("Значение после декремента на еденицу " + max3 + "\n");

        System.out.println("Первоначальное значение " + min3);
        min3++;
        System.out.println("Значение после инкремента на еденицу " + min3);
        min3--;
        System.out.println("Значение после декремента на еденицу " + min3 + "\n");

        //long
        System.out.println("Первоначальное значение " + max4);
        max4++;
        System.out.println("Значение после инкремента на еденицу " + max4);
        max4--;
        System.out.println("Значение после декремента на еденицу " + max4 + "\n");

        System.out.println("Первоначальное значение " + min4);
        min4++;
        System.out.println("Значение после инкремента на еденицу " + min4);
        min4--;
        System.out.println("Значение после декремента на еденицу " + min4 + "\n");

        System.out.println("5 перестановка значений");
        int a = 2;
        int b = 5;
        System.out.println("Первоначальное значение " + a + " " + b);

        int c = a;
        a = b;
        b = c;
        System.out.println("Перестановка с третьей переменной " + a + " " + b);

        a = 10;
        b = 20;
        System.out.println("Первоначальное значение " + a + " " + b);

        a = a ^ b;
        b = b ^ a;
        a = a ^ b;
        System.out.println("Перестановка с побитовой операцией " + a + " " + b);

        a = 15;
        b = 40;
        System.out.println("Первоначальное значение " + a + " " + b);

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Перестановка c помощью арифметических выражений " + a + " " + b + "\n");

       System.out.println("6 Вывод символов и их кодов");
       char sym2 = '$';
       char sym3 = '*';
       char sym4 = '|';
       char sym5 = '~';

       int n = 36;
       int d = 42;
       int e = 124;
       int k = 126;

       System.out.println("Код символа " + n + " Символ " + sym2);
       System.out.println("Код символа " + d + " Символ " + sym3);
       System.out.println("Код символа " + e + " Символ " + sym4);
       System.out.println("Код символа " + k + " Символ " + sym5 + "\n");

       System.out.println("7 Вывод в консоль ASCII-арт Дюка");
       char sym6 = '(';
       char sym7 = ')';
       char sym8 = '\\';
       char sym9 = '/';
       char sym10 = '_';
 
       System.out.println("    " + sym9 + "" + sym8);
       System.out.println("   " + sym9 + "  " + sym8);
       System.out.println("  " + sym9 + "" + sym10 + "" + sym6 + " " + sym7 + "" + "" + sym8);
       System.out.println(" " +sym9 + "      " + sym8);
       System.out.println(sym9 + "" + sym10 + "" + sym10 + "" + sym10 + "" + sym9 + "" + sym8 + "" + sym10 + "" + sym10 +   " " + sym8 + "\n");

       System.out.println("8  Вывод количества сотен, десятков и единиц числа");
       int num = 123;
       int x = (num/100) % 10;
       int y = (num/10) % 10;
       int z = num % 10;
       int s = x + y + z;
       int p = x * y * z;

       System.out.println("Число " + num + " Содержит: ");
       System.out.println("  сотен - " + x);
       System.out.println("  десятков - " + y);
       System.out.println("  едениц - " + z);
       System.out.println("Сумма его цифр = " + s);
       System.out.println("Произведение = " + p + "\n");

       System.out.println("9 Вывод времени");
       int time = 86399;
       int hour = time / 3600;
       int min7 = time / 60 % 60;
       int sec = time / 1 % 60;
       System.out.println(hour + ":" + min7 + ":" + sec);

    }
}