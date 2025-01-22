class Book{
    private String title;
    private String author;
    private double price;
    private boolean availability;
    static String libraryName="HAPPY HOURS ";
    private final String isbn;
    //default constructor to initialize all fields to default values
    Book(){
        title = "The Forest";
        author = "Rahul";
        price = 200;
        availability = true;
        isbn = "1234567890";
    }
    //parameterized constructor to initialize all fields with user define values
    Book(String title, String author, double price, boolean availability,String isbn){
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
        this.isbn=isbn;
    }
    //method to display library name
    public static void displayLibraryName(){
        System.out.println("welcome to the "+libraryName+" library");
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
    void displayDetails(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
        System.out.println("Availability: "+availability);
        System.out.println("ISBN: "+isbn);
    }
   
}

public class LibraryBookSystem{
    public static void main(String[] args) {
        Book book1=new Book();
        Book book2=new Book("The Art", "john", 250, true,"22222");
        //calling borrowBook method to borrow the book
        // book1.borrowBook();
        // book2.borrowBook();
        // book2.borrowBook();
        if(book1 instanceof Book){
            Book.displayLibraryName();
            book1.displayDetails();
            book1.borrowBook();
        }
        if (book2 instanceof Book) {
            Book.displayLibraryName();
            book2.displayDetails();
            book2.borrowBook();
           
        }
    }
}