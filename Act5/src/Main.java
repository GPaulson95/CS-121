import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please enter the name of a planet in our solar system: ");
        String planet = scnr.next();
        planet = planet.toLowerCase();
        switch (planet) {
            case "mercury":
                System.out.println("Mercury has a surface area of 28.88 million mi² and is 36.04 million miles from the Sun.");
                break;
            case "venus":
                System.out.println("Venus has a surface area of 177.7 million mi² and is 67.24 million miles from the Sun.");
                break;
            case "earth":
                System.out.println("Earth has a surface area of 196.9 million mi² and is 92.96 million miles from the Sun.");
                break;
            case "mars":
                System.out.println("Mars has a surface area of 55.74 million mi² and is 141.6 million miles from the Sun.");
                break;
            case "jupter":
                System.out.println("Jupiter has a surface area of 73.71 billion mi² and is 483.8 million miles from the Sun.");
                break;
            case "saturn":
                System.out.println("Saturn has a surface area of 16.49 billion mi² and is 890.8 million miles from the Sun.");
                break;
            case "uranus":
                System.out.println("Uranus has the surface area of 3.121 billion mi² and is 1.784 billion miles from the Sun.");
                break;
            case "neptune":
                System.out.println("Neptune has the surface area of 2.941 billion mi² and is 2.793 billion miles from the Sun.");
                break;
            default:
                System.out.println("Please enter a valid planet");
                break;
        }
    }
}