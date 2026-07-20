package CoreJava.B01_OOPs.Constructor.Constructor_06_ConstructorChaining;

/*
    Constructor Chaining using this()

    this() is used to call another constructor
    of the same class.
*/

public class Student {

    int rollNo;
    String name;
    double marks;

    // Constructor 1
    Student() {

        this(101);

        System.out.println("Default Constructor Executed");

    }

    // Constructor 2
    Student(int rollNo) {

        this(rollNo, "Unknown");

        System.out.println("One Parameter Constructor Executed");

    }

    // Constructor 3
    Student(int rollNo, String name) {

        this(rollNo, name, 0);

        System.out.println("Two Parameter Constructor Executed");

    }

    // Constructor 4
    Student(int rollNo, String name, double marks) {

        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;

        System.out.println("Three Parameter Constructor Executed");

    }

    void display() {

        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println("Marks   : " + marks);

    }

}