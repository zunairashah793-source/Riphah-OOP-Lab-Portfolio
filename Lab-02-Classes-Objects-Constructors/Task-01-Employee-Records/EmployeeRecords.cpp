#include <iostream>
#include <iomanip>
#include <string>
#include <limits>

using namespace std;

class Employee {
private:
    string name;
    int employeeID;
    double salary;

public:
    // Default constructor: gives the object safe initial values.
    Employee() {
        name = "Not assigned";
        employeeID = 0;
        salary = 0.0;
    }

    // Parameterized constructor: initializes an employee with supplied values.
    Employee(string employeeName, int id, double employeeSalary) {
        name = employeeName;
        employeeID = id;
        salary = (employeeSalary >= 0.0) ? employeeSalary : 0.0;
    }

    void increaseSalary(double percentage) {
        if (percentage < 0.0) {
            cout << "Salary increase percentage cannot be negative.\n";
            return;
        }

        salary += salary * percentage / 100.0;
    }

    void display() const {
        cout << "Employee Name: " << name << '\n'
             << "Employee ID: " << employeeID << '\n'
             << "Salary: Rs. " << fixed << setprecision(2) << salary << "\n\n";
    }
};

int main() {
    cout << "========== EMPLOYEE RECORDS =========\n\n";

    // Demonstrate both required constructors.
    Employee employee1;
    Employee employee2("Ayesha Khan", 1002, 65000.00);

    cout << "Employee created using the default constructor:\n";
    employee1.display();

    cout << "Employee created using the parameterized constructor:\n";
    employee2.display();

    cout << "Applying a 10% salary increase to Employee 2...\n";
    employee2.increaseSalary(10.0);

    cout << "Updated employee record:\n";
    employee2.display();

    return 0;
}
