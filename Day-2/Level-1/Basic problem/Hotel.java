import java.util.Scanner;

class HotelBooking{
    private String guestName;
    private String roomType;
    private int nights;
    //default constructor
    HotelBooking(){
        guestName="Happy Singh";
        roomType="Normal";
        nights=10;
    }
    //parameterized constructor 
    HotelBooking(String guestName,String roomType,int nights){
        this.guestName=guestName;
        this.roomType=roomType;
        this.nights=nights;
    }
    //copy constructor
    HotelBooking(HotelBooking hb){
        this.guestName=hb.guestName;
        this.roomType=hb.roomType;
        this.nights=hb.nights;
    }
    //Display the booking 
    public void displayBooking(){
        System.out.println("Guest Name: "+guestName);
        System.out.println("Room Type: "+roomType);
        System.out.println("Nights: "+nights);
        System.out.println("You Booked a Room successfully.");
    }


}
public class Hotel{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HotelBooking person1=new HotelBooking();
        person1.displayBooking();
        HotelBooking person2=new HotelBooking("Rahul", "Deluxe", 5);
        person2.displayBooking();
        HotelBooking person3=new HotelBooking(person2);
        person3.displayBooking();
    }
}