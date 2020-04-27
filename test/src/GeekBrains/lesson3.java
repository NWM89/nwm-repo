package GeekBrains;

import java.util.Scanner;

public class lesson3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ваша задача - угадать число.");
        int range = 100;
        int number = (int)(Math.random() * range);
        int inputnumber = 0;
        System.out.println("Угадайте число от 0 до " + range);
        while(true) {
            inputnumber = scanner.nextInt();
            if (inputnumber == number) {
                System.out.println("Вы угадали число");
                break;
            } else if (inputnumber > number){
                System.out.println("Загаданное число меньше введённого");
            } else {
                System.out.println("Загаданное число больше введённого");
            }
        }
    }
}
