package CoreJava.B01_OOPs.oops_4_pillers.Inheritance.MultilevelInheritance_02;

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

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public void start() {
        System.out.println(brand + " Vehicle Started.");
    }

    public void stop() {
        System.out.println(brand + " Vehicle Stopped.");
    }

    public void displayVehicleInfo() {

        System.out.println("\n===== VEHICLE DETAILS =====");

        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : ₹" + price);
    }
}