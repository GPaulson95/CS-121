import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final int NUM_ELEMENTS = 7;
        int[] averageMiles = new int[NUM_ELEMENTS];
        int i;
        int numMatches;

        for (i = 0; i < averageMiles.length; ++i) {
            averageMiles[i] = scnr.nextInt();
        }
        numMatches = 0;
        for (int j = 0; j < averageMiles.length; j++){
            if ((averageMiles[j] % 10)==2)
                numMatches++;
        }

        System.out.println("Number of 2s in array: " + numMatches);
    }
}