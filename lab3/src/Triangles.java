import java.util.Scanner;
public class Triangles {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please enter side #1: ");
        int side1 = scnr.nextInt();
        System.out.println("Please enter side #2: ");
        int side2 = scnr.nextInt();
        System.out.println("Please enter side #3: ");
        int side3 = scnr.nextInt();
        if (side3 == side2 && side2 == side1) {
            System.out.println("This is an equilateral triangle, all sides are equal");
        } else if (side3 == side2 || side2 == side1 || side1 == side3) {
            System.out.println("This is an Isosceles triangle, two sides have the same length.");
        } else {
            System.out.println("This is a scalene triangle, all sides have different lengths");
        }
    }
}