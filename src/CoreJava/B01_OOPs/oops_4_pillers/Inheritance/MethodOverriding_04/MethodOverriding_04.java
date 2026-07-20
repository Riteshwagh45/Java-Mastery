package CoreJava.B01_OOPs.oops_4_pillers.Inheritance.MethodOverriding_04;

public class MethodOverriding_04 {

    public static void main(String[] args) {

        Employee employee = new Employee("Ritesh");

        employee.calculateSalary();

        System.out.println();

        Developer developer = new Developer("Rohit");

        developer.calculateSalary();

    }

}