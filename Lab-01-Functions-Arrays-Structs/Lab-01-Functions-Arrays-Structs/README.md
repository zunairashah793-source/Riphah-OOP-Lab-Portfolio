# Lab 01 — Functions, Arrays and Structures

**Course:** Object-Oriented Programming Lab  
**University:** Riphah International University  
**Language:** C++

This lab revises the C++ fundamentals used before moving deeper into Object-Oriented Programming. It covers functions, arrays, structures, input/output, loops and conditional statements.

## Lab tasks

| File | Task | Concepts practiced |
|---|---|---|
| `Task-01-Calculate-Average.cpp` | Read a positive number of integers and calculate their average using `calculateAverage(int arr[], int size)`. | Arrays, functions, loops, validation, return values |
| `Task-02-Student-Records.cpp` | Store and display three student records using a `Student` structure. | Structures, arrays of structures, strings, input/output |
| `Task-03-Number-Checker.cpp` | Check whether an entered integer is positive, negative or zero. | `if`, `else if`, `else`, input/output |
| `Task-04-Find-Maximum.cpp` | Read five integers and find the largest using `findMaximum(int arr[], int size)`. | Arrays, functions, loops, comparisons |

## How to compile and run

Compile each task separately because every file contains its own `main()` function.

Using g++:

```bash
g++ -std=c++11 Task-01-Calculate-Average.cpp -o task1
./task1
```

Replace the source filename and executable name for Tasks 2–4. On Windows, run the generated executable as `task1.exe` (or the corresponding task name).

You can also open each `.cpp` file in Code::Blocks, Visual Studio, or another C++ IDE and run it individually.

## Input checks

- Task 1 accepts between 1 and 100 elements to keep the fixed-size array within bounds.
- Task 2 accepts marks from 0 to 100 and requires a non-empty student name.
- Tasks 1, 3 and 4 reject non-integer input and ask again.

## Learning outcomes

After completing these tasks, we should be able to pass arrays to functions, return calculated values, define and use a structure, process arrays with loops, and make decisions using conditional statements.

---
