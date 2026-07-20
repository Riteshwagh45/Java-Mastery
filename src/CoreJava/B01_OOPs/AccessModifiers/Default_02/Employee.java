package CoreJava.B01_OOPs.AccessModifiers.Default_02;

/*
 * Default Access Modifier
 *
 * If we don't write any access modifier,
 * Java treats it as package-private (default).
 *
 * It is accessible only within the same package.
 */

class Employee {

    // Default Variables
    int empId;
    String name;
    double salary;

    // Default Constructor
    Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    // Default Method
    void display() {

        System.out.println("Employee ID : " + empId);
        System.out.println("Employee Name : " + name);
        System.out.println("Employee Salary : " + salary);
    }

    // Another Default Method
    double annualSalary() {
        return salary * 12;
    }

}