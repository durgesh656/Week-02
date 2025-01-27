package librarymanagementsystem;

import java.util.Scanner;

public abstract class LibraryItem implements Reservable {
    // declaring the attributes of this class
    protected String itemId, title, author, borrowerName;
    protected boolean isAvailable = true;


    // created an abstract method getLoanDuration()
    protected abstract String getLoanDuration();

    // created an abstract method set() to set the attributes in child classes without any ambiguity
    abstract public void set(String itemId, String  title, String author);

    // created a concrete method getItemDetails()
    protected void getItemDetails() {
        System.out.println("this is a LibraryItem.");
    }

    // providing definition of method from Reservable interface
    @Override
    public void reserveItem() {
        Scanner sc = new Scanner(System.in); // object of scanner class
        if (checkAvailability()) {
            System.out.println("Enter your name:");
            borrowerName = sc.nextLine();
            System.out.println("Item is available and now it is reserved for " + this.borrowerName +  " for " + this.getLoanDuration());
            this.isAvailable = false;
        } else {
            System.out.println("Sorry this item is not available!");
        }
    }

    @Override
    public boolean checkAvailability() {
        return this.isAvailable;
    }
}

