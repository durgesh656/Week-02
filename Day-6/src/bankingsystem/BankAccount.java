package bankingsystem;

public abstract class BankAccount implements Loanable {

    protected String accountNumber, holderName;
    protected float  balance=0;

    protected void deposit(float amount) {
        this.balance += amount;
        System.out.println("Amount Rs." + amount + " Deposited\nCurrent Balance: Rs." + this.balance);
    }

    protected void withdraw(float amount) {
        if (this.balance < amount) {
            System.out.println("Insufficient Balance!");
        } else {
            this.balance -= amount;
            System.out.println("Amount Rs." + amount + " Withdrawn from your account\nCurrent Balance: Rs." + this.balance);
        }
    }

    // created an abstract method calculateInterest()
    protected abstract float calculateInterest(float amount);

    abstract public void set(String accountNumber, String  holderName, float  balance);

    protected void displayDetails() {
        System.out.println("this is a BankAccount.");
    }

    // providing definition of method from Loanable interface
    @Override
    public void applyForLoan(float amount) {
        if (calculateLoanEligibility(amount)) {
            System.out.println("You are eligible for getting loan");
            System.out.println("Your Loan Amount: " + amount + "\nInterest on loan amount will be: " + calculateInterest(amount));
        } else {
            System.out.println("Sorry You Are Not Eligible For Getting Loan!");
        }
    }
}
