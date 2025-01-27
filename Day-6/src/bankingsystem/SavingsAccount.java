package bankingsystem;

public class SavingsAccount extends BankAccount {

    @Override
    public void set(String accountNumber, String  holderName, float  balance) {
        this. holderName =  holderName;
        this.accountNumber = accountNumber;
        this. balance =  balance;
    }

    public String getHolderName() {
        return this.holderName;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public float getBalance() {
        return this.balance;
    }

    @Override
    public boolean calculateLoanEligibility(float amount) {
        return amount <= this.balance;
    }

    // overriding the abstract method of BankAccount class
    @Override
    protected float calculateInterest(float amount) {
        return amount * 8 / 100; // 8% interest of amount
    }

    // overriding the displayDetails method of BankAccount class
    @Override
    public void displayDetails() {
        System.out.println("Holder Name: " + this.getHolderName() + "\nAccount Number: " + this.getAccountNumber() + "\nBalance: " + this.getBalance());
    }
}
