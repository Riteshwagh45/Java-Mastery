package CoreJava.B01_OOPs.oops_4_pillers.Encapsulation;

public class GetterSetter_02 {

    public static void main(String[] args) {

        Employee employee = new Employee();

        employee.setEmployeeId(101);
        employee.setEmployeeName("Ritesh");
        employee.setSalary(50000);
        employee.setDepartment("Software");

        employee.displayEmployee();

        System.out.println();

        System.out.println("Trying Invalid Data");

        employee.setSalary(500);

        employee.setEmployeeName("");

        employee.setDepartment(null);

        employee.displayEmployee();

    }

}