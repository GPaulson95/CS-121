import java.util.Scanner;
import java.util.Random;
public class CharacterBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int p1WinCounter = 0;
        int p2WinCounter = 0;
        System.out.println("Please enter an odd number of rounds: ");
        int rounds = Integer.parseInt(scanner.nextLine());
        //**EXTRA CREDIT** Requires user to input an odd number of rounds
        while (rounds % 2 == 0) {
            System.out.println("The number of rounds must be odd. Please enter an odd number of rounds: ");
            rounds = Integer.parseInt(scanner.nextLine());
        }
        //player 1 inputs
        System.out.println("Player 1: Enter your character's name: ");
        String p1Name = scanner.nextLine();
        System.out.println("Player 1: Enter your character's hitpoints (1-255): ");
        int p1Hitpoints = Integer.parseInt(scanner.nextLine());
        System.out.println("Player 1: Enter the name of the move your character uses: ");
        String p1Move = scanner.nextLine();
        System.out.println("Player 1: Enter your character's power level (5-190): ");
        int p1Power = Integer.parseInt(scanner.nextLine());
        System.out.println("Player 1: Enter your character's speed (5-200): ");
        int p1Speed = Integer.parseInt(scanner.nextLine());

        //player 2 inputs
        System.out.println("Player 2: Enter your character's name: ");
        String p2Name = scanner.nextLine();
        System.out.println("Player 2: Enter your character's hitpoints (1-255): ");
        int p2Hitpoints = Integer.parseInt(scanner.nextLine());
        System.out.println("Player 2: Enter the name of the move your character uses: ");
        String p2Move = scanner.nextLine();
        System.out.println("Player 2: Enter your character's power level (5-190): ");
        int p2Power = Integer.parseInt(scanner.nextLine());
        System.out.println("Player 2: Enter your character's speed (5-200): ");
        int p2Speed = Integer.parseInt(scanner.nextLine());
        //If the speed values are equal, one player's speed is set to 1, and their opponent, 0, at random
        if (p1Speed == p2Speed){
            int randomSpeed = random.nextInt(1);
            System.out.printf("\n%s and %s have equal speed. The first strike will be chosen at random.",p1Name,p2Name);
            if (randomSpeed == 1) {
                p1Speed = 1;
                p2Speed = 0;
            }
            else {
                p1Speed = 0;
                p2Speed = 1;
                }
            }
        //looped battle up to the number of rounds chosen
        for (int i = 1; i <= rounds; i++) {
            System.out.println("\n***Round " + i + "***");
            //create a variable that holds hitpoints
            int p1HP = p1Hitpoints;
            int p2HP = p2Hitpoints;
            //Whoever has higher speed will attack first every round.
            if (p2Speed > p1Speed) {
                System.out.println(p2Name + " will strike first");
                while ((p1HP > 0) && (p2HP > 0)) {
                    p1HP -= p2Power;
                    //check after every strike if a player's HP reaches 0
                    if (p1HP <= 0) {
                        System.out.printf("\n%s 1 wins round %d",p2Name,i);
                        p2WinCounter++;
                    }
                    p2HP -= p1Power;
                    if (p2HP <= 0) {
                        System.out.printf("\n%s 1 wins round %d",p1Name,i);
                        p1WinCounter++;
                    }
                }
            }
            else if (p1Speed > p2Speed) {
                System.out.println(p1Name + " will strike first");
                while ((p1HP > 0) && (p2HP > 0)) {
                    p1HP -= p2Power;
                    if (p1HP <= 0) {
                        System.out.printf("\n%s 1 wins round %d",p2Name,i);
                        p2WinCounter++;
                    }
                    p2HP -= p1Power;
                    if (p2HP <= 0) {
                        System.out.printf("\n%s 1 wins round %d",p1Name,i);
                        p1WinCounter++;
                    }
                }
            }
        }
        System.out.println("\n*******GAME OVER*******");
        System.out.println("Player 1 won: " +p1WinCounter + " round(s). Player 2 won: " + p2WinCounter + " round(s).");
        if (p1WinCounter > p2WinCounter) {
            System.out.println("Player 1 Wins!");
        }
        else
            System.out.println("Player 2 Wins!");
    }
}