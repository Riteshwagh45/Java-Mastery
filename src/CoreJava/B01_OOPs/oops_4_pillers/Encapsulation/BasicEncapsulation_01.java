package CoreJava.B01_OOPs.oops_4_pillers.Encapsulation;

public class BasicEncapsulation_01 {

    public static void main(String[] args) {

        Student student = new Student();

        // Setter Methods

        student.setRollNo(101);
        student.setName("Ritesh");
        student.setAge(22);

        // Getter Methods

        System.out.println("Roll No : " + student.getRollNo());
        System.out.println("Name    : " + student.getName());
        System.out.println("Age     : " + student.getAge());

        System.out.println();

        student.displayStudent();

        System.out.println();

        // Invalid Data

        student.setAge(-20);

        student.setName("");

    }
}