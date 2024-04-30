import java.util.Scanner;
public class CFTable {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int celsius = 0;
        //String[] array = {"text1", "text2", "text3,text4", "text5"};
        //for (int i = 0; i < array.length; i++) {
          //  System.out.printf("i == %d\n%s", i, array[i]);
        System.out.println("Celsius       Fahrenheit");
        System.out.println("************************");
        for (celsius = 0; celsius <= 20; celsius++){
            double fahrenheit = (((9/5) * 5) * celsius) + 32;
            System.out.print(celsius+"             ");
            System.out.print(fahrenheit);
            // Formula F=9/5C + 32
            System.out.println();
        }
    }
}