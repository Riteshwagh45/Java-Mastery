package CoreJava.B01_OOPs.Constructor.CopyConstructor_03;

/*
    Copy Constructor Example

    Java doesn't have a built-in copy constructor.
    We create it manually by passing an object
    of the same class.
*/

public class Student {

    int rollNo;
    String name;
    double marks;

    // Parameterized Constructor
    Student(int rollNo, String name, double marks) {

        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;

    }

    // Copy Constructor
    Student(Student s) {

        this.rollNo = s.rollNo;
        this.name = s.name;
        this.marks = s.marks;

        System.out.println("Copy Constructor Called.");

    }

    void display() {

        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println("Marks   : " + marks);

    }

}