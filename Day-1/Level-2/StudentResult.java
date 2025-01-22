import java.util.Scanner;

public class StudentResult{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		Student student=new Student();//create an object of a Student class
		student.displayDetails();//calling displayDetails method with the help of object
	}
}
//created a Student class
class Student{
	Scanner sc=new Scanner(System.in);
	//attributes of class
	private String name;
	private int rollNumber;
	private float marks;
	
	//constructor to set value
	Student(){
		System.out.println("Enter student name:");
		name=sc.nextLine().trim();
		System.out.println("Enter student rollNumber:");
		rollNumber=sc.nextInt();
		System.out.println("Enter student marks:");
		marks=sc.nextFloat();
	}
	//method for calulating grade
	public char calculateGrade(){
		if (marks>=90){
			return 'A';
		}
		else if(marks<90 && marks>=80){
			return 'B';
		}
		else if(marks<80 && marks>=70){
			return 'C';
		}
		else if(marks<70 && marks>=60){
			return 'D';
		}
		else if(marks<60 && marks>=50){
			return 'E';
		}
		else{
			return 'F';
		}
	}
	//method for show details
	void displayDetails(){
		System.out.println("Student name: "+name+"\nStudent Rollnumber: "+rollNumber+"\nStudent marks: "+marks+"\nStudent grade: "+calculateGrade());
	}
}

