abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public void getItemDetails() {
        System.out.println("ID: " + itemId + ", Title: " + title + ", Author: " + author);
    }

    public abstract int getLoanDuration();
}

interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}

class Book extends LibraryItem implements Reservable {
    public Book(int id, String title, String author) { super(id, title, author); }

    @Override
    public int getLoanDuration() { return 14; }

    @Override
    public void reserveItem() { System.out.println("Book reserved"); }

    @Override
    public boolean checkAvailability() { return true; }
}

class Magazine extends LibraryItem implements Reservable {
    public Magazine(int id, String title, String author) { super(id, title, author); }

    @Override
    public int getLoanDuration() { return 7; }

    @Override
    public void reserveItem() { System.out.println("Magazine reserved"); }

    @Override
    public boolean checkAvailability() { return true; }
}

class DVD extends LibraryItem implements Reservable {
    public DVD(int id, String title, String author) { super(id, title, author); }

    @Override
    public int getLoanDuration() { return 5; }

    @Override
    public void reserveItem() { System.out.println("DVD reserved"); }

    @Override
    public boolean checkAvailability() { return true; }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryItem[] items = {
            new Book(1, "Java", "Author A"),
            new Magazine(2, "Tech Today", "Author B"),
            new DVD(3, "Movie", "Director C")
        };

        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
        }
    }
}