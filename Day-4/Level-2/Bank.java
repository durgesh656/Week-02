import java.util.ArrayList;

class Customer
{
    private String name;
    private int AccountNumber;
    private float balance;
    // Constructor for initializing the attributes
    Customer(String name, int AccountNumber, float balance)
    {
        this.name = name;
        this.AccountNumber = AccountNumber;
        this.balance = balance;
    }
    // Method to display the balance
    public void displayBalance()
    {
        System.out.println("Name: " + name + " Account Number: " + AccountNumber + " Balance: " + balance);
    }
    //Method to add the balance
    public void addBalance(float amount)
    {
        balance += amount;
        System.out.println("Amount added successfully and the updated balance is: " + balance);
    } 
    //Method to withdraw the balance
    public void withdrawBalance(float amount)
    {
        if(balance >= amount && amount > 0)
        {
            balance -= amount;
            System.out.println("Amount withdrawn successfully and the updated balance is: " + balance);
        }
        else
        {
            System.out.println("Insufficient balance or invalid input");
        }
    }

}

public class Bank 
{
    private ArrayList<Customer> accounts    ;
    // Constructor For the bank class 
    Bank()
    {
        this.accounts = new ArrayList<Customer>();// Creating a new array list of customer type
    }
    public void add(Customer c)
    {
        accounts.add(c);
    }


    public static void main(String[] args) 
    {
        Bank bank=new Bank();
        Customer c1=new Customer("john", 111111, 10000);
        Customer c2=new Customer("harry", 222222, 15000);
        Customer c3=new Customer("poter", 333333, 20000);
        bank.accounts.add(c1);
        bank.accounts.add(c2);
        bank.accounts.add(c3);
        // Displaying the balance of the customers
        for(Customer c: bank.accounts)
        {
        c.displayBalance();
        }
        
    }
}
// Customer class
