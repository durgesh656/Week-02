package singleinheritance.librarymanagement;

public class Author extends Book{
    String name;
    String bio;

    Author(String title, int publicationYear, String name, String bio){
        // invoke parent class constructor using super keyword
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    // Method to display information of Book with author
    void displayInfo(){

        System.out.println("Title of book : " + title);
        System.out.println("Publication year : " + publicationYear);
        System.out.println("Name of author : " + name);
        System.out.println("Bio of Author : " + bio);

    }
}
