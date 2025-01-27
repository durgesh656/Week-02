package librarymanagementsystem;
import java.util.Scanner;
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // object of scanner class

        // taking inputs for LibraryItem details
        System.out.println("Enter number of Library items: ");
        int numberOfLibraryItems = sc.nextInt();

        // created an array of references of LibraryItem class
        LibraryItem [] libraryItems = new LibraryItem[numberOfLibraryItems];

        // iterating through a for loop to get input for the LibraryItems
        for (int i = 0; i < numberOfLibraryItems; i++) {
            // created variables for taking inputs for the attributes of LibraryItems
            String  title;
            System.out.println("Enter  Title / Content of Library Item-" + (i+1));
            // to avoid conflicts while taking inputs
            if(i%2 == 0) title = sc.nextLine();
            title = sc.nextLine();

            System.out.println("Enter ID / Serial-No / ISBN of Library Item-" + (i+1));
            String itemId = sc.next();

            System.out.println("Enter Publisher / Creator / Author of Library Item-" + (i+1));
            String author = sc.nextLine();
            author = sc.nextLine(); // to avoid conflicts while taking inputs

            // initializing objects
            libraryItems[i] = ( itemId.charAt(0) == 'B')? new Book() :( itemId.charAt(0) == 'M')? new Magazine() : new DVD();

            // setting attribute values
            libraryItems[i].set(itemId,  title,  author);
            // getting the details of LibraryItem
            libraryItems[i].getItemDetails();
            // reserving this item
            libraryItems[i].reserveItem();
            // reserving the same item again
            libraryItems[i].reserveItem();
        }
    }
}
