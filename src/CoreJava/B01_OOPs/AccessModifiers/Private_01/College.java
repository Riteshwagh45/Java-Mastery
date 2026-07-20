package CoreJava.B01_OOPs.AccessModifiers.Private_01;

public class College {

    public void showStudent() {

        Student s = new Student(101, "Ritesh", 88);

        /*
         * We cannot access
         * s.rollNo
         * s.name
         * s.marks
         *
         * because they are private.
         */

        System.out.println("Access using Getter Methods");

        System.out.println(s.getRollNo());
        System.out.println(s.getName());
        System.out.println(s.getMarks());

    }

}