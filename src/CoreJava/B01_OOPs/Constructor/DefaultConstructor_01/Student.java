package CoreJava.B01_OOPs.Constructor.DefaultConstructor_01;

/*
    Default Constructor Example

    A constructor is a special member of a class.
    It is automatically called whenever an object is created.

    Here we are creating our own default constructor.
*/

public class Student {

    int rollNo;
    String name;
    double marks;

    // Default Constructor
    Student() {

        System.out.println("Student Object Created.");

        rollNo = 0;
        name = "Unknown";
        marks = 0.0;
    }

    void display() {

        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println("Marks   : " + marks);

    }

}