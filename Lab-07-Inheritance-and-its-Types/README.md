# Lab 07 — Inheritance and Its Types

| Task | Program | Main concept |
|---|---|---|
| 1 | PersonStudentDemo | Single inheritance: Student extends Person |
| 2 | FamilyInheritanceDemo | Multilevel inheritance: Grandfather → Father → Son |
| 3 | EmployeeRolesDemo | Hierarchical inheritance: Manager and Engineer extend Employee |
| 4 | AllInOneDemo | One class implements Printer and Scanner interfaces (multiple inheritance of type) |
| 5 | ShapeInterfaceDemo | Interface, `@Override`, array of interface references and polymorphism |
| 6 | ManagerSuperDemo | Parent constructor called with `super(name)` |
| 7 | ConstructorOrderDemo | Predict and verify constructor execution order |

## Task 7 expected output

```text
A B C
```

When `new C()` runs, Java first invokes the parent constructor A, then B, then C. The compiler inserts an implicit `super()` call when a constructor does not explicitly call another constructor.

## Important Java rule
Java classes cannot extend two classes. Multiple inheritance of type is demonstrated through a class implementing multiple interfaces.

## Run
Compile each `.java` file separately. Each task folder contains one independent program with its own main method.
