import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class API {
    private JButton button1;
    private JLabel label;
    private JPanel mainPanel;

    public API() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Again Hello World");
                JOptionPane.showMessageDialog(null, "Hello World!");
            }
        });
    }

    public static void main(String[] args){
        JFrame frame = new JFrame("App");
        frame.setContentPane(new API().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.pack();
        frame.setVisible(true);

    }

}
