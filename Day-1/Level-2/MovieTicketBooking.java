import java.util.*;

public class MovieTicketBooking{
	public static void main(String[]args){
		MovieTicket ticket=new MovieTicket("xyz",12,200);
		ticket.bookTicket();
		ticket.displayResult();
	}
}

class MovieTicket{
	//create attributes of class
    String movieName;
    int seatNumber;
    double price;
    boolean isBook;
    //calling constructor of the class to set values
    MovieTicket(String movieName, int seatNumber, double price){
		this.movieName=movieName;
		this.seatNumber=seatNumber;
		this.price=price;
		this.isBook=false;
    }
	//method to check seat Booked or not
    void bookTicket(){
     if(isBook){
            System.out.println("Seat " + seatNumber + " for " + movieName + " is already booked.");
        } else {
            isBook = true;
            System.out.println("Successfully booked seat " + seatNumber + " for " + movieName + " movie .");
        }
    }
   //method use to display the results
      void displayResult(){
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
        System.out.println("Booking Status: " + (isBook ? "Booked" : "Not booked"));
    }
  
}