#include <iostream>
#include <iomanip>
#include <string>
#include <limits>

using namespace std;

class Student {
private:
    string name;
    int rollNo;
    double marks[3];

public:
    // Default constructor allows an array of Student objects to be created.
    Student() {
        name = "Not assigned";
        rollNo = 0;
        for (int i = 0; i < 3; i++) {
            marks[i] = 0.0;
        }
    }

    // Parameterized constructor initializes all student information.
    Student(string studentName, int studentRollNo,
            double subject1, double subject2, double subject3) {
        name = studentName;
        rollNo = studentRollNo;
        marks[0] = subject1;
        marks[1] = subject2;
        marks[2] = subject3;
    }

    double calculateTotal() const {
        return marks[0] + marks[1] + marks[2];
    }

    double calculateAverage() const {
        return calculateTotal() / 3.0;
    }

    char calculateGrade() const {
        double average = calculateAverage();

        if (average >= 90.0) return 'A';
        if (average >= 80.0) return 'B';
        if (average >= 70.0) return 'C';
        if (average >= 60.0) return 'D';
        return 'F';
    }

    void displayResult() const {
        cout << left << setw(20) << name
             << setw(12) << rollNo
             << right << setw(9) << fixed << setprecision(2) << marks[0]
             << setw(9) << marks[1]
             << setw(9) << marks[2]
             << setw(11) << calculateTotal()
             << setw(11) << calculateAverage()
             << setw(8) << calculateGrade() << '\n';
    }
};

int readInteger(const string& prompt) {
    int value;
    while (true) {
        cout << prompt;
        if (cin >> value) {
            return value;
        }

        cout << "Invalid input. Please enter a whole number.\n";
        cin.clear();
        cin.ignore(numeric_limits<streamsize>::max(), '\n');
    }
}

double readMarks(const string& prompt) {
    double value;
    while (true) {
        cout << prompt;
        if (cin >> value && value >= 0.0 && value <= 100.0) {
            return value;
        }

        cout << "Invalid marks. Enter a value between 0 and 100.\n";
        cin.clear();
        cin.ignore(numeric_limits<streamsize>::max(), '\n');
    }
}

int main() {
    const int STUDENT_COUNT = 3;
    Student students[STUDENT_COUNT];

    cout << "========== STUDENT RESULT SYSTEM =========\n";
    cout << "Enter details for " << STUDENT_COUNT << " students.\n\n";

    for (int i = 0; i < STUDENT_COUNT; i++) {
        string name;
        int rollNo;
        double subject1, subject2, subject3;

        cout << "Student " << i + 1 << '\n';
        cout << "Name: ";
        cin >> ws;
        getline(cin, name);

        rollNo = readInteger("Roll number: ");
        subject1 = readMarks("Marks in Subject 1 (0-100): ");
        subject2 = readMarks("Marks in Subject 2 (0-100): ");
        subject3 = readMarks("Marks in Subject 3 (0-100): ");

        // Assign an object created by the parameterized constructor.
        students[i] = Student(name, rollNo, subject1, subject2, subject3);
        cout << '\n';
    }

    cout << "\n================ STUDENT RESULTS ================\n";
    cout << left << setw(20) << "Name"
         << setw(12) << "Roll No."
         << right << setw(9) << "Sub 1"
         << setw(9) << "Sub 2"
         << setw(9) << "Sub 3"
         << setw(11) << "Total"
         << setw(11) << "Average"
         << setw(8) << "Grade" << '\n';
    cout << string(98, '-') << '\n';

    for (int i = 0; i < STUDENT_COUNT; i++) {
        students[i].displayResult();
    }

    cout << "\nGrade scale: A (90-100), B (80-89.99), C (70-79.99), "
         << "D (60-69.99), F (below 60).\n";

    return 0;
}
