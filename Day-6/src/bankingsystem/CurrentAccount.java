package bankingsystem;

public class CurrentAccount extends BankAccount {

    // overriding setter method of BankAccount class
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

    // overriding the method from Loanable interface
    @Override
    public boolean calculateLoanEligibility(float amount) {
        return amount <= this.balance;
    }

    // overriding the abstract method of BankAccount class
    @Override
    protected float calculateInterest(float amount) {
        return amount * 12 / 100; // 12% interest of amount
    }

    // overriding the displayDetails method of BankAccount class
    @Override
    public void displayDetails() {
        System.out.println("Holder Name: " + this.getHolderName() + "\nAccount Number: " + this.getAccountNumber() + "\nBalance: " + this.getBalance());
    }
}
