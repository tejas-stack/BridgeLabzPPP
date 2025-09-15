// Create a BankAccount class with the following features:
// Static:
// ○       A static variable bankName is shared across all accounts.
// ○       A static method getTotalAccounts() to display the total number of accounts.
// This:
// ○       Use this to resolve ambiguity in the constructor when initializing accountHolderName and accountNumber.
// Final:
// ○       Use a final variable accountNumber to ensure it cannot be changed once assigned.
// Instanceof:
// ○       Check if an account object is an instance of the BankAccount class before displaying its details.

package static_sample_problem;

public class BankAccount {
    static String bankName = "Global Bank";
    static int totalAccounts = 0;
    public final String accountNumber;
    String accountHolderName;
    double balance;
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
        totalAccounts++;
    }
    public int getTotalAccounts() {
        return totalAccounts;
    }
    public void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("This is not a valid BankAccount instance.");
        }
    }
}

class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("123456", "Alice", 1000.0);
        if(account1 instanceof BankAccount) {
            account1.displayAccountDetails();
        }
    }
}

