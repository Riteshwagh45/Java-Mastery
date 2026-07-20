package CoreJava.B01_OOPs.Constructor.Constructor_InitializationBlock;

public class Employee {

    static {

        System.out.println("Employee Static Block");

    }

    {

        System.out.println("Employee Instance Block");

    }

    Employee(){

        System.out.println("Employee Constructor");

    }

}
