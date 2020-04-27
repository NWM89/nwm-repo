package GeekBrains;

import java.util.Scanner;

public class lesson2 {
    public static void main(String[] args) {
        System.out.println("Введите номер оперцаии");
        System.out.println("1. Сложение");
        System.out.println("2. Вычитание");
        System.out.println("3. Умножение");
        System.out.println("4. Деление");
        Scanner scanner = new Scanner(System.in);
        int operation = scanner.nextInt();
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        double result = 0;
        switch (operation) {
            case (1):
                result = a + b;
                break;
            case (2):
                result = a - b;
                break;
            case (3):
                result = a * b;
                break;
            case (4):
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("Деление на ноль не возможно");
                }
                break;
        }
        System.out.println("Результат = " + result);



    }
}
