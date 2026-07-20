package CoreJava.B01_OOPs.AccessModifiers.Default_02;

/*
 * HR class belongs to the SAME PACKAGE.
 *
 * Therefore it can access all default members.
 */

public class HR {

    public void employeeDetails() {

        Employee emp = new Employee(101, "Ritesh", 50000);

        System.out.println("Employee Details");

        System.out.println("ID : " + emp.empId);
        System.out.println("Name : " + emp.name);
        System.out.println("Salary : " + emp.salary);

        emp.display();

        System.out.println("Annual Salary : " + emp.annualSalary());

    }

}