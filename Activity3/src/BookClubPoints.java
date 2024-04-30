import javax.swing.JOptionPane;
public class BookClubPoints {
    public static void main(String[] args) {
        //declare variables
        int booksPurchased, points;
        booksPurchased = Integer.parseInt(JOptionPane.showInputDialog("Enter in the number of books purchased:"));
        if (booksPurchased == 0) {
            points = 0;
        } else if (booksPurchased == 1) {
            points = 5;
        } else if (booksPurchased >= 4) {
            points = 60;
        } else {
            points = -1;
        }
        String output = String.format("The books purchased %d\nThe points earned %d", booksPurchased, points);
        JOptionPane.showMessageDialog(null,output);
    }
}