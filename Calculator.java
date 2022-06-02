import java.util.Scanner;

public class Calculator {


    public static void main(String[] args) {
        // Инициализируем переменные а и b - это числа, которые вводит пользователь. result - это переменная результата
        // sign - это переменная оператора (+, -, /, *, %, ^)
        int a, b, result;
        char sign;

        // Добавляем считывание
        Scanner console = new Scanner(System.in);

        // Запрашиваем числа
        System.out.println("Введите 2 целых положительных числа");

        // Считываем а и b
        a = console.nextInt();
        b = console.nextInt();

        // Запрашиваем оператор
        System.out.println("Введите оператор: +, -, *, /, %, ^");

        // Считываем оператор
        sign = console.next().charAt(0);

        // Далее с помощью switch реализовываем наш калькулятор
        switch (sign) {
            // если введён оператор + - то a + b и т. д.
            case '+': result = a + b;
                break;
            case '-': result = a - b;
                break;
            case '*': result = a * b;
                break;
            case '/': result = a / b;
                break;
            case '%': result = a % b;
                break;
            case '^': result = a ^ b;
                break;
            default:
                System.out.println("Введён некорректный оператор");
                return;
        }

        // Выводим результаты
        System.out.println("Результат:");
        System.out.println(a + " " + sign + " " + b + " = " + result);
    }
}
