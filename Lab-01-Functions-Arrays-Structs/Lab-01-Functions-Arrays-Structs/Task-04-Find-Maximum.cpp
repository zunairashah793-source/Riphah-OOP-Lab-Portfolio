#include <iostream>
#include <limits>
using namespace std;

const int ARRAY_SIZE = 5;

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

int findMaximum(int arr[], int size) {
    int maximum = arr[0];
    for (int i = 1; i < size; i++) {
        if (arr[i] > maximum) {
            maximum = arr[i];
        }
    }
    return maximum;
}

int main() {
    int numbers[ARRAY_SIZE];

    cout << "Enter " << ARRAY_SIZE << " integers:\n";
    for (int i = 0; i < ARRAY_SIZE; i++) {
        numbers[i] = readInteger("Element " + to_string(i + 1) + ": ");
    }

    cout << "The maximum number is: "
         << findMaximum(numbers, ARRAY_SIZE) << '\n';

    return 0;
}
