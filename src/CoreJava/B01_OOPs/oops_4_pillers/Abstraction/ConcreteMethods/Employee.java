package CoreJava.B01_OOPs.oops_4_pillers.Abstraction.ConcreteMethods;

public abstract class Employee {

    //abstract method
    public abstract void calculateSalary();

    // Concrete Method
    public void companyName(){
        System.out.println("Google....:");
    }

    //concrete method
    public void attendanceRule(){
        System.out.println("09 :: AM TO 05 :: PM");
    }
}
