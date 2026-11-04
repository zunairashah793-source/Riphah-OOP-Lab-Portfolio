# Lab 02 — Classes, Objects and Constructors (C++)

This folder contains the three practical tasks from Lab 2 of the Riphah International University Object-Oriented Programming laboratory manual.

## Topics covered

- Classes and objects
- Private data members and public member functions
- Default constructors
- Parameterized constructors
- Arrays of objects
- Member functions
- Basic input validation

## Practical tasks

### Task 1 — Employee Records
File: `Task-01-Employee-Records/EmployeeRecords.cpp`

Creates an `Employee` class with private `name`, `employeeID`, and `salary` members. It demonstrates both a default constructor and a parameterized constructor. It also demonstrates the manual's salary-increase extension.

### Task 2 — Student Result System
File: `Task-02-Student-Result-System/StudentResultSystem.cpp`

Creates a `Student` class with private `name`, `rollNo`, and marks for three subjects. It uses a parameterized constructor and an array of three Student objects. Separate member functions calculate total, average, and grade.

Grade scale used in this implementation: A = 90–100, B = 80–89.99, C = 70–79.99, D = 60–69.99, F = below 60. The manual asks for a grade based on average but does not prescribe exact grade boundaries.

### Task 3 — Bank Account Management System
File: `Task-03-Bank-Account-Management/BankAccountManagement.cpp`

Creates an `Account` class with private account-holder name, account number, and balance. It demonstrates default and parameterized constructors, three account objects, deposit, withdrawal, and account display methods.

## How to compile and run

A C++11-compatible compiler is sufficient. With g++:

```bash
g++ -std=c++11 -Wall -Wextra -pedantic EmployeeRecords.cpp -o EmployeeRecords
./EmployeeRecords
```

Use the corresponding source filename and executable name for the other two tasks. On Windows, run the resulting `.exe` file or use the Run option in your C++ IDE.

Each `.cpp` file is a separate program and has its own `main()` function. Compile and run them separately.

## Notes

- The programs use sample data where the task focuses on constructors and object creation.
- The Student Result System accepts user input and validates marks from 0 to 100.
- The Bank Account program uses sample accounts and demonstrates a successful deposit, a successful withdrawal, and an insufficient-balance case.
- These are academic console programs. They do not connect to a real banking system or store data permanently.

## Expected output

Sample console output from the tested runs is included in the `Expected-Outputs/` folder. The Student Result System was also tested with an out-of-range mark (120); it rejected the value and prompted again.
