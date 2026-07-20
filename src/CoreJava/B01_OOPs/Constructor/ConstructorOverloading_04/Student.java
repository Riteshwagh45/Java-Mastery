package CoreJava.B01_OOPs.Constructor.ConstructorOverloading_04;

/*
    Constructor Overloading

    A class can have multiple constructors.
    The constructors must differ in the number
    or type of parameters.
*/

public class Student {

    int rollNo;
    String name;
    double marks;

    // Constructor 1
    Student() {

        System.out.println("Default Constructor Called.");

        rollNo = 0;
        name = "Unknown";
        marks = 0;

    }

    // Constructor 2
    Student(int rollNo) {

        this.rollNo = rollNo;

        System.out.println("Constructor with Roll Number");

    }

    // Constructor 3
    Student(int rollNo, String name) {

        this.rollNo = rollNo;
        this.name = name;

        System.out.println("Constructor with Roll Number and Name");

    }

    // Constructor 4
    Student(int rollNo, String name, double marks) {

        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;

        System.out.println("Constructor with All Details");

    }

    void display() {

        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println("Marks   : " + marks);

    }

}