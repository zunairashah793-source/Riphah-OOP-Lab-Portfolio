# Lab 04 — Arrays, For Each Loop, Wrapper Classes and String Processing

This lab follows the three tasks on page 58 of the Riphah OOP manual.

## Tasks

1. **Student Marks:** stores five marks in `ArrayList<Integer>`, displays them with an enhanced for loop, and calculates total, average and highest mark.
2. **String Processing:** reads a student's name and displays its original, uppercase and lowercase forms, length, first character and whether it contains `a` (case-insensitive).
3. **Character Classification:** reads one character, displays its integer/Unicode code-unit value, and identifies digit, uppercase, lowercase or other character.

## Concepts
Arrays vs ArrayList, `ArrayList<Integer>`, wrapper classes, autoboxing, enhanced for loop, `String` methods, `char`, Unicode values and `Character` utility methods.

## Run
Open each `.java` file as a separate Java application (each file has its own `main`). In NetBeans create a Java Application and paste the matching file into a class with the same name. Or run `javac StudentMarks.java` then `java StudentMarks` from that task folder.

## Notes
The marks task validates five integer marks between 0 and 100. The name check is case-insensitive so both `a` and `A` are recognized. Java's `char` stores a UTF-16 code unit; the displayed integer is its numeric code-unit value.
