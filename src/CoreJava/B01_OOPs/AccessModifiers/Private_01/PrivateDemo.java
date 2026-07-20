package CoreJava.B01_OOPs.AccessModifiers.Private_01;

public class PrivateDemo {

    public static void main(String[] args) {

        Student student = new Student(1, "Ritesh", 92);

        System.out.println("===== PRIVATE ACCESS MODIFIER =====");

        // Access using Getter Methods
        System.out.println(student.getRollNo());
        System.out.println(student.getName());
        System.out.println(student.getMarks());

        System.out.println();

        // Update values using Setter Methods
        student.setRollNo(2);
        student.setName("Rahul");
        student.setMarks(78);

        System.out.println("After Updating");

        student.display();

        System.out.println();

        College c = new College();

        c.showStudent();

    }

}