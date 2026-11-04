# Lab 03 — Variables, Input/Output, `this`, Getters & Setters

**Course:** Object-Oriented Programming Lab  
**Language:** Java  
**IDE:** NetBeans (also compatible with command-line `javac`)

## Overview

This lab practises keyboard input and output, instance variables, static variables, local variables, the `this` keyword, getters, setters, and encapsulation.

## Practical Tasks

### Task 1 — Student Information
- Creates a `Student` class with private `name` and `age` instance variables.
- Uses `setName()`, `setAge()`, `getName()`, and `getAge()`.
- Uses `this` in setters.
- Reads the student's name and age using `Scanner` in `main()`.

### Task 2 — Product Counter
- Creates a `Product` class with private `name`, `price`, and `quantity`.
- Uses a static `totalProducts` variable shared by all Product objects.
- Creates two Product objects and displays their details and the class-wide product count.

### Task 3 — Bank Account
- Creates a `BankAccount` class with private account holder, account number, and balance.
- Uses getters and setters, including validation that prevents a negative balance.
- Uses static `totalAccounts` and displays it through the class name.

## Concepts Demonstrated

| Concept | Use in this lab |
|---|---|
| `Scanner` | Reads values from keyboard input |
| Instance variable | Each object stores its own values |
| Static variable | One shared count belongs to the class |
| Local variable | Temporary values declared inside methods |
| `this` | Refers to the current object |
| Getter | Returns a private field's value |
| Setter | Changes a private field with validation |
| Encapsulation | Keeps fields private and controls access through methods |

## Folder Structure

```text
Lab-03-Variables-InputOutput-This-Getters-Setters/
├── README.md
├── Task-01-Student-Information/
│   └── StudentInformation.java
├── Task-02-Product-Counter/
│   └── ProductCounter.java
├── Task-03-Bank-Account/
│   └── BankAccountManagement.java
└── Expected-Outputs/
```

## How to Run in NetBeans

Each practical is an independent Java program with its own `main()` method.

1. Open NetBeans.
2. Select **File → New Project → Java Application**.
3. Create a separate project for the task you want to run.
4. Create or use the matching public class name shown in the source file.
5. Paste the complete source code into that class file.
6. Run the project using **Run Project**.

The source files can also be compiled from a terminal:

```bash
javac StudentInformation.java
java StudentInformation
```

Use the matching filename and class name for each task.

## Input Validation

- Student age cannot be negative.
- Product price and quantity cannot be negative.
- Bank account balance cannot be negative.
- Invalid numeric input is rejected and requested again where applicable.

## Notes

- The product and account counters are static class variables.
- Each task is intentionally kept as a separate program so it can be run and assessed independently.
- This is an academic console-based exercise; it does not connect to a real bank or product database.
