import java.util.Scanner;

class Student {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age. Age cannot be negative.");
        }
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}

public class StudentInformation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Enter student name: ");
        String enteredName = input.nextLine();
        student.setName(enteredName);

        int enteredAge;
        while (true) {
            System.out.print("Enter student age: ");
            if (input.hasNextInt()) {
                enteredAge = input.nextInt();
                if (enteredAge >= 0) {
                    student.setAge(enteredAge);
                    break;
                }
                System.out.println("Age cannot be negative. Try again.");
            } else {
                System.out.println("Please enter a whole number for age.");
                input.next();
            }
        }

        System.out.println("\n--- Student Information ---");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());

        input.close();
    }
}
