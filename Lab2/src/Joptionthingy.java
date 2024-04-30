import javax.swing.JOptionPane;
public class Joptionthingy {
    public static void main(String[] args) {
        int length = Integer.parseInt(JOptionPane.showInputDialog("Enter the length of the rectangle: "));
        int width = Integer.parseInt(JOptionPane.showInputDialog("Enter the width of the rectangle: "));
        int area = length * width;
        int perimeter = (2 * length) + (2 * width);
        JOptionPane.showMessageDialog(null,"The area of the rectangle is: " + area);
        JOptionPane.showMessageDialog(null,"The perimeter of the rectangle is: " + perimeter);
    }
}