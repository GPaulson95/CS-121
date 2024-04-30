import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String name = scnr.nextLine();
        System.out.println("Enter an age: ");
        int age = scnr.nextInt();
        scnr.nextLine();
        System.out.println("Enter a city: ");
        String city = scnr.nextLine();
        System.out.println("Enter a college: ");
        String college = scnr.nextLine();
        System.out.println("Enter a major: ");
        String major = scnr.nextLine();
        System.out.println("Enter a type of animal: ");
        String animalType = scnr.nextLine();
        System.out.println("Enter a pet's name: ");
        String petName = scnr.nextLine();
        System.out.printf("There once was a person named %s at the age of %s\n" +
                        " %s went to college at %s. %s graduated with a major in %s." +
                        " Then, name adopted a(n) %s named %s. They both lived happily ever after!"+
                name,age,name,city,name,college,major,animalType,petName);
    }
}