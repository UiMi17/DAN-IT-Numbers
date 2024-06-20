package net.uimi;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int numberToGuess = rand.nextInt(99);
        int guessedNumber;
        String name;

        System.out.println("Please, tell me your name so we can start.");
        name = scanner.nextLine();

        System.out.println("Let the game begin!");

        while (true) {
            guessedNumber = scanner.nextInt();

            if (guessedNumber < numberToGuess) System.out.println("Your number is too small. Please, try again..");
            else if (guessedNumber > numberToGuess) System.out.println("Your number is too big. Please, try again..");
            else {
                char userAnswer;
                System.out.printf("Congratulations, %s!\n", name);
                System.out.println("Play again? (Y/N)");
                userAnswer = scanner.next().toLowerCase().charAt(0);

                if (userAnswer == 'n') break;
                System.out.println("Let the game begin!");
            }
        }
    }
}
