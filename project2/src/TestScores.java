import java.util.Random;
import java.util.Scanner;
public class TestScores {
    public static char getLetterGrade(int testScore){
        char letterGrade;
        if (testScore > 89)
            letterGrade = 'A';
        else if (testScore > 79)
            letterGrade = 'B';
        else if (testScore > 69)
            letterGrade = 'C';
        else if (testScore > 59)
            letterGrade = 'D';
        else
            letterGrade = 'F';
        return letterGrade;
    }
    public static void printGrades(int [] array1, char [] array2){
        System.out.println("Score\tGrade");
        for (int i = 0; i < array1.length; i++){
            System.out.println(" "+array1[i] +"\t\t  " + array2[i]);
        }
    }
    public static void printHighestScore(int [] array1){
        int highScore = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] > highScore)
                highScore = array1[i];
        }
        System.out.println("The highest score is: "+ highScore);
    }
    public static void printLowestScore(int [] array1){
        int lowScore = array1[0];
        for (int i = 0; i < array1.length; i++){
            if (array1[i] < lowScore)
                lowScore = array1[i];
        }
        System.out.println("The lowest score is: "+ lowScore);
    }
    public static void printAverageScore(int [] array1){
        double averageScore = 0;
        for (int i = 0; i < array1.length; i++) {
            averageScore = averageScore + array1[i];
        }
        averageScore = averageScore/array1.length;
        System.out.printf("\nThe average score is: %.2f",averageScore);
    }
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        final int randConstant = rand.nextInt(3,10);
        int i;
        int [] testScoresArray = new int[randConstant];
        char [] letterGradesArray = new char[randConstant];
        System.out.println("Enter your " + randConstant +" test scores below.");
        for (i = 1; i <= randConstant; i++) {
            System.out.println("Enter test " + i + " score: ");
            testScoresArray[i-1] = scanner.nextInt();
        }
        for (i = 0; i < randConstant; i++){
            letterGradesArray[i] = getLetterGrade(testScoresArray[i]);
        }
        printGrades(testScoresArray,letterGradesArray);
        printHighestScore(testScoresArray);
        printLowestScore(testScoresArray);
        printAverageScore(testScoresArray);
        scanner.close();
    }
}