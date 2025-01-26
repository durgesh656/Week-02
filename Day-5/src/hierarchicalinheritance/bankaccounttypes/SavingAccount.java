package hierarchicalinheritance.bankaccounttypes;

public class SavingAccount extends BankAccount{
    double interest;   // unique attribute

    SavingAccount(String accountNumber, int balance, double interest){
        // invoke parent constructor using super
        super(accountNumber, balance);
        this.interest = interest;
    }

    // Overridden Method
    @Override
    void displayAccountType(){
        System.out.println("Account Type is Saving Account");
        super.displayAccountType();
        System.out.println("Interest : " + interest);
    }
}
