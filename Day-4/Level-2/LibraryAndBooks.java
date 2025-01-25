import java.util.ArrayList;

class Library {
    private String libraryName;
    private ArrayList<Book> books;

    // Constructor to initialize the library
    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
        //System.out.println("Added \"" + book.title+ "\" to " + libraryName);
    }

    // Method to display all books in the library
    public void displayBooks() {
        System.out.println("Books in the library : " + libraryName );
        for (Book book : books) {
            book.displayBookDetails();
        }
    }
}

class Book {
    private String title;
    private String author;

    // Constructor to initialize book details
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Display book details
    public void displayBookDetails() {
        System.out.println("Title: " + title + "\n Author: " + author);
    }
}

public class LibraryAndBooks {
    public static void main(String[] args) {
        // Create books (books exist independently of libraries)
        Book book1 = new Book("The sky", "raj");
        Book book2 = new Book("The Art", "jay");
        
        // Create libraries
        Library library1 = new Library("Central Library");
        Library library2 = new Library("college Library");

        // Add books to libraries
        library1.addBook(book1);
        library2.addBook(book2);

        // Display books in each library
        library1.displayBooks();
        library2.displayBooks();
    }
}
