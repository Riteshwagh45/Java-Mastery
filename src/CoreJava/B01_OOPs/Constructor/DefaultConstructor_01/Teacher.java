
package CoreJava.B01_OOPs.Constructor.DefaultConstructor_01;
/*
    Another Example

    Every time an object is created,
    constructor executes automatically.
*/

public class Teacher {

    String teacherName;
    String subject;

    Teacher() {

        teacherName = "Not Assigned";
        subject = "Not Assigned";

        System.out.println("Teacher Object Created.");

    }

    void display() {

        System.out.println("Teacher Name : " + teacherName);
        System.out.println("Subject      : " + subject);

    }

}