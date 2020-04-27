package GeekBrains;

import java.util.Scanner;

public class lesson4 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Ваша задача - угадать число.");
        int range = 100;
        int number = (int)(Math.random() * range);

        System.out.println("Угадайте число от 0 до " + range);
        playLevel(range,number);

    }

    public static void playLevel(int range, int number) {
        int inputnumber = 0;
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
