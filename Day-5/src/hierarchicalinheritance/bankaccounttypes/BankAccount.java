package hierarchicalinheritance.bankaccounttypes;

public class BankAccount {
    String accountNumber;
    int balance;

    // parent class constructor
    BankAccount(String accountNumber, int balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // method to display account details
    void displayAccountType(){
        System.out.println("Account number : " + accountNumber);
        System.out.println("Balance : " + balance);
    }
}
