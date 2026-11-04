package ooplab11gui;

import javax.swing.*;
import java.awt.*;

public class WelcomeForm extends JFrame {
    public WelcomeForm(String username) {
        setTitle("Welcome Screen");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(420, 230);
        setLocationRelativeTo(null);

        JLabel welcome = new JLabel("Welcome, " + username + "!", SwingConstants.CENTER);
        welcome.setFont(new Font("SansSerif", Font.BOLD, 22));
        JButton logoutButton = new JButton("Logout");
        logoutButton.addActionListener(event -> {
            new LoginForm().setVisible(true);
            dispose();
        });

        JPanel panel = new JPanel(new BorderLayout(12, 12));
        panel.setBorder(BorderFactory.createEmptyBorder(30, 25, 30, 25));
        panel.add(welcome, BorderLayout.CENTER);
        panel.add(logoutButton, BorderLayout.SOUTH);
        add(panel);
    }
}
