import java.util.Scanner;
class Person{
	//declare the attributes
	private String name;
	private String address;
	//parameterized constructor to initialize attributes
	Person(String name,String address){
		this.name=name;
		this.address=address;
		System.out.println("parameterized constructor called.");
	}
	//copy constructor
	Person(Person pc){
		System.out.println("copy constructor called.");
		this.name=pc.name;
		this.address=pc.address;
	}
	//method for display details
	void displayDetails(){
		System.out.println("person name is: "+name+"\n person address is: "+address);
	}
	
	
	
}

public class PersonDetails{
	public static void main(String[]args){
		Person person1=new Person("Durgesh","Bhopal");
		person1.displayDetails();
		Person person2=new Person(person1);
		person2.displayDetails();
	}
}