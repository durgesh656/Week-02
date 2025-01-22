import java.util.Scanner;

class Circle{
	private double radius;
	//default constructor 
	Circle(){
		radius=10;
		System.out.println("Radius initialized by default constructer.");
	}
	//parameterized constructor
	Circle(double radius){
		this.radius=radius;
		System.out.println("Radius initialized by parameterized constructer.");
	}
	
	void displayDetails(){
		System.out.println("Radius of the circle is: "+radius);
	}
}

public class CircleRadius{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		Circle c1=new Circle();
		c1.displayDetails();
		Circle c2=new Circle(sc.nextDouble());
		
		
		c2.displayDetails();
	}
}