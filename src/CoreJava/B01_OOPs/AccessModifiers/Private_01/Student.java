package CoreJava.B01_OOPs.AccessModifiers.Private_01;

/*
 * private members can only be accessed
 * inside the same class.
 */

public class Student {

    // Private variables
    private int rollNo;
    private String name;
    private double marks;

    // Constructor
    public Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    // Public Setter Methods
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    // Public Getter Methods
    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    // Private Method
    private void calculateGrade() {

        if (marks >= 75)
            System.out.println("Grade : Distinction");

        else if (marks >= 60)
            System.out.println("Grade : First Class");

        else if (marks >= 40)
            System.out.println("Grade : Pass");

        else
            System.out.println("Grade : Fail");
    }

    // Public Method
    public void display() {

        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println("Marks   : " + marks);

        // Private method can be called here
        calculateGrade();
    }

}