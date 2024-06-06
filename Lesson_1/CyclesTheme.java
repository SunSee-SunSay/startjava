public class CyclesTheme {
    public static void main(String[] args) {
        // 1 Подсчет суммы четных и нечетных чисел
        System.out.println("1 Подсчет суммы четных и нечетных чисел");
        int lowerBound = -10;
        int upperBound = 21;

        int num = lowerBound;
        int sumEven = 0;
        int sumOdd = 0;

        do {
            if (num % 2 == 0) {
                sumEven += num;
            } else {
                sumOdd += num;
            }
            num++;
        } while (num <= upperBound);

        System.out.println("Сумма четных чисел: " + sumEven);
        System.out.println("Сумма нечетных чисел: " + sumOdd);

        // 2 Вывод чисел в порядке убывания
        System.out.println("\n2 Вывод чисел в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;

        int max = num1;
        if (num2 > max) {
            max = num2;
        }

        if (num3 > max) {
            max = num3;
        }

        int min = num1;
        if (num2 < min) {
            min = num2;
        }

        if (num3 < min) {
            min = num3;
        }

        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        // 3 Вывод реверсивного числа и суммы его цифр
        System.out.println("\n\n3 Вывод реверсивного числа и суммы его цифр");
        int number = 1234;
        int sum = 0;
        String reversedNumber = "";

        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            reversedNumber += digit + " ";
            number = number / 10;
        }

        System.out.println(sum);
        System.out.println(reversedNumber);

        // 4 Вывод чисел в несколько строк
        System.out.println("\n4 Вывод чисел в несколько строк");
        int limit = 24;
        int count = 0;

        for (int i = 1; i < limit; i++) {
            System.out.printf("%5d", i);
            count++;

            if (count == 5) {
                System.out.println();
                count = 0;
            } 

            if (count != 5 && i == limit - 1) {
                for (int j = 1; j <= 5 - count; j++) {
                    System.out.printf("%5d", 0);
                } 
            }
        }

        // 5 Проверка количества двоек числа на четность/нечетность
        System.out.println("\n\n5 Проверка количества двоек числа на четность/нечетность");
        number = 3242592;
        String state = "В " + number + " ";
        int counter = 0;

        while (number != 0) {
            int digit = number % 10;
            number = number / 10;
            if (digit == 2) {
                counter++;
            }
        }

        if (counter % 2 == 0) {
            state += "четное";
        } else {
            state += "нечетное";
        }

        state += " (" + counter + ") количество двоек";
        System.out.println(state + "\n");

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
        System.out.println("\n7 Вывод ASCII-символов");
        System.out.printf("%-13s", "DECIMAL");
        System.out.printf("%-15s", "CHARACTER");
        System.out.print("DESCRIPTION");
        System.out.println();

        for (i = 33; i <= 57; i++) {
            if (i % 2 != 0) {
                System.out.printf("%4d", i);
                System.out.printf("%14c", i);
                System.out.printf("               %s %n", Character.getName(i));
            }
        }

        for (i = 97; i <= 122; i++) {
            if (i % 2 == 0) {
                System.out.printf("%4d", i);
                System.out.printf("%14c", i);
                System.out.printf("               %s %n", Character.getName(i));
            }
        }

        // 8 Проверка, является ли число палиндромом
        System.out.println("\n8 Проверка, является ли число палиндромом");

        number = 1234321;
        int originalNumber = number;
        int reverseNumber = 0;

        while (number != 0) {
            reverseNumber = reverseNumber * 10 + (number % 10);
            number = number / 10;
        }

        if (originalNumber == reverseNumber) {
            System.out.println(originalNumber + " является палиндромом.");
        } else {
            System.out.println(originalNumber + " не является палиндромом.");
        }

        // 9 Проверка, является ли число счастливым
        System.out.println("\n9 Проверка, является ли число счастливым");

        number = 123321;
        int sumFirstHalf = 0;
        int sumSecondHalf = 0;
        state = "Число " + number;
        String firstHalf = "";
        String secondHalf = "";
        i = 0;

        while (i < 6) {
            int digit = number % 10;

            if (i < 3) {
                firstHalf += digit;
                sumFirstHalf += digit;
            } else {
                secondHalf += digit;
                sumSecondHalf += digit;
            }
            number = number / 10;
            i++;
        }

        if (sumFirstHalf == sumSecondHalf) {
            System.out.println(state + " счастливое");
        } else {
            System.out.println(state + "обычное");
        }

        System.out.println("Сумма цифр " + firstHalf + " = " + sumFirstHalf);
        System.out.println("Сумма " + secondHalf + " = " + sumSecondHalf);

        // 10 Вывод таблицы умножения Пифагора
        System.out.println("\n10 Вывод таблицы умножения Пифагора");

        System.out.println("       2  3  4  5  6  7  8  9");
        System.out.println("       -  -  -  -  -  -  -  -");

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