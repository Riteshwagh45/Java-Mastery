package CoreJava.B01_OOPs.Constructor.Constructor_05_ThisKeyword;

/*
    this Keyword

    "this" refers to the current object.

    Uses:
    1. Access current object's variables
    2. Call current object's methods
    3. Pass current object as argument
    4. Return current object
*/

public class Student {

    int rollNo;
    String name;
    double marks;

    Student(int rollNo, String name, double marks){

        // Instance Variable = Local Variable

        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;

    }

    void display(){

        System.out.println("Roll No : " + this.rollNo);
        System.out.println("Name    : " + this.name);
        System.out.println("Marks   : " + this.marks);

    }

    void print(){

        System.out.println("\nCalling display() using this keyword");

        this.display();

    }

    void currentObject(){

        System.out.println("\nCurrent Object Reference");

        System.out.println(this);

    }

    Student getObject(){

        return this;

    }

}