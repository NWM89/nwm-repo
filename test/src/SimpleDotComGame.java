import java.util.Scanner;

public class SimpleDotComGame {
    public static void main (String[] args) {
        SimpleDotCom dot = new SimpleDotCom();
        int[] locations = {2,3,4};
        int numOfGuesses = 0;
        dot.setLocationCells(locations);
        String result = "Мимо";

        while(result != "Потопил") {
            System.out.print("Введите число ");

            Scanner in = new Scanner(System.in);
            String userGuess = in.nextLine();

            result = dot.checkYourself(userGuess);
        }
    }
}
