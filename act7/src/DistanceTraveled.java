import java.util.Scanner;
public class DistanceTraveled {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter the speed in MPH: ");
        int speed = scnr.nextInt();
        System.out.println("Enter the number of hours spent traveling: ");
        int time = scnr.nextInt();
        System.out.println("Hour    Distance Traveled");
        System.out.println("--------------------------");
        for (int i =1; i<=time;i++) {
            int distance = speed*i;
            System.out.println(i + "       " + distance);

        }
    }

}