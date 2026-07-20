package CoreJava.B01_OOPs.AccessModifiers.Public_04;

/*
 * Everything inside this class is public.
 */

public class Student {

    public int rollNo;
    public String name;
    public double marks;

    public Student(int rollNo, String name, double marks) {

        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;

    }

    public void displayStudent() {

        System.out.println("Roll No : " + rollNo);
        System.out.println("Name : " + name);
        System.out.println("Marks : " + marks);

    }

    public double percentage() {

        return marks;

    }

}