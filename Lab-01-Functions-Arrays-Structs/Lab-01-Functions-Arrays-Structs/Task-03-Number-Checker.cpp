#include <iostream>
#include <limits>
using namespace std;

int main() {
    int number;

    while (true) {
        cout << "Enter an integer: ";
        if (cin >> number) {
            break;
        }

        cout << "Invalid input. Please enter a whole number.\n";
        cin.clear();
        cin.ignore(numeric_limits<streamsize>::max(), '\n');
    }

    if (number > 0) {
        cout << number << " is a positive number.\n";
    } else if (number < 0) {
        cout << number << " is a negative number.\n";
    } else {
        cout << "The number is zero.\n";
    }

    return 0;
}
