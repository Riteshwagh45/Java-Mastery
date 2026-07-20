package CoreJava.B01_OOPs.AccessModifiers.Default_02;

public class DefaultDemo {

    public static void main(String[] args) {

        System.out.println("====== DEFAULT ACCESS MODIFIER ======\n");

        Employee emp = new Employee(201, "Rahul", 42000);

        // Accessing Default Variables
        System.out.println("Employee ID : " + emp.empId);
        System.out.println("Employee Name : " + emp.name);
        System.out.println("Employee Salary : " + emp.salary);

        System.out.println();

        // Calling Default Method
        emp.display();

        System.out.println();

        // Calling Another Default Method
        System.out.println("Annual Salary : " + emp.annualSalary());

        System.out.println();

        // Access from another class
        HR hr = new HR();

        hr.employeeDetails();

    }

}