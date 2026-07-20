package CoreJava.B01_OOPs.oops_4_pillers.Inheritance.HierarchicalInheritance_03;

public class Car extends Vehicle {

    public Car(String brand, String model, double price) {
        super(brand, model, price);
    }

    public void drive() {
        System.out.println(getBrand() + " Car is Driving.");
    }

}