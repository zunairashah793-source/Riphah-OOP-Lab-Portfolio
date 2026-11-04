import java.util.Scanner;

public class CharacterClassification {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String token;
        while (true) {
            System.out.print("Enter a single character: ");
            token = input.next();
            if (token.length() == 1) break;
            System.out.println("Please enter exactly one character.");
        }

        char character = token.charAt(0);
        int unicodeValue = (int) character;

        System.out.println("Entered character: " + character);
        System.out.println("Integer/Unicode value: " + unicodeValue);

        if (Character.isDigit(character)) {
            System.out.println("Classification: Digit");
        } else if (Character.isUpperCase(character)) {
            System.out.println("Classification: Uppercase letter");
        } else if (Character.isLowerCase(character)) {
            System.out.println("Classification: Lowercase letter");
        } else {
            System.out.println("Classification: Special character or whitespace");
        }
        input.close();
    }
}
