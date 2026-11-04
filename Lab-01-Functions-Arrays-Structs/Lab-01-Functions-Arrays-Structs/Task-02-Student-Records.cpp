#include <iostream>
#include <limits>
#include <string>
using namespace std;

const int STUDENT_COUNT = 3;

struct Student {
    string name;
    int rollNumber;
    float marks;
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

float readMarks(const string& prompt) {
    float value;
    while (true) {
        cout << prompt;
        if (cin >> value && value >= 0.0f && value <= 100.0f) {
            return value;
        }
        cout << "Invalid marks. Enter a number from 0 to 100.\n";
        cin.clear();
        cin.ignore(numeric_limits<streamsize>::max(), '\n');
    }
}

int main() {
    Student students[STUDENT_COUNT];

    for (int i = 0; i < STUDENT_COUNT; i++) {
        cout << "\nEnter details for student " << i + 1 << '\n';
        cout << "Name: ";
        getline(cin, students[i].name);
        while (students[i].name.empty()) {
            cout << "Name cannot be empty. Enter name: ";
            getline(cin, students[i].name);
        }
        students[i].rollNumber = readInteger("Roll number: ");
        students[i].marks = readMarks("Marks (0-100): ");
        cin.ignore(numeric_limits<streamsize>::max(), '\n');
    }

    cout << "\n========== STUDENT RECORDS ==========\n";
    for (int i = 0; i < STUDENT_COUNT; i++) {
        cout << "Student " << i + 1 << '\n'
             << "Name: " << students[i].name << '\n'
             << "Roll Number: " << students[i].rollNumber << '\n'
             << "Marks: " << students[i].marks << "\n\n";
    }

    return 0;
}
