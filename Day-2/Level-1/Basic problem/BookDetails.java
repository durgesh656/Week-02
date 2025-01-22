import java.util.Scanner;

class Book{
	//declare attributes 
	private String title;
	private String author;
	private double price;
	//default constructor for initialize attributes
	public Book(){
		title="WORLD TOUR";
		author="XYZ";
		price=250;
	}
	//parametarized constructor for initialize attributes
	public Book(String title, String author, double price){
		this.title=title;
		this.author=author;
		this.price=price;
	}
	//method for display details
	void displayDetails(){
		System.out.println("Book Title is: "+title+"\nBook Author name is: "+author+"\nBook Price is: "+price);
	}
}

public class BookDetails{
	public static void main(String[]args){
		Book book1=new Book();
		Book book2=new Book("Happy","ABC",350);
		//calling displayDetails method to show details by object
		book1.displayDetails();
		book2.displayDetails();
	}
}