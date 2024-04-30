import java.util.Scanner;
import java.util.Random;
public class ESP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numCorrect = 0;
        String computerColor = "";
        System.out.println("Try to guess the color that the computer has chosen. (red, green, blue, orange, or yellow");
        for (int i = 1; i <= 10; i++) {
            int randomNumber = random.nextInt(5);
            System.out.println("\n"+ i + ". What color has the computer chosen?");
            String guessedColor = scanner.nextLine().toLowerCase();
            computerColor = switch (randomNumber) {
                case 0 -> "red";
                case 1 -> "green";
                case 2 -> "blue";
                case 3 -> "orange";
                case 4 -> "yellow";
                default -> computerColor;
            };
            System.out.printf("The computer chose %s", computerColor);
            if (computerColor.equals(guessedColor)) {
                numCorrect++;
            }
        }
        System.out.println("\nYou got " + numCorrect + " out of 10 correct.");
    }
}