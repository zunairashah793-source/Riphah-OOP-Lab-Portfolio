package ooplab11gui;

import javax.swing.*;
import java.awt.*;

public class RegistrationForm extends JFrame {
    private final JTextField txtName;
    private final JTextField txtUsername;
    private final JTextField txtEmail;
    private final JPasswordField txtPassword;
    private final JPasswordField txtConfirmPassword;

    public RegistrationForm() {
        setTitle("Student Registration Form");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(480, 390);
        setLocationRelativeTo(null);

        JLabel heading = new JLabel("Student Registration", SwingConstants.CENTER);
        heading.setFont(new Font("SansSerif", Font.BOLD, 22));
        txtName = new JTextField(18);
        txtUsername = new JTextField(18);
        txtEmail = new JTextField(18);
        txtPassword = new JPasswordField(18);
        txtConfirmPassword = new JPasswordField(18);
        JButton btnRegister = new JButton("Register");
        JButton btnClear = new JButton("Clear");

        JPanel fields = new JPanel(new GridLayout(5, 2, 10, 12));
        fields.add(new JLabel("Full name:")); fields.add(txtName);
        fields.add(new JLabel("Username:")); fields.add(txtUsername);
        fields.add(new JLabel("Email:")); fields.add(txtEmail);
        fields.add(new JLabel("Password:")); fields.add(txtPassword);
        fields.add(new JLabel("Confirm password:")); fields.add(txtConfirmPassword);

        btnRegister.addActionListener(event -> register());
        btnClear.addActionListener(event -> clearFields());
        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 0));
        buttons.add(btnRegister); buttons.add(btnClear);

        JPanel panel = new JPanel(new BorderLayout(12, 18));
        panel.setBorder(BorderFactory.createEmptyBorder(22, 26, 22, 26));
        panel.add(heading, BorderLayout.NORTH);
        panel.add(fields, BorderLayout.CENTER);
        panel.add(buttons, BorderLayout.SOUTH);
        add(panel);
    }

    private void register() {
        String name = txtName.getText().trim();
        String username = txtUsername.getText().trim();
        String email = txtEmail.getText().trim();
        String password = new String(txtPassword.getPassword());
        String confirm = new String(txtConfirmPassword.getPassword());

        if (name.isEmpty() || username.isEmpty() || email.isEmpty()
                || password.isEmpty() || confirm.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please complete every field.",
                    "Missing Information", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (!email.contains("@") || !email.contains(".")) {
            JOptionPane.showMessageDialog(this, "Please enter a valid email address.",
                    "Invalid Email", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (!password.equals(confirm)) {
            JOptionPane.showMessageDialog(this, "Passwords do not match.",
                    "Registration Failed", JOptionPane.ERROR_MESSAGE);
            return;
        }

        JOptionPane.showMessageDialog(this,
                "Registration details accepted for " + name + ".\nThis academic demo does not save data.",
                "Registration Successful", JOptionPane.INFORMATION_MESSAGE);
        dispose();
    }

    private void clearFields() {
        txtName.setText("");
        txtUsername.setText("");
        txtEmail.setText("");
        txtPassword.setText("");
        txtConfirmPassword.setText("");
    }
}
