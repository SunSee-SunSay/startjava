import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение первого числа: ");
        int number1 = scanner.nextInt();

        System.out.print("Введите знак: ");
        char sign = scanner.next().charAt(0);

        System.out.print("Введите значение второго числа: ");
        int number2 = scanner.nextInt();

        scanner.close();

        int result = 1;
        if (sign == '+') {
            result = number1 + number2;
        } else if (sign == '-') {
            result = number1 - number2;
        } else if (sign == '*') {
            result = number1 * number2;
        } else if (sign == '/') {
            result = number1 / number2;
        } else if (sign == '%') {
            result = number1 % number2;
        } else if (sign == '^') {
            for (int i = 1; i <= number2; i++) {
                result *= number1;
            }
        } else {
            System.out.println("Введите корректный символ операции из доступных: +, -, *, /, ^, %");
            return;
        }

        System.out.println(number1 + " " + sign + " " + number2 + " = " + result);
    }
}