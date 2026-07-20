package CoreJava.B01_OOPs.oops_4_pillers.Inheritance.HierarchicalInheritance_03;

public class Bike extends Vehicle {

    public Bike(String brand, String model, double price) {
        super(brand, model, price);
    }

    public void wheelie() {
        System.out.println(getBrand() + " Bike is doing a Wheelie.");
    }

}