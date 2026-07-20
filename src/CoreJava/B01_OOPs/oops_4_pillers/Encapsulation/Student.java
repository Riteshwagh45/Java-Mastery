package CoreJava.B01_OOPs.oops_4_pillers.Encapsulation;

/**
 * ---------------------------------------------------------
 * Topic  : Basic Encapsulation
 * Class  : Student
 *
 * Encapsulation means hiding the internal data of an object
 * and allowing controlled access through public methods.
 * ---------------------------------------------------------
 */
public class Student {

    //==============================
    // Private Data Members
    //==============================

    private int rollNo;
    private String name;
    private int age;

    //==============================
    // Default Constructor
    //==============================

    public Student() {
        System.out.println("Student Object Created");
    }

    //==============================
    // Parameterized Constructor
    //==============================

    public Student(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        setAge(age); // Validation
    }

    //==============================
    // Getter Methods
    //==============================

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    //==============================
    // Setter Methods
    //==============================

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setName(String name) {

        if (name == null || name.trim().isEmpty()) {
            System.out.println("Invalid Name");
            return;
        }

        this.name = name;
    }

    public void setAge(int age) {

        if (age < 1 || age > 120) {
            System.out.println("Invalid Age");
            return;
        }

        this.age = age;
    }

    //==============================
    // Business Method
    //==============================

    public void displayStudent() {

        System.out.println("-----------------------------");
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println("Age     : " + age);
        System.out.println("-----------------------------");
    }
}