package CoreJava.B01_OOPs.Constructor.ConstructorOverloading_04;

public class ConstructorOverloadingDemo {

    public static void main(String[] args) {

        System.out.println("======= CONSTRUCTOR OVERLOADING =======");

        Student s1 = new Student();

        s1.display();

        System.out.println();

        Student s2 = new Student(101);

        s2.display();

        System.out.println();

        Student s3 = new Student(102, "Ritesh");

        s3.display();

        System.out.println();

        Student s4 = new Student(103, "Rahul", 92.5);

        s4.display();

        System.out.println();

        Car c1 = new Car();

        c1.display();

        System.out.println();

        Car c2 = new Car("Toyota");

        c2.display();

        System.out.println();

        Car c3 = new Car("Toyota", "Fortuner");

        c3.display();

        System.out.println();

        Car c4 = new Car("Toyota", "Fortuner", 5200000);

        c4.display();

    }

}