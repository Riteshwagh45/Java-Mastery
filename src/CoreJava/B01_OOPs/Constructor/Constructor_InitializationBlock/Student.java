package CoreJava.B01_OOPs.Constructor.Constructor_InitializationBlock;

/*
    Initialization Blocks

    Execution Order:

    1. Static Block (Only Once)
    2. Instance Initialization Block
    3. Constructor
*/

public class Student {

    int rollNo;
    String name;
    static int a;

    // Static Block
    static {
        a = 10;
        System.out.println("Static Block Executed");

    }

    // Instance Initialization Block
    {

        System.out.println("Instance Initialization Block Executed");

        rollNo = 100;
        name = "Unknown";

    }

    Student() {

        System.out.println("Default Constructor");

    }

    Student(int rollNo, String name) {

        this.rollNo = rollNo;
        this.name = name;

        System.out.println("Parameterized Constructor");

    }

    void display() {

        System.out.println("Roll No : " + rollNo);
        System.out.println("Name : " + name);

    }

}
