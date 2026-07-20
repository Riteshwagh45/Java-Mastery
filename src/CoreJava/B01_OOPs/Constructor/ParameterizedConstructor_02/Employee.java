package CoreJava.B01_OOPs.Constructor.ParameterizedConstructor_02;

/*
    Another Example of Parameterized Constructor
*/

public class Employee {

    int empId;
    String empName;
    double salary;
    String department;

    Employee(int empId, String empName,
             double salary, String department) {

        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.department = department;

    }

    void display() {

        System.out.println("Employee ID   : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Salary        : " + salary);
        System.out.println("Department    : " + department);

    }

}