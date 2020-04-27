package GeekBrains;

import java.util.Scanner;

public class lesson5 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Ваша задача - угадать число.");
        for (int i = 10; i <= 30; i += 10) playLevel(i);

    }

    public static void playLevel(int range) {
        System.out.println("Угадайте число от 0 до " + range);

        int inputnumber = 0;
        int number = (int)(Math.random() * range);
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
