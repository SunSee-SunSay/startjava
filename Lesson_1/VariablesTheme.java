import java.math.BigDecimal;
import java.math.RoundingMode;

public class VariablesTheme {   
    public static void main(String[] args) {
        // 1 Вывод характеристик компьютера
        System.out.println("1 Вывод характеристик компьютера");
        boolean hasPc = true;
        int pcConstructionYear = 2017;
        byte cpuCoreCount = 2;
        float cpuClockSpeed = 2.3f;
        short ramCount = 8;
        char integrated = 'i';
        double versionOs = 12.2;
        long gpuCount = 1536;

        System.out.println("Компьютер ("+ hasPc +") " + pcConstructionYear + " года выпуска. \n" +
            cpuCoreCount + "-ядерный процессор Intel Core " + integrated + "5\n" +
            cpuClockSpeed + "GHz - тактовая частота процессора\n" +
            ramCount + "ГБ оперативной памяти\n" +
            versionOs + " версия macOS Monterey\n" +
            gpuCount + "МБ объем видеопамяти\n");

        // 2 Расчет стоимости товара со скидкой
        System.out.println("2 Расчет стоимости товара со скидкой");
        BigDecimal penPrice = new BigDecimal("105.5");
        BigDecimal bookPrice = new BigDecimal("235.83");
        BigDecimal discount = new BigDecimal("0.11");

        BigDecimal totalSum = penPrice.add(bookPrice);
        BigDecimal discountSum = ((totalSum).multiply(discount)).setScale(2, RoundingMode.HALF_UP);
        BigDecimal totalSumWithDiscount = totalSum.subtract(discountSum);

        System.out.println("общая стоимость товаров без скидки: " + totalSum);
        System.out.println("сумма скидки: " + discountSum);
        System.out.println("общая стоимость товаров со скидкой: " + totalSumWithDiscount + "\n");

        // 3 Вывод слова JAVA
        System.out.println("3 Вывод слова JAVA");
        System.out.println("      J      A     V     V     A");
        System.out.println("      J     A A     V   V     A A");
        System.out.println("  J   J    AAAAA     V V     AAAAA");
        System.out.println("   JJ     A     A     V     A     A");

        // 4 Вывод min и max значений целых числовых типов
        System.out.println("\n4 Вывод min и max значений целых числовых типов");
        byte maxByte = 127;
        short maxShort = 32767;
        int maxInt = 2147483647;
        long maxLong = 9223372036854775807l;

        System.out.println(maxByte + " : " + maxByte++ + " : " + maxByte--);
        System.out.println(maxShort + " : " + maxShort++ + " : " + maxShort--);
        System.out.println(maxInt + " : " + maxInt++ + " : " + maxInt--);
        System.out.println(maxLong + " : " + maxLong++ + " : " + maxLong--);

        // 5 Перестановка значений переменных
        System.out.println("\n5 Перестановка значений переменных");
        int num1 = 2;
        int num2 = 5;

        System.out.println("Перестановка с помощью третьей переменной");
        System.out.println("Исходные значения num1 = " + num1 + ", num2 = " + num2);

        int swap = num2;
        num2 = num1;
        num1 = swap;

        System.out.println("Полученные значения num1 = " + num1 + ", num2 = " + num2 + "\n");
        System.out.println("Перестановка с помощью арифметических операций");
        System.out.println("Исходные значения num1 = " + num1 + ", num2 = " + num2);

        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;

        System.out.println("Полученные значения num1 = " + num1 + ", num2 = " + num2 + "\n");
        System.out.println("Перестановка помощью побитовой операции ^");
        System.out.println("Исходные значения num1 = " + num1 + ", num2 = " + num2);

        num1 ^= num2;
        num2 = num1 ^ num2;
        num1 ^= num2;

        System.out.println("Полученные значения num1 = " + num1 + ", num2 = " + num2 + "\n");

        // 6 Вывод символов и их кодов
        System.out.println("6 Вывод символов и их кодов");
        char dollar = '$';
        char asterisk = '*';
        char atSign = '@';
        char verticalBar = '|';
        char tilde = '~';

        System.out.println((int) dollar + " - " + dollar);
        System.out.println((int) asterisk + " - " + asterisk);
        System.out.println((int) atSign + " - " + atSign);
        System.out.println((int) verticalBar + " - " + verticalBar);
        System.out.println((int) tilde + " - " + tilde + "\n");

        // 7 Вывод в консоль ASCII-арт Дюка
        System.out.println("7 Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char underscore = '_';
        char openBracket = '(';
        char closeBracket = ')';
        char backslash = '\\';

        System.out.println("       " + slash + backslash);
        System.out.println("      " + slash + "  " + backslash);
        System.out.println("     " + slash + underscore + openBracket + " " + closeBracket + backslash);
        System.out.println("    " + slash + "      " + backslash);
        System.out.println("   " + slash + underscore + underscore + underscore + underscore + slash +
            backslash + underscore + underscore + backslash + "\n");

        // 8 Вывод количества сотен, десятков и единиц числа
        System.out.println("8 Вывод количества сотен, десятков и единиц числа");
        int number = 123;
        int hundreds = number / 100;
        int remainder = number % 100;
        int tens = remainder / 10;
        int units = remainder % 10;

        System.out.println("Число " + number + " содержит: ");
        System.out.println("сотен - " + hundreds);
        System.out.println("десятков - " + tens);
        System.out.println("единиц - " + units);
        System.out.println("Сумма его цифр: " + (hundreds + tens + units));
        System.out.println("Произведение: " + (hundreds * tens * units));

        // 9 Вывод времени
        System.out.println("\n9 Вывод времени");
        int time = 86399;
        int hours = time / 3600;
        int minutes = (time % 3600) / 60;
        int seconds = time % 60;

        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}