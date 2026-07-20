package CoreJava.B01_OOPs.Constructor.CopyConstructor_03;

public class Book {

    int bookId;
    String bookName;
    double price;

    // Parameterized Constructor
    Book(int bookId, String bookName, double price) {

        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;

    }

    // Copy Constructor
    Book(Book b) {

        this.bookId = b.bookId;
        this.bookName = b.bookName;
        this.price = b.price;

    }

    void display() {

        System.out.println("Book ID   : " + bookId);
        System.out.println("Book Name : " + bookName);
        System.out.println("Price     : " + price);

    }

}