import javax.swing.JOptionPane;
public class TestScores {
    public static void main(String[] args) {
        int score1, score2, score3;
        char letterGrade;
            score1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the score for test 1"));
        score2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the score for test 2"));
        score3 = Integer.parseInt(JOptionPane.showInputDialog("Enter the score for test 3"));
        int averageScore = ((score1 + score2 + score3) / 3);
        if (averageScore >= 90) {
            letterGrade = 'A';
        } else if (averageScore >= 80) {
            letterGrade = 'B';
        } else if (averageScore >= 70) {
            letterGrade = 'C';
        } else if (averageScore >= 60) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }
        String output = String.format("Your average score:%d\nYour grade: %c", averageScore,letterGrade);
        JOptionPane.showMessageDialog(null, output);
    }
}


