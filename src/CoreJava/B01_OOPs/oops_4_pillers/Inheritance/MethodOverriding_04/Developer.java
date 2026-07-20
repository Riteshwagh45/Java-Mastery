package CoreJava.B01_OOPs.oops_4_pillers.Inheritance.MethodOverriding_04;

/**
 * Child Class
 */
public class Developer extends Employee {

    public Developer(String name) {
        super(name);
    }

    @Override
    public void calculateSalary() {

        System.out.println(getName() + "'s Salary = ₹80,000");

    }

}