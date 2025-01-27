package librarymanagementsystem;

public class Magazine extends LibraryItem {
    // defining the behaviour of this class :-

    // overriding setter method of LibraryItem class
    @Override
    public void set(String itemId, String  title, String author) {
        this. title =  title;
        this.itemId = itemId;
        this. author =  author;
    }

    // creating getter methods
    public String getTitle() {
        return this.title;
    }

    public String getItemId() {
        return this.itemId;
    }

    public String getAuthor() {
        return this.author;
    }

    // overriding the abstract method of LibraryItem class
    @Override
    protected String getLoanDuration() {
        return "15 Days";
    }

    // overriding the getItemDetails method of LibraryItem class
    @Override
    public void getItemDetails() {
        System.out.println("Title of the Magazine: " + this.getTitle() + "\nID: " + this.getItemId() + "\nPublisher: " + this.getAuthor());
    }
}

