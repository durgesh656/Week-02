package bankingsystem;
import java.util.Scanner;
public class BankingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // object of scanner class

        // taking inputs for BankAccount details
        System.out.println("Enter number of Bank Accounts: ");
        int numberOfBankAccounts = sc.nextInt();

        // created an array of references of BankAccount class
        BankAccount [] bankAccounts = new BankAccount[numberOfBankAccounts];


        for (int i = 0; i < numberOfBankAccounts; i++) {

            System.out.println("Enter  holderName of BankAccount-" + (i+1));
            String  holderName = sc.nextLine();
            holderName = sc.nextLine();

            System.out.println("Enter Number of BankAccount-" + (i+1));
            String accountNumber = sc.next();

            System.out.println("Enter initial balance of BankAccount-" + (i+1));
            float  balance = sc.nextFloat();

            // initializing objects
            bankAccounts[i] = ( accountNumber.charAt(0) == 'S')? new SavingsAccount() : new CurrentAccount();

            // setting attribute values
            bankAccounts[i].set(accountNumber,  holderName,  balance);
            // getting the details of BankAccount
            bankAccounts[i].displayDetails();
            // applying for loan of 5000 Rs
            bankAccounts[i].applyForLoan(5000);
        }
    }
}
