package battle01;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class battle01 {
    private JButton button_01;
    private JPanel panelmain;

    public battle01() {
        button_01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Hello World");
            }
        });
    }

    public static void main(String[] args) {
        JFrame flame = new JFrame("battle01");
        flame.setContentPane(new battle01().panelmain);
        flame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        flame.pack();
        flame.setVisible(true);
    }
}
