import java.util.Scanner;

public class BookDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String title = sc.nextLine().trim();
        String author = sc.nextLine().trim();
        int price = sc.nextInt();

        // creating an object of class
        Book book = new Book(title, author, price);
        //calling displayBookDetails
        book.displayBookDetails();
    }
}

class Book{
    String title;
    String author;
    int price;

    // constructor to initialize attributes 
	Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // method to print book details
    public void displayBookDetails(){
        System.out.println("Title of book : " + title);
        System.out.println("Author of book : " + author);
        System.out.println("Price of book : " + price);
    }
}
