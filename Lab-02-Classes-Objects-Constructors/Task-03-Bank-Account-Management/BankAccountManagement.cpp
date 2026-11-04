#include <iostream>
#include <iomanip>
#include <string>

using namespace std;

class Account {
private:
    string accountHolder;
    string accountNumber;
    double balance;

public:
    // Default constructor initializes an empty account safely.
    Account() {
        accountHolder = "Not assigned";
        accountNumber = "N/A";
        balance = 0.0;
    }

    // Parameterized constructor initializes an account with given details.
    Account(string holder, string number, double initialBalance) {
        accountHolder = holder;
        accountNumber = number;
        balance = (initialBalance >= 0.0) ? initialBalance : 0.0;
    }

    void deposit(double amount) {
        if (amount <= 0.0) {
            cout << "Deposit failed: amount must be greater than zero.\n";
            return;
        }

        balance += amount;
        cout << "Deposit successful.\n";
    }

    void withdraw(double amount) {
        if (amount <= 0.0) {
            cout << "Withdrawal failed: amount must be greater than zero.\n";
        } else if (amount > balance) {
            cout << "Withdrawal failed: insufficient balance.\n";
        } else {
            balance -= amount;
            cout << "Withdrawal successful.\n";
        }
    }

    void display() const {
        cout << "Account Holder: " << accountHolder << '\n'
             << "Account Number: " << accountNumber << '\n'
             << "Balance: Rs. " << fixed << setprecision(2) << balance << "\n\n";
    }
};

int main() {
    cout << "========== BANK ACCOUNT MANAGEMENT =========\n\n";

    // Demonstrate the default constructor.
    Account defaultAccount;
    cout << "Default account (before customer details):\n";
    defaultAccount.display();

    // Create the three required account objects using the parameterized constructor.
    Account accounts[3] = {
        Account("Ayesha Khan", "AC1001", 15000.00),
        Account("Sara Ahmed", "AC1002", 22000.00),
        Account("Maham Ali", "AC1003", 18000.00)
    };

    cout << "Initial account information:\n";
    for (int i = 0; i < 3; i++) {
        cout << "Account " << i + 1 << '\n';
        accounts[i].display();
    }

    cout << "Performing transactions on Account 1 (AC1001):\n";
    accounts[0].deposit(5000.00);
    accounts[0].withdraw(3000.00);
    accounts[0].withdraw(50000.00); // Demonstrates insufficient-balance handling.

    cout << "\nFinal account balances:\n";
    for (int i = 0; i < 3; i++) {
        cout << "Account " << i + 1 << '\n';
        accounts[i].display();
    }

    return 0;
}
