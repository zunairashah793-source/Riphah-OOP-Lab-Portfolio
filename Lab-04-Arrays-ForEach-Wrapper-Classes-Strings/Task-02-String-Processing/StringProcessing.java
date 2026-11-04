import java.util.Scanner;

public class StringProcessing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter student's name: ");
        String name = input.nextLine().trim();

        if (name.isEmpty()) {
            System.out.println("Name cannot be empty.");
            input.close();
            return;
        }

        System.out.println("Original name: " + name);
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());
        System.out.println("Number of characters: " + name.length());
        System.out.println("First character: " + name.charAt(0));
        // Lowercase conversion makes this check case-insensitive.
        System.out.println("Contains letter 'a': " + name.toLowerCase().contains("a"));
        input.close();
    }
}
