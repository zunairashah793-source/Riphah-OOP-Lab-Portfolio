import java.util.Scanner;

class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;
    private static int totalAccounts = 0;

    public BankAccount() {
        totalAccounts++;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance. Negative values are not allowed.");
        }
    }

    public String getAccountHolder() {
        return this.accountHolder;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }
}

public class BankAccountManagement {
    private static final Scanner INPUT = new Scanner(System.in);

    private static BankAccount readAccount(int accountPosition) {
        BankAccount account = new BankAccount();

        System.out.println("\nEnter details for Account " + accountPosition + ":");

        System.out.print("Account holder: ");
        account.setAccountHolder(INPUT.nextLine().trim());

        System.out.print("Account number: ");
        account.setAccountNumber(INPUT.nextLine().trim());

        account.setBalance(readNonNegativeBalance());

        return account;
    }

    private static double readNonNegativeBalance() {
        while (true) {
            System.out.print("Balance: ");
            if (INPUT.hasNextDouble()) {
                double amount = INPUT.nextDouble();
                INPUT.nextLine();
                if (amount >= 0) {
                    return amount;
                }
                System.out.println("Balance cannot be negative. Please try again.");
            } else {
                System.out.println("Please enter a valid numeric balance.");
                INPUT.next();
            }
        }
    }

    private static void displayAccount(BankAccount account) {
        System.out.println("Account holder: " + account.getAccountHolder());
        System.out.println("Account number: " + account.getAccountNumber());
        System.out.printf("Balance: Rs. %.2f%n", account.getBalance());
    }

    public static void main(String[] args) {
        BankAccount firstAccount = readAccount(1);
        BankAccount secondAccount = readAccount(2);

        System.out.println("\n--- Bank Account Details ---");
        displayAccount(firstAccount);

        System.out.println();
        displayAccount(secondAccount);

        System.out.println("\nTotal accounts: " + BankAccount.getTotalAccounts());

        INPUT.close();
    }
}
