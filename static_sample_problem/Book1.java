// Sample Program 2: Library Management System
// Create a Book class to manage library books with the following features:
// Static:
// ○       A static variable libraryName shared across all books.
// ○       A static method displayLibraryName() to print the library name.
// This:
// ○       Use this to initialize title, author, and isbn in the constructor.
// Final:
// ○       Use a final variable isbn to ensure the unique identifier of a book cannot be changed.
// Instanceof:
// ○       Verify if an object is an instance of the Book class before displaying its details.

package static_sample_problem;

public class Book1 {
    static String libraryName = "City Library";
    public final String isbn;
    String title;
    String author;
    public Book1(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }
    public void displaydetails() {
        System.out.println("Library Name: " + libraryName);
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }

}
class Main1 {
    public static void main(String[] args) {
        Book1 book1 = new Book1("123-456-789", "xyz", "abcd");
        if(book1 instanceof Book1) {
            book1.displaydetails();
        }
    }
}
