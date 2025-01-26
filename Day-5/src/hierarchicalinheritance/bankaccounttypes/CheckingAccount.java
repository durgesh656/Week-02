package hierarchicalinheritance.bankaccounttypes;

public class CheckingAccount extends BankAccount{
    int withdrawalLimit;

    CheckingAccount(String accountNumber, int balance, int withdrawalLimit){
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    // Overridden Method
    @Override
    void displayAccountType(){
        System.out.println("Account Type is Checking Account");
        super.displayAccountType();
        System.out.println("WithdrawalLimit : " + withdrawalLimit);
    }
}
