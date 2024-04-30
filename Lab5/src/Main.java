import java.util.Scanner;
public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double length, width, area;
        //double num;

        length = getLength();
        width = getWidth();
        area = getArea(length,width);
        display(length, width, area);


        scanner.close();

    }
    static double getLength(){
        System.out.print("Enter the rectangle's length: ");
        double length = scanner.nextDouble();
        return  length;

    }
    static double getWidth(){
        System.out.print("Enter the rectangle's width: ");
        double width = scanner.nextDouble();
        return width;
    }

    static double getArea(double length, double width){
        double area = (length * width);
        return area;

    }
    static void display(double length, double width, double area){
        System.out.println("Rectangle length " + length);
        System.out.println("rectangle width " + width);
        System.out.println("rectangle Area " + area);
    }

}