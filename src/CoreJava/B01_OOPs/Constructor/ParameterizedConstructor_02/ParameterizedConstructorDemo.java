package CoreJava.B01_OOPs.Constructor.ParameterizedConstructor_02;

public class ParameterizedConstructorDemo {

    public static void main(String[] args) {

        System.out.println("======= PARAMETERIZED CONSTRUCTOR =======");

        Student s1 =
                new Student(101, "Ritesh", 91.25);

        System.out.println();

        s1.display();

        System.out.println();

        Student s2 =
                new Student(102, "Rahul", 82.75);

        System.out.println();

        s2.display();

        System.out.println();

        Employee e1 =
                new Employee(501,
                        "Amit",
                        50000,
                        "Software");

        System.out.println();

        e1.display();

    }

}
