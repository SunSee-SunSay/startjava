import java.math.BigDecimal;
import java.math.RoundingMode;

public class VariablesTheme {   
    public static void main(String[] args) {
        // 1 Вывод характеристик компьютера
        System.out.println("1 Вывод характеристик компьютера");
        boolean computer = true;
        int computerConstructionYear = 2017;
        byte processorCoreCount = 2;
        float processorClockSpeed = 2.3f;
        short ram = 8;
        char integrated = 'i';
        double versionOs = 12.2;
        long gpu = 1536;

        System.out.println("Компьютер ("+ computer +") " + computerConstructionYear + " года выпуска. \n"
            + processorCoreCount + "-ядерный процессор Intel Core " + integrated + "5\n"
            + processorClockSpeed + "GHz - тактовая частота процессора\n"
            + ram + "ГБ оперативной памяти\n"
            + versionOs + " версия macOS Monterey\n"
            + gpu + "МБ объем видеопамяти\n");

        // 2 Расчет стоимости товара со скидкой
        System.out.println("2 Расчет стоимости товара со скидкой");
        BigDecimal penPrice = new BigDecimal("105.5");
        BigDecimal bookPrice = new BigDecimal("235.83");
        BigDecimal discount = new BigDecimal("11");

        BigDecimal totalSum = penPrice.add(bookPrice);
        BigDecimal discountSum = ((totalSum).multiply(discount)).divide(new BigDecimal(100)).setScale(2, RoundingMode.HALF_UP);
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
        System.out.println("");

        // 4 Вывод min и max значений целых числовых типов
        System.out.println("4 Вывод min и max значений целых числовых типов");
        byte maxByte = 127;
        short maxShort = 32767;
        int maxInt = 2147483647;
        long maxLong = 9223372036854775807l;

        System.out.println(maxByte);
        System.out.println(maxByte++);
        System.out.println(maxByte--);

        System.out.println(maxShort);
        System.out.println(maxShort++);
        System.out.println(maxShort--);

        System.out.println(maxInt);
        System.out.println(maxInt++);
        System.out.println(maxInt--);

        System.out.println(maxLong);
        System.out.println(maxLong++);
        System.out.println(maxLong--);

        System.out.println("");

        // 5 Перестановка значений переменных
        System.out.println("5 Перестановка значений переменных");
        int num1 = 2;
        int num2 = 5;

        System.out.println("Перестановка с помощью третьей переменной");
        System.out.println("Исходные значения num1 = " + num1 + ", num2 = " + num2);

        int num3 = num2;
        num2 = num1;
        num1 = num3;

        System.out.println("Полученные значения num1 = " + num1 + ", num2 = " + num2 + "\n");
        System.out.println("Перестановка с помощью арифметических операций");
        System.out.println("Исходные значения num1 = " + num1 + ", num2 = " + num2);

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("Полученные значения num1 = " + num1 + ", num2 = " + num2 + "\n");
        System.out.println("Перестановка помощью побитовой операции ^");
        System.out.println("Исходные значения num1 = " + num1 + ", num2 = " + num2);

        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;

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
        char ch1 = '/';
        char ch2 = '_';
        char ch3 = '(';
        char ch4 = ')';
        char ch5 = '\\';

        System.out.println("       " + ch1 + ch5);
        System.out.println("      " + ch1 + "  " + ch5);
        System.out.println("     " + ch1 + ch2 + ch3 + " " + ch4 + ch5);
        System.out.println("    " + ch1 + "      " + ch5);
        System.out.println("   " + ch1 + ch2 + ch2 + ch2 + ch2 + ch1 + ch5 + ch2 + ch2 + ch5 + "\n");

        // 8 Вывод количества сотен, десятков и единиц числа
        System.out.println("8 Вывод количества сотен, десятков и единиц числа");
        int number = 123;

        System.out.println("Число " + number + " содержит: ");
        System.out.println("сотен - " + (number / 100));
        System.out.println("десятков - " + ((number % 100) / 10));
        System.out.println("единиц - " + ((number % 100) % 10));
        System.out.println("Сумма его цифр: " + ((number / 100) + ((number % 100) / 10) + ((number % 100) % 10)));
        System.out.println("Произведение: " + ((number / 100) * ((number % 100) / 10) * ((number % 100) % 10)));
        System.out.println("");

        // 9 Вывод времени
        System.out.println("9 Вывод времени");
        int time = 86399;
        int hours = time / 3600;
        int minutes = (time % 3600) / 60;
        int seconds = (time % 3600) % 60;

        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}