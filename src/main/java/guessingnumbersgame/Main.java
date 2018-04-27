package guessingnumbersgame;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {


    public static void guessTheseNumbers() throws InputMismatchException{
        String tooLarge = "Too large.";
        String tooSmall = "Too small.";
        int randomGuessingNumber = (int) Math.floor(Math.random()  * 10);
        int numOfGuesses = 0;

        System.out.println("Try to guess the random number between 0-100 i'm thinking of.");

            Scanner scan = new Scanner(System.in);
        try{
            int input = scan.nextInt();
            do {
                if (input < randomGuessingNumber) {
                    numOfGuesses += 1;
                    System.out.println(tooSmall);
                    System.out.println("Number of guess: " + numOfGuesses);
                    System.out.println("You guessed " + input + ". Try again.");
                    input = scan.nextInt();

                } else if (input > randomGuessingNumber) {
                    numOfGuesses += 1;
                    System.out.println(tooLarge);
                    System.out.println("Number of guesses: " + numOfGuesses);
                    System.out.println("You guessed " + input + ". Try again.");
                    input = scan.nextInt();
                }
            } while (input != randomGuessingNumber);

            numOfGuesses += 1;
            System.out.println("You guessed " + input + ". You did it!");
            System.out.println("Number of guesses: " + numOfGuesses);

        } catch (InputMismatchException e){
            System.out.println("You have to enter a number! Try again.");
        }


    }

    public static void main(String[] args) {
        Main.guessTheseNumbers();
    }

}
