package CoreJava.B01_OOPs.Constructor.CopyConstructor_03;

public class CopyConstructorDemo {

    public static void main(String[] args) {

        System.out.println("======= COPY CONSTRUCTOR =======");

        Student s1 =
                new Student(101, "Ritesh", 91.5);

        System.out.println("\nOriginal Object");

        s1.display();

        // Creating Copy
        Student s2 = new Student(s1);

        System.out.println("\nCopied Object");

        s2.display();

        System.out.println();

        Book b1 =
                new Book(1,
                        "Core Java",
                        650);

        System.out.println("Original Book");

        b1.display();

        Book b2 = new Book(b1);

        System.out.println();

        System.out.println("Copied Book");

        b2.display();

    }

}