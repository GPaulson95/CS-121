import java.util.Scanner;
import java.util.Random;
public class GuessingGame {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Random rand = new Random();
        int counter = 0;
        int randInt = rand.nextInt(100);
        //System.out.println(randInt);
        System.out.println("Guess a number between 1 and 100, or enter 'q' if you give up.");
        String guess = scnr.nextLine();
        //String quit = scnr.nextLine();
        while (guess !  randInt) {
            counter++;
            if (guess > randInt) {
                System.out.println("Too high, guess again.");
                guess = scnr.nextInt();
            } else {
                System.out.println("Too low, guess again.");
                guess = scnr.nextInt();
            }
        System.out.println("Quitter, the number was: "+randInt);
        }
        System.out.println("Correct!");
        System.out.println("Number of guesses: " + counter);
    }
}
