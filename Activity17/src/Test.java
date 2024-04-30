import weekSeven.packageDemo.Art;
import weekSeven.packageDemo.Students;

public class Test {
    public static void main(String[] args) {
        Students S1 = new Students("Garrett", 28, "Muncie", "BSU");
        Art A1 = new Art("Starry Night", "Vincent Van Gogh", 7, "The Museum of Modern weekSeven.packageDemo.Art");
        S1.printStudents();
        A1.printArt();
    }
}