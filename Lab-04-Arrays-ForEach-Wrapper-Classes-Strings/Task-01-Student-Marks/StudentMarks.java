import java.util.ArrayList;
import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> marks = new ArrayList<>();

        System.out.println("Enter marks for five students (0-100):");
        for (int i = 1; i <= 5; i++) {
            int mark;
            while (true) {
                System.out.print("Student " + i + ": ");
                if (input.hasNextInt()) {
                    mark = input.nextInt();
                    if (mark >= 0 && mark <= 100) break;
                    System.out.println("Marks must be between 0 and 100.");
                } else {
                    System.out.println("Please enter a whole number.");
                    input.next();
                }
            }
            marks.add(mark); // Integer wrapper object is used in ArrayList.
        }

        int total = 0;
        int highest = marks.get(0);
        System.out.println("\nStudent marks:");
        for (int mark : marks) { // Enhanced for loop visits every mark.
            System.out.println(mark);
            total += mark;
            if (mark > highest) highest = mark;
        }

        double average = (double) total / marks.size();
        System.out.println("Total marks: " + total);
        System.out.printf("Average marks: %.2f%n", average);
        System.out.println("Highest mark: " + highest);
        input.close();
    }
}
