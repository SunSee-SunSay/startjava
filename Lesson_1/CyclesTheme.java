public class CyclesTheme {
    public static void main(String[] args) {
        // 1 Подсчет суммы четных и нечетных чисел
        System.out.println("1 Подсчет суммы четных и нечетных чисел");
        int lowerBound = -10;
        int upperBound = 21;

        int counter = lowerBound;
        int sumEven = 0;
        int sumOdd = 0;

        do {
            if (counter % 2 == 0) {
                sumEven += counter;
            } else {
                sumOdd += counter;
            }
            counter++;
        } while (counter <= upperBound);

        System.out.println("В отрезке [" + lowerBound + ", " + upperBound + "] сумма четных чисел = " +
                sumEven + ", а нечетных = " + sumOdd);

        // 2 Вывод чисел в порядке убывания
        System.out.println("\n2 Вывод чисел в порядке убывания");
        int number1 = 10;
        int number2 = 5;
        int number3 = -1;

        int max = number1;
        if (number2 > max) {
            max = number2;
        }

        if (number3 > max) {
            max = number3;
        }

        int min = number1;
        if (number2 < min) {
            min = number2;
        }

        if (number3 < min) {
            min = number3;
        }

        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        // 3 Вывод реверсивного числа и суммы его цифр
        System.out.println("\n\n3 Вывод реверсивного числа и суммы его цифр");
        int number = 1234;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
            System.out.print(digit);
        }

        System.out.println("\nСумма чисел: " + sum);

        // 4 Вывод чисел в несколько строк
        System.out.println("\n4 Вывод чисел в несколько строк");
        upperBound = 24;
        int count = 0;

        for (int i = 1; i < upperBound; i += 2) {
            System.out.printf("%5d", i);
            count++;

            if (count == 5) {
                System.out.println();
                count = 0;
            }
        }

        if (count > 0) {
            for (int j = 1; j <= 5 - count; j++) {
                System.out.printf("%5d", 0);
            }
        }

        // 5 Проверка количества двоек числа на четность/нечетность
        System.out.println("\n\n5 Проверка количества двоек числа на четность/нечетность");
        number = 3242592;
        int numberCopy = 3242592;
        int countTwos = 0;

        while (number != 0) {
            number /= 10;
            if (number % 10 == 2) {
                countTwos++;
            }
        }

        String state = "нечетное";
        if (countTwos % 2 == 0) {
            state = "четное";
        }

        System.out.println("В " + numberCopy + " " + state + " (" + countTwos + ") количество двоек\n");

        // 6 Вывод геометрических фигур
        System.out.println("6 Вывод геометрических фигур");
        int width = 10;
        int height = 5;

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        int rows = 5;
        int i = 1;
        int j = 1;

        while (i <= rows) {
            System.out.print("# ");
            if (j == rows) {
                System.out.println();
                j = rows - (rows - i);
                i++;
            }
            j++;
        }

        System.out.println();
        int length = 5;
        i = 1;
        j = 1;

        do {
            System.out.println("*");
            // по условию начинается отрисовка в обратную сторону
            if (i == length && length != 2) {
                length -= 1;
                i = length;
            } else {
                i++;
            }

            j = 1;

            do {
                System.out.print("* ");
                j++;
                if (length == 2) {
                    break;
                }
            } while (j < i);
        } while (i <= length);

        // 7 Вывод ASCII-символов
        System.out.println("\n\n7 Вывод ASCII-символов");
        System.out.printf("%-13s %-15s %s\n", "DECIMAL", "CHARACTER", "DESCRIPTION");

        for (i = 33; i <= 57; i++) {
            if (i % 2 != 0) {
                System.out.printf("%4d %14c               %s\n", i, i, Character.getName(i));
            }
        }

        for (i = 97; i <= 122; i++) {
            if (i % 2 == 0) {
                System.out.printf("%4d %14c               %s\n", i, i, Character.getName(i));
            }
        }

        // 8 Проверка, является ли число палиндромом
        System.out.println("\n8 Проверка, является ли число палиндромом");

        number = 1234321;
        numberCopy = number;
        int reverseNumber = 0;

        while (number != 0) {
            reverseNumber = reverseNumber * 10 + (number % 10);
            number /= 10;
        }

        if (numberCopy == reverseNumber) {
            System.out.println(numberCopy + " является палиндромом.");
        } else {
            System.out.println(numberCopy + " не является палиндромом.");
        }

        // 9 Проверка, является ли число счастливым
        System.out.println("\n9 Проверка, является ли число счастливым");

        number = 123321;
        numberCopy = number;
        int sumFirstHalf = 0;
        int sumSecondHalf = 0;
        state = "Число " + number;

        for (i = 0; i < 6; i++) {
            int digit = number % 10;

            if (i < 3) {
                sumFirstHalf += digit;
            } else {
                sumSecondHalf += digit;
            }

            number /= 10;
        }

        if (sumFirstHalf == sumSecondHalf) {
            System.out.println(state + " счастливое");
        } else {
            System.out.println(state + "обычное");
        }

        System.out.println("Сумма цифр " + numberCopy / 1000 + " = " + sumFirstHalf);
        System.out.println("Сумма " + numberCopy % 1000 + " = " + sumSecondHalf);

        // 10 Вывод таблицы умножения Пифагора
        System.out.println("\n10 Вывод таблицы умножения Пифагора");

        System.out.println("      2  3  4  5  6  7  8  9");
        System.out.println("  ---  -  -  -  -  -  -  -  -");

        for (i = 2; i <= 9; i++) {
            System.out.printf("%3d", i);
            for (j = 2; j <= 9; j++) {
                if (j == 2) {
                    System.out.printf("%2s", "|");
                }

                System.out.printf("%3d", i * j);
                if (j == 9) {
                    System.out.println();
                }
            }
        }
    }
}