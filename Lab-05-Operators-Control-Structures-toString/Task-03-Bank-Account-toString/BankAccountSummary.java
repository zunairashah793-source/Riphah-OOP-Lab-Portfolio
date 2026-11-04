class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    public BankAccount(String accountHolder, String accountNumber, double balance) {
        if (balance < 0) throw new IllegalArgumentException("Balance cannot be negative.");
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return String.format("Account[%s] — %s — Balance: $%.2f",
                accountNumber, accountHolder, balance);
    }
}

public class BankAccountSummary {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("John Doe", "1234-5678", 15000.0);
        BankAccount account2 = new BankAccount("Sara Ahmed", "9876-5432", 8250.5);

        // println(Object) automatically calls the object's toString() method.
        System.out.println(account1);
        System.out.println(account2);
    }
}
