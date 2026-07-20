package CoreJava.B01_OOPs.oops_4_pillers.Encapsulation;

public class ImmutableClass_06 {

    public static void main(String[] args) {

        Book book = new Book(
                101,
                "Effective Java",
                "Joshua Bloch",
                899.0
        );

        book.displayBook();

        System.out.println();

        System.out.println("Book Id : " + book.getBookId());
        System.out.println("Title   : " + book.getTitle());
        System.out.println("Author  : " + book.getAuthor());
        System.out.println("Price   : " + book.getPrice());

        Book b1 = new Book(102,"javaprogramming","ritesh",1000.0);
        b1.displayBook();

        /*
            Not Possible

            book.setPrice(999);

            book.setTitle("Java");

            book.setAuthor("ABC");
        */

    }

}