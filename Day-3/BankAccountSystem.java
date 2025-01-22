class BankAccount{
    //declaring class and instance attributes
    static String bankName="ABC Bank";
    private String accountHolderName;
    private final int ACCOUNT_NUMBER;
    private static int totalAccounts;
    //constructor for value initialization
    BankAccount(String accountHolderName,int accountNumber ){
        this.accountHolderName=accountHolderName;
        this.ACCOUNT_NUMBER=accountNumber;
        totalAccounts++;

    }
    //class method to get the total bank accounts
    public static int  getTotalAccounts(){
        return totalAccounts;

    }
    // method to display account details
    public void displayDetails(){
        System.out.println("Bank name is: "+bankName);
        System.out.println("Account holder name is: "+accountHolderName);
        System.out.println("Bank Account number is: "+ACCOUNT_NUMBER);
       
    }
}

public class Bank{
    public static void main(String[]args){
        //creating objects of BankAccount class
        BankAccount account1=new BankAccount("Durgesh",1234567);
        BankAccount account2=new BankAccount("bipin",212211);
        //checking the objects are the instance of BankAccount class or not
        if(account1 instanceof BankAccount ){
            account1.displayDetails();//displaying account details
            
        }
        if(account2 instanceof BankAccount ){
            account2.displayDetails();//displaying account details
           

        }
        System.out.println("Total accounts are: "+BankAccount.getTotalAccounts());
    }
}