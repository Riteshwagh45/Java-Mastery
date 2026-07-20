package CoreJava.B01_OOPs.AccessModifiers.Public_04;

public class publicDemo {

    public static void main(String[] args) {

        System.out.println("========== PUBLIC ACCESS MODIFIER ==========\n");

        College college = new College("Nowrosjee Wadia College");

        college.displayCollege();

        System.out.println();

        Student student = new Student(101, "Ritesh", 91.5);

        student.displayStudent();

        System.out.println();

        System.out.println("Percentage : " + student.percentage());

        System.out.println();

        // Direct access because variables are public

        System.out.println("Direct Variable Access");

        System.out.println(student.rollNo);
        System.out.println(student.name);
        System.out.println(student.marks);

        System.out.println();

        // Updating public variables directly

        student.rollNo = 102;
        student.name = "Rahul";
        student.marks = 85.5;

        System.out.println("After Updating");

        student.displayStudent();

    }

}