import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        int length = scanner.nextInt();
        System.out.println("Enter the Width of the rectangle: ");
        int width = scanner.nextInt();
        int area = length * width;
        int perimeter = (2 * length) + (2 * width);
        System.out.println("The area of the rectangle is: " + area);
        System.out.println("The perimeter of the rectangle is "+ perimeter);
        }
    }