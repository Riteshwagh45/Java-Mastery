package CoreJava.B01_OOPs.Constructor.ParameterizedConstructor_02;

/*
    Parameterized Constructor

    A parameterized constructor accepts arguments.
    It is used to initialize object values while creating the object.
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

        System.out.println("Student Object Created Successfully.");

    }

    void display() {

        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println("Marks   : " + marks);

    }

}