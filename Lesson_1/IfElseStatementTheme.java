import java.math.BigDecimal;
import java.math.RoundingMode;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        // 1 Перевод псевдокода на язык Java
        System.out.println("1 Перевод псевдокода на язык Java");
        boolean male = true;
        int age = 23;
        float height = 1.8f;
        String name = "Иннокентий";

        if (!male) {
            System.out.println("Это женщина");
        } else {
            System.out.println("Это мужчина");
        }

        if (age > 18) {
            System.out.println("Совершеннолетний");
        } else {
            System.out.println("Несовершеннолетний");
        }

        char firstNameLetter = name.charAt(0);
        if (firstNameLetter == 'И') {
            System.out.println("Первая буква имени И");
        } else if (firstNameLetter == 'М') {
            System.out.println("Первая буква имени М");
        } else {
            System.out.println("Совпадений букв в имени не найдено");
        }

        // 2 Поиск большего числа
        System.out.println("\n2 Поиск большего числа");
        int a = 100;
        int b = 102;

        if (a < b) {
            System.out.println("Число " + a + " < " + b + "\n");
        } else if (b < a) {
            System.out.println("Число " + b + " < " + a + "\n");
        } else {
            System.out.println("Числа равны\n");
        }

        // 3 Проверка числа
        System.out.println("3 Проверка числа");
        int number = -3;

        if (number == 0) {
            System.out.println("Число равно нулю, четное");
            System.exit(0);
        }

        String text = "";
        if (number < 0) {
           text = " отрицательное, ";
        } else {
            text = " положительное, ";
        }

        if (number % 2 == 0) {
            text += "четное";
        } else {
            text += "нечетное";
        }

        System.out.println("Число " + number + text + "\n");

        // 4 Поиск одинаковых цифр в числах
        System.out.println("4 Поиск одинаковых цифр в числах");
        int num1 = 123;
        int num2 = 128;
        int num1Hundreds = num1 / 100;
        int num2Hundreds = num2 / 100;
        int remainder1 = num1 % 100;
        int remainder2 = num2 % 100;
        int num1Tens = remainder1 / 10;
        int num2Tens = remainder2 / 10;
        int num1Units = remainder1 % 10;
        int num2Units = remainder2 % 10;
        boolean hasEqualDigits = false;
        String equalDigits = "";
        String rank = "";

        System.out.println("Исходные числа: " + num1 + ", " + num2);
        if (num1Hundreds == num2Hundreds) {
            hasEqualDigits = true;
            equalDigits += num1Hundreds + " ";
            rank += "1 ";
        }

        if (num1Tens == num2Tens) {
            hasEqualDigits = true;
            equalDigits += num1Tens + " ";
            rank += "2 ";
        }

        if (num1Units == num2Units) {
            hasEqualDigits = true;
            equalDigits += num1Units;
            rank += "3";
        }

        if (!hasEqualDigits) {
            System.out.println("У чисел нет одинаковых цифр на одинаковых позициях.");
        } else {
            System.out.println("Одинаковые цифры: " + equalDigits);
            System.out.println("Номер разрядов: " + rank + "\n");
        }

        // 5 Определение символа по его коду
        System.out.println("5 Определение символа по его коду");
        char symbol = '\u005E';

        if ((symbol >= 'a' && symbol <= 'z') || (symbol >= 'а' && symbol <= 'я')) {
        System.out.println("Символ " + symbol + " является маленькой буквой\n");
        } else if ((symbol >= 'A' && symbol <= 'Z') || (symbol >= 'А' && symbol <= 'Я')) {
        System.out.println("Символ " + symbol + " является большой буквой\n");
        } else if (symbol >= '0' && symbol <= '9') {
        System.out.println("Символ " + symbol + " является цифрой\n");
        } else {
        System.out.println(symbol + " - не буква и не цифра\n");
        }

        // 6 Подсчет суммы вклада и начисленных банком %
        System.out.println("6 Подсчет суммы вклада и начисленных банком %");
        BigDecimal depositSum = new BigDecimal("10000");
        BigDecimal sum1 = new BigDecimal("100000");
        BigDecimal sum2 = new BigDecimal("300000");
        BigDecimal percent = new BigDecimal("0");

        if (depositSum.compareTo(sum1) == -1) {
            percent = new BigDecimal("5");
        } else if (depositSum.compareTo(sum1) != -1 && depositSum.compareTo(sum2) != 1) {
            percent = new BigDecimal("7");
        } else {
            percent = new BigDecimal("10");
        }

        BigDecimal percentSum = (percent.divide(new BigDecimal("100"), 2, RoundingMode.HALF_UP))
            .multiply(depositSum).setScale(2, RoundingMode.HALF_UP);
        BigDecimal totalDepositSum = depositSum.add(percentSum).setScale(2, RoundingMode.HALF_UP);

        System.out.println("сумма вклада " + depositSum);
        System.out.println("сумма начисленного % " + percentSum);
        System.out.println("итоговая сумма с % " + totalDepositSum);

        // 7 Определение оценки по предметам
        System.out.println("\n7 Определение оценки по предметам");
        int history = 59;
        int programming = 92;
        int historyGrade = 0;
        int programmingGrade = 0;
        float averageGrade = 0f;
        float averagePercent = 0f;

        if (history <= 60) {
            historyGrade = 2;
        } else if (history <= 73) {
            historyGrade = 3;
        } else if (history <= 91) {
            historyGrade = 4;
        } else {
            historyGrade = 5;
        }

        if (programming <= 60) {
            programmingGrade = 2;
        } else if (programming <= 73) {
            programmingGrade = 3;
        } else if (programming <= 91) {
            programmingGrade = 4;
        } else {
            programmingGrade = 5;
        }

        averageGrade = (float) (historyGrade + programmingGrade) / 2;
        averagePercent = (float) (history + programming) / 2;

        System.out.println("История: " + historyGrade);
        System.out.println("Программирование: " + programmingGrade);
        System.out.println("Средний балл: " + averageGrade);
        System.out.println("Средний процент: " + averagePercent);

        // 8 Расчет годовой прибыли
        System.out.println("\n8 Расчет годовой прибыли");
        BigDecimal monthSelling = new BigDecimal("13025.233");
        BigDecimal monthRent = new BigDecimal("5123.018");
        BigDecimal montCostPrice = new BigDecimal("9001.729");

        BigDecimal monthlyProfit = (monthSelling.subtract((monthRent.add(montCostPrice)))).setScale(2, RoundingMode.HALF_UP);
        BigDecimal yearlyProfit = (monthlyProfit.multiply(new BigDecimal("12"))).setScale(2, RoundingMode.HALF_UP);

        int result = yearlyProfit.compareTo(BigDecimal.ZERO);
        if (result > 0) {
            System.out.println("Прибыль за год: +" + yearlyProfit + " руб.");
        } else if (result == 0) {
            System.out.println("Прибыль за год: " + yearlyProfit + " руб.");
        } else {
            System.out.println("Прибыль за год: " + yearlyProfit + " руб.");
        }
    }
}