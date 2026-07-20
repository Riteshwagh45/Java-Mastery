package CoreJava.B01_OOPs.oops_4_pillers.Inheritance.HierarchicalInheritance_03;

public class Vehicle {

    private String brand;
    private String model;
    private double price;

    public Vehicle(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void start() {
        System.out.println(brand + " Vehicle Started.");
    }

    public void stop() {
        System.out.println(brand + " Vehicle Stopped.");
    }
}