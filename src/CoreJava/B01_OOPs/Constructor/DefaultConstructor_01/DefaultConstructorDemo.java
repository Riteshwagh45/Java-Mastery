package CoreJava.B01_OOPs.Constructor.DefaultConstructor_01;

public class DefaultConstructorDemo {

    public static void main(String[] args) {

        System.out.println("========== DEFAULT CONSTRUCTOR ==========\n");

        Student s1 = new Student();

        s1.display();

        System.out.println();

        Teacher t1 = new Teacher();

        t1.display();

        System.out.println();

        System.out.println("Creating Another Student Object");

        Student s2 = new Student();

        s2.display();

    }

}