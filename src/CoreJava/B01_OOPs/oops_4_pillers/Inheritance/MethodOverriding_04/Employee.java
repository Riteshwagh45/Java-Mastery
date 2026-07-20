package CoreJava.B01_OOPs.oops_4_pillers.Inheritance.MethodOverriding_04;

/**
 * Parent Class
 */
public class Employee {

    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void calculateSalary() {

        System.out.println("Calculating General Employee Salary...");

    }

}