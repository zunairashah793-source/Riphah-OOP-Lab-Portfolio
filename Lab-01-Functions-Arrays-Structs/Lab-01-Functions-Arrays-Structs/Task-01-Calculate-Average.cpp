#include <iostream>
#include <limits>
using namespace std;

const int MAX_ELEMENTS = 100;

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

float calculateAverage(int arr[], int size) {
    double sum = 0.0;
    for (int i = 0; i < size; i++) {
        sum += arr[i];
    }
    return static_cast<float>(sum / size);
}

int main() {
    int size;

    do {
        size = readInteger("Enter the number of elements (1-100): ");
        if (size <= 0 || size > MAX_ELEMENTS) {
            cout << "Please enter a value between 1 and " << MAX_ELEMENTS << ".\n";
        }
    } while (size <= 0 || size > MAX_ELEMENTS);

    int numbers[MAX_ELEMENTS];
    for (int i = 0; i < size; i++) {
        numbers[i] = readInteger("Enter element " + to_string(i + 1) + ": ");
    }

    cout << "Average = " << calculateAverage(numbers, size) << '\n';
    return 0;
}
