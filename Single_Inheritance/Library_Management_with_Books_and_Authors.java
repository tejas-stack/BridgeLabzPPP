package Single_Inheritance;


class Book {
    String title;
    int publicationYear;

    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
}

class Author extends Book {
    String name;
    String bio;

    Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    void displayInfo() {
        System.out.println("Book: " + title + " (" + publicationYear + ")");
        System.out.println("Author: " + name + " - " + bio);
    }
}
 

public class Library_Management_with_Books_and_Authors {
    public static void main(String[] args) {
        Author a = new Author("Effective Java", 2018, "Joshua Bloch", "Java expert and author");
        a.displayInfo();
    }
}