package Hierarchical_Inheritance;



 class BankAccount {
    int accountNumber;
    double balance;

    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        System.out.println("Savings Account - Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(int accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        System.out.println("Checking Account - Withdrawal Limit: $" + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    int tenure; // months

    FixedDepositAccount(int accountNumber, double balance, int tenure) {
        super(accountNumber, balance);
        this.tenure = tenure;
    }

    void displayAccountType() {
        System.out.println("Fixed Deposit Account - Tenure: " + tenure + " months");
    }
}
public class Bank_Account_Types {

    public static void main(String[] args) {
        BankAccount[] accounts = {
            new SavingsAccount(1001, 5000, 4.5),
            new CheckingAccount(1002, 3000, 1000),
            new FixedDepositAccount(1003, 10000, 12)
        };

        for (BankAccount acc : accounts) {
            if (acc instanceof SavingsAccount) ((SavingsAccount)acc).displayAccountType();
            if (acc instanceof CheckingAccount) ((CheckingAccount)acc).displayAccountType();
            if (acc instanceof FixedDepositAccount) ((FixedDepositAccount)acc).displayAccountType();
        }
    }
}
