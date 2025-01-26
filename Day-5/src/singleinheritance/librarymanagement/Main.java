package singleinheritance.librarymanagement;

public class Main {
    public static void main(String[] args) {
        // creating object of author class
        Author author = new Author("Good Vibe", 2000, "John", "Author specialize in psychology.");
        // calling displayInfo method
        author.displayInfo();
    }
}
