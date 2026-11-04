# Lab 11 — Login Form Using Java Swing GUI

This practical follows the GUI lab manual:

## Included screens

- **LoginForm:** username and password fields, Login button, Create Account button and heading.
- **WelcomeForm:** displays `Welcome, <username>!` and has a Logout button that returns to LoginForm.
- **RegistrationForm:** includes JLabel/JTextField/JPasswordField/JButton components, colour-free clean layout, event handling, non-empty field checks, basic email format check and password confirmation.

## Demo login credentials
The manual specifies username `student` and password `12345`. These are hard-coded demonstration credentials only. Do not reuse them as real account credentials or treat this as secure authentication.

## Run in NetBeans
1. Create a Java Application project named `LoginFormProject`.
2. Under Source Packages, create package `ooplab11gui`.
3. Add the three Java classes from `src/ooplab11gui/` to that package.
4. Set `ooplab11gui.LoginForm` as the main class, or run LoginForm directly.
5. Run the project. Use `student` / `12345` to open WelcomeForm. Click Logout to return. Click Create Account to open RegistrationForm.

## Important note about NetBeans GUI Builder
The manual asks students to use NetBeans GUI Builder (drag-and-drop) and create JFrame Forms. The supplied implementation builds the same Swing components in Java source code, so it compiles and runs without generated `.form` files. If the instructor specifically checks GUI Builder usage, recreate the components in NetBeans Design view using the manual's variable names (`lblHeading`, `txtUsername`, `txtPassword`, `btnLogin`, `lblWelcome`, `btnLogout`) and let NetBeans generate the matching `.form` files. The provided event logic can be adapted to the generated actionPerformed methods.

## Limitations
This is an educational front-end demonstration. Registration data is not saved, there is no database, and login credentials are not stored securely.
