import java.util.Scanner;
public class GCDTest {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int n1 = scnr.nextInt();
        System.out.println("Enter the second number:");
        int n2 = scnr.nextInt();
        GCD gcd = new GCD(n1, n2);

        System.out.printf("For Loop GCD: %d\n",gcd.findGCDLoop(n1,n2));
        System.out.printf("While Loop GCD %d\n",gcd.findGCDWhileLoop(n1,n2));
        System.out.printf("Recursive Loop GCD %d\n",gcd.findGCDRecursively(n1,n2));

        System.out.println("Optional Bonus");
        System.out.println("Enter a positive number: ");
        n1 = scnr.nextInt();
        System.out.println("Enter a negative number: ");
        n2 = scnr.nextInt();
        System.out.printf("Negative GCD: %d\n",gcd.findGCDNegative(n1,n2));




    }
}
