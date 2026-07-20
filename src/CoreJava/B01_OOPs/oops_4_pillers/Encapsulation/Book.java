package CoreJava.B01_OOPs.oops_4_pillers.Encapsulation;

/**
 * ---------------------------------------------------------
 * Topic : Immutable Class
 *
 * Rules:
 * 1. Class must be final.
 * 2. Fields must be private and final.
 * 3. No setter methods.
 * 4. Initialize fields using constructor.
 * 5. Only getter methods are provided.
 * ---------------------------------------------------------
 */

public final class Book {

    //========================================
    // Private Final Fields
    //========================================

    private final int bookId;
    private final String title;
    private final String author;
    private final double price;

    //========================================
    // Constructor
    //========================================

    public Book(int bookId,
                String title,
                String author,
                double price) {

        if(bookId <= 0)
            throw new IllegalArgumentException("Invalid Book Id.");

        if(title == null || title.trim().isEmpty())
            throw new IllegalArgumentException("Book title cannot be empty.");

        if(author == null || author.trim().isEmpty())
            throw new IllegalArgumentException("Author name cannot be empty.");

        if(price <= 0)
            throw new IllegalArgumentException("Price must be greater than zero.");

        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    //========================================
    // Getter Methods
    //========================================

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    //========================================
    // Display Method
    //========================================

    public void displayBook() {

        System.out.println("\n========== BOOK DETAILS ==========");

        System.out.println("Book Id : " + bookId);
        System.out.println("Title   : " + title);
        System.out.println("Author  : " + author);
        System.out.println("Price   : ₹" + price);

        System.out.println("==================================");
    }
}