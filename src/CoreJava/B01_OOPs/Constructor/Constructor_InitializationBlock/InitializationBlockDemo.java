package CoreJava.B01_OOPs.Constructor.Constructor_InitializationBlock;

public class InitializationBlockDemo {

    public static void main(String[] args) {

        System.out.println("======= INITIALIZATION BLOCK =======");

        System.out.println();

        Student s1 = new Student();

        System.out.println();

        s1.display();

        System.out.println();

        Student s2 =
                new Student(101,"Ritesh");

        System.out.println();

        s2.display();

        System.out.println();

        Employee e1 = new Employee();

        System.out.println();

        Employee e2 = new Employee();

    }

}
