

abstract class BankAccount {
    private int accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit(double amount) { balance += amount; }
    public void withdraw(double amount) { if (balance >= amount) balance -= amount; }
    public double getBalance() { return balance; }
    public int getaccountNumber() { return accountNumber; }
    public String getholderName() { return holderName; }

    public abstract double calculateInterest();
}

interface Loanable {
    void applyForLoan();
    boolean calculateLoanEligibility();
}

class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(int number, String name, double balance) { super(number, name, balance); }

    @Override
    public double calculateInterest() { return getBalance() * 0.04; }

    @Override
    public void applyForLoan() { System.out.println("Loan Applied from Savings Account"); }

    @Override
    public boolean calculateLoanEligibility() { return getBalance() > 10000; }
}

class CurrentAccount extends BankAccount implements Loanable {
    public CurrentAccount(int number, String name, double balance) { super(number, name, balance); }

    @Override
    public double calculateInterest() { return 0; }

    @Override
    public void applyForLoan() { System.out.println("Loan Applied from Current Account"); }

    @Override
    public boolean calculateLoanEligibility() { return getBalance() > 50000; }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount(101, "Alice", 20000);
        BankAccount acc2 = new CurrentAccount(102, "Bob", 60000);
        System.out.println("Balance Savings: " + acc1.getBalance());
        System.out.println("Interest Savings: " + acc1.calculateInterest());
        System.out.println("Balance Current: " + acc2.getBalance());
        System.out.println("Interest Current: " + acc2.calculateInterest());
    }
}