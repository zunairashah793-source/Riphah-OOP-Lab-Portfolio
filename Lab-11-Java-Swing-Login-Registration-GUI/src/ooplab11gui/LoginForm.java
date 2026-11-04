package ooplab11gui;

import javax.swing.*;
import java.awt.*;

public class LoginForm extends JFrame {
    private final JTextField txtUsername;
    private final JPasswordField txtPassword;

    public LoginForm() {
        setTitle("Login Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(440, 280);
        setLocationRelativeTo(null);

        JLabel heading = new JLabel("Student Login", SwingConstants.CENTER);
        heading.setFont(new Font("SansSerif", Font.BOLD, 24));
        JLabel lblUsername = new JLabel("Username:");
        JLabel lblPassword = new JLabel("Password:");
        txtUsername = new JTextField(18);
        txtPassword = new JPasswordField(18);
        JButton btnLogin = new JButton("Login");
        JButton btnRegister = new JButton("Create Account");

        btnLogin.addActionListener(event -> login());
        btnRegister.addActionListener(event -> new RegistrationForm().setVisible(true));

        JPanel fields = new JPanel(new GridLayout(2, 2, 10, 12));
        fields.add(lblUsername); fields.add(txtUsername);
        fields.add(lblPassword); fields.add(txtPassword);

        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 0));
        buttons.add(btnLogin); buttons.add(btnRegister);

        JPanel panel = new JPanel(new BorderLayout(12, 18));
        panel.setBorder(BorderFactory.createEmptyBorder(24, 28, 24, 28));
        panel.add(heading, BorderLayout.NORTH);
        panel.add(fields, BorderLayout.CENTER);
        panel.add(buttons, BorderLayout.SOUTH);
        add(panel);
    }

    private void login() {
        String username = txtUsername.getText().trim();
        String password = new String(txtPassword.getPassword());

        // Demo credentials exactly as specified in the lab manual.
        if (username.equals("student") && password.equals("12345")) {
            new WelcomeForm(username).setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(this,
                    "Invalid username or password!", "Login Failed",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LoginForm().setVisible(true));
    }
}
