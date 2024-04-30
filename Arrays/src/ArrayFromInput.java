import java.util.Scanner;
public class ArrayFromInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] schoolName = new String [3];
        String[] major = new String [3];
        double[] GPA = new double[3];

        for (int i = 0; i<schoolName.length; i++) {
            System.out.println("Enter in your school's name: ");
            schoolName[i] = scanner.nextLine();
            System.out.println("Enter your Major: ");
            major[i] = scanner.nextLine();
            System.out.println("Enter your GPA: ");
            GPA[i] = Double.parseDouble(scanner.nextLine());
            System.out.println();
        }
        System.out.printf("%-14s %-10s %s\n", "Name","Major","GPA");

        for (int i = 0; i < schoolName.length; i++){
            System.out.printf("%-14s %-10s %.2f\n",schoolName[i],major[i], GPA[i]);
        }
        scanner.close();
    }
}