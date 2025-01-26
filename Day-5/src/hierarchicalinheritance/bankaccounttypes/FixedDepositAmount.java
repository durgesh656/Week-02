package hierarchicalinheritance.bankaccounttypes;

public class FixedDepositAmount extends BankAccount{
    String renewalDate;

    FixedDepositAmount(String accountNumber, int balance, String renewalDate){
        super(accountNumber, balance);
        this.renewalDate = renewalDate;
    }

    // Overridden Method
    @Override
    void displayAccountType(){
        System.out.println("Account Type is Fixed Deposit Account");
        super.displayAccountType();
        System.out.println("Renewal Date : " + renewalDate);
    }
}
