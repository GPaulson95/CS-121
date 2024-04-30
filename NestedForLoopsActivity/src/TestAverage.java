import java.util.Scanner;
public class TestAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter in the number of students");
        int students = scanner.nextInt();
        System.out.println("Enter in the number of test scores per student");
        int numberOfTestScores = scanner.nextInt();
        for (int i = 1; i <= students; i++) {
            int totalScore = 0;
            System.out.println("\nStudent Number: "+i);
            System.out.println("----------------");
            for (int j = 1; j <= numberOfTestScores; j++){
                System.out.print("Enter in score "+j+" :");
                int testScore = scanner.nextInt();
                totalScore += testScore;
            }
            double averageScore = (double)totalScore/numberOfTestScores;
            System.out.printf("The average score for student "+i+" is  %.2f" ,averageScore);
            }
        }
    }
