package CoreJava.B01_OOPs.oops_4_pillers.Encapsulation;

public class Employee {

    //==============================
    // Private Fields
    //==============================

    private int employeeId;
    private String employeeName;
    private double salary;
    private String department;

    //==============================
    // Constructors
    //==============================

    public Employee() {

    }

    public Employee(int employeeId, String employeeName,
                    double salary, String department) {

        this.employeeId = employeeId;
        setEmployeeName(employeeName);
        setSalary(salary);
        setDepartment(department);
    }

    //==============================
    // Getter Methods
    //==============================

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    //==============================
    // Setter Methods
    //==============================

    public void setEmployeeId(int employeeId) {

        if(employeeId <= 0){
            System.out.println("Invalid Employee Id");
            return;
        }

        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {

        if(employeeName == null || employeeName.trim().isEmpty()){
            System.out.println("Invalid Employee Name");
            return;
        }

        this.employeeName = employeeName;
    }

    public void setSalary(double salary) {

        if(salary < 10000){
            System.out.println("Salary must be at least 10000.");
            return;
        }

        this.salary = salary;
    }

    public void setDepartment(String department) {

        if(department == null || department.trim().isEmpty()){
            System.out.println("Invalid Department");
            return;
        }

        this.department = department;
    }

    //==============================
    // Business Method
    //==============================

    public void displayEmployee() {

        System.out.println("---------------------------");
        System.out.println("ID         : " + employeeId);
        System.out.println("Name       : " + employeeName);
        System.out.println("Salary     : " + salary);
        System.out.println("Department : " + department);
        System.out.println("---------------------------");
    }
}