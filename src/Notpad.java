import javax.swing.*;

public class Notpad {
    private JButton newOpenButton;
    private JPanel panel;
    private JTextArea textArea;
    private JButton sparaButton1;
    private JButton clearButton;
    private JButton menuButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Notpad");
        frame.setContentPane(new Notpad().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
