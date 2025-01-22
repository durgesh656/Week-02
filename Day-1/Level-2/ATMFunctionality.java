import java.util.Scanner;

public class ATMFunctionality {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		// created an integer variable to let user choose the functionality, that user wants to use
		int functionality;
		
		System.out.println("Choose: \n1 => for deposite money\n2 => for withdraw money\n3 => for display account balance");
		functionality = sc.nextInt(); // taking input for functionality
		
		// create an object of BankAccount class
		BankAccount account = new BankAccount(); 
		
		switch (functionality) { 
			case 1 :
				account.depositeMoney();
				break;
			case 2 :
				account.withdrawMoney();
				break;
			case 3 :
				account.viewBalance();
				break;
			default :
				System.out.println("not a valid choice");
		}
		
		
	}
}

class BankAccount {
	Scanner sc = new Scanner(System.in); 

	private String accountHolder="XYZ", accountNumber="XXXXX123";
	private double balance = 0; // initial balance 
	
	
	
	// method for deposite money
	public void depositeMoney() {
		System.out.println("Enter amount: ");
		double depositingBalance = sc.nextDouble(); // taking input for how much amount user wants to deposite
		
		System.out.println("your previous balance: " + balance);
		balance += depositingBalance; // adding deposited amount to balance
		System.out.println("your balance after depositing money is : " + balance);
	}
	
	// method for withdrawing money
	public void withdrawMoney() {
		System.out.println("Enter amount: ");
		double withdrawAmount = sc.nextDouble(); // taking input for how much amount user wants to withdraw
		
		// checking if the amount entered by user is valid or not
		if (withdrawAmount > balance) { // user cannot withdraw money if withdrawAmount is greater than current balance
			System.out.println("Insufficient Balance");
		} else {
			System.out.println("your previous balance: " + balance);
			balance -= withdrawAmount; // subtracting withdrawed amount from balance
			System.out.println("your balance after withdrawing money is : " + balance);
		}
	}
	
	// method for printing the account balance
	public void viewBalance() {
		System.out.println("your current balance: " + balance);
	}
}

