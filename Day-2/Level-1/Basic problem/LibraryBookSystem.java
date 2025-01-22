
class Book{
    private String title;
    private String author;
    private double price;
    private boolean availability;
    //default constructor to initialize all fields to default values
    Book(){
        title = "The Forest";
        author = "Rahul";
        price = 200;
        availability = true;
    }
    //parameterized constructor to initialize all fields with user define values
    Book(String title, String author, double price, boolean availability){
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }
    //method to borrow the book
    void borrowBook(){
        if (availability == true) {
            System.out.println(title+" Book borrowed successfully");
            availability=false;
        }
        else{
            System.out.println("sorry, currently Book is not available");
        }
    }
   
}

public class LibraryBookSystem{
    public static void main(String[] args) {
        Book book1=new Book();
        Book book2=new Book("The Art", "john", 250, true);
        //calling borrowBook method to borrow the book
        book1.borrowBook();
        book2.borrowBook();
        book2.borrowBook();
    }
}