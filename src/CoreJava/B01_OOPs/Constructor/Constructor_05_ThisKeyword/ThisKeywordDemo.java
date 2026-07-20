package CoreJava.B01_OOPs.Constructor.Constructor_05_ThisKeyword;

public class ThisKeywordDemo {

    public static void main(String[] args) {

        System.out.println("========== THIS KEYWORD ==========\n");

        Student s1 =
                new Student(101,
                        "Ritesh",
                        91.50);

        s1.display();

        s1.print();

        s1.currentObject();

        System.out.println("\nReference in Main");

        System.out.println(s1);

        System.out.println();

        Student s2 = s1.getObject();

        System.out.println("Reference Returned");

        System.out.println(s2);

        System.out.println();

        Employee e1 =
                new Employee(1,
                        "Rahul");

        e1.passCurrentObject();

    }

}