import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.channels.AcceptPendingException;

public class Notpad {
    private JButton newOpenButton;
    private JPanel panel;
    private JTextArea textArea;
    private JButton save;
    private JButton copy;
    private JButton menu;

    public Notpad() {
        copy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textArea.append( textArea.getSelectedText());

            }
        });
    }

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
