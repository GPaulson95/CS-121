import javax.swing.JOptionPane;
public class Login {
    public static void main(String[] args) {
        String username = "anything99";
        String password = "password123";
        String name = JOptionPane.showInputDialog("Please enter your username: ");
        String pw = JOptionPane.showInputDialog("Please enter your password: ");
        if (name.equals(username) && pw.equals(password)) {
            JOptionPane.showMessageDialog(null, "Welcome to CS 121");
        } else if (name.equals(username)) {
            JOptionPane.showMessageDialog(null, "The password is incorrect");
        } else if (pw.equals(password)) {
            {
                JOptionPane.showMessageDialog(null, "The username is incorrect");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Both the username and password are incorrect");
        }
    }
}




