import javax.swing.*;
import java.awt.*;

public class Screen extends JFrame{
    public Screen() {
        setTitle("Escola Name");
        setVisible(true);
        setSize(640, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        setLayout(null);
        JButton jButton = new JButton("Salvar");
        add(jButton);
        jButton.setBounds(50, 100, 125, 35);
        jButton.setFont(new Font("Arial", Font.BOLD, 20));
        jButton.setForeground(new Color(83, 137, 255));
        jButton.setBackground(new Color(255, 255, 255));
    }
}