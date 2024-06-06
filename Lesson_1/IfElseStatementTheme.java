import java.math.BigDecimal;
import java.math.RoundingMode;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        // 1 Перевод псевдокода на язык Java
        System.out.println("1 Перевод псевдокода на язык Java");

        boolean male = true;
        if (!male) {
            System.out.println("Это женщина");
        } else {
            System.out.println("Это мужчина");
        }

        int age = 23;
        if (age > 18) {
            System.out.println("Совершеннолетний");
        } else {
            System.out.println("Несовершеннолетний");
        }

        float height = 1.8f;
        if (height < 1.8) {
            System.out.println("Низкий рост");
        } else {
            System.out.println("Высокий рост");
        }

        String name = "Иннокентий";
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
        } else {
            String state = " отрицательное, ";
            if (number > 0) {
                state = " положительное, ";
            }

            if (number % 2 == 0) {
                state += "четное";
            } else {
                state += "нечетное";
            }

            System.out.println("Число " + number + state + "\n");
        }

        // 4 Поиск одинаковых цифр в числах
        System.out.println("4 Поиск одинаковых цифр в числах");
        int num1 = 123;
        int num2 = 128;
        int num1Hundreds = num1 / 100;
        int num2Hundreds = num2 / 100;
        int num1Tens = num1 % 100 / 10;
        int num2Tens = num2 % 100 / 10;

        boolean hasEqualDigits = false;
        String equalDigits = "";
        String rank = "";

        System.out.println("Исходные числа: " + num1 + ", " + num2);
        if (num1Hundreds == num2Hundreds) {
            hasEqualDigits = true;
            equalDigits += num1Hundreds + " ";
            rank += "3 ";
        }

        int num1Ones = num1 % 10;
        int num2Ones = num2 % 10;

        if (num1Tens == num2Tens) {
            hasEqualDigits = true;
            equalDigits += num1Tens + " ";
            rank += "2 ";
        }

        if (num1Ones == num2Ones) {
            hasEqualDigits = true;
            equalDigits += num1Ones;
            rank += "1";
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
        BigDecimal depositSum = new BigDecimal("321123.59");
        BigDecimal depositAmount1 = new BigDecimal("100000");
        BigDecimal depositAmount2 = new BigDecimal("300000");
        BigDecimal percent = new BigDecimal("5");

        if (depositSum.compareTo(depositAmount1) >= 0 && depositSum.compareTo(depositAmount2) < 0) {
            percent = new BigDecimal("7");
        } else if (depositSum.compareTo(depositAmount3) >= 0) {
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

        int historyPercent = 59;
        int historyGrade = 0;

        if (historyPercent <= 60) {
            historyGrade = 2;
        } else if (historyPercent <= 73) {
            historyGrade = 3;
        } else if (historyPercent <= 91) {
            historyGrade = 4;
        } else {
            historyGrade = 5;
        }

        int programmingPercent = 92;
        int programmingGrade = 0;
        
        if (programmingPercent <= 60) {
            programmingGrade = 2;
        } else if (programmingPercent <= 73) {
            programmingGrade = 3;
        } else if (programmingPercent <= 91) {
            programmingGrade = 4;
        } else {
            programmingGrade = 5;
        }

        float averageGrade = 0f;
        float averagePercent = 0f;
        averageGrade = (float) (historyGrade + programmingGrade) / 2;
        averagePercent = (float) (historyPercent + programmingPercent) / 2;

        System.out.println("История: " + historyGrade);
        System.out.println("Программирование: " + programmingGrade);
        System.out.println("Средний балл: " + averageGrade);
        System.out.println("Средний процент: " + averagePercent);

        // 8 Расчет годовой прибыли
        System.out.println("\n8 Расчет годовой прибыли");
        
        BigDecimal monthSelling = new BigDecimal("13025.233");
        BigDecimal monthRent = new BigDecimal("5123.018");
        BigDecimal montCostPrice = new BigDecimal("9001.729");

        BigDecimal monthlyProfit = (monthSelling.subtract((monthRent.add(montCostPrice))))
                    .setScale(2, RoundingMode.HALF_UP);
        BigDecimal yearlyProfit = (monthlyProfit.multiply(new BigDecimal("12")))
                    .setScale(2, RoundingMode.HALF_UP);

        if (yearlyProfit.compareTo(BigDecimal.ZERO) <= 0) {
            System.out.println("Прибыль за год: " + yearlyProfit + " руб.");
        } else {
            System.out.println("Прибыль за год: +" + yearlyProfit + " руб.");
        }
    }
}