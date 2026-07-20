package CoreJava.B01_OOPs.oops_4_pillers.Inheritance.SingleInheritance_01;

/**
 * -----------------------------------------------
 * Parent Class
 * Represents common properties of every vehicle.
 * -----------------------------------------------
 */
public class Vehicle {

    //==============================
    // Private Fields
    //==============================

    private String brand;
    private String model;
    private double price;

    //==============================
    // Constructors
    //==============================

    public Vehicle() {

    }

    public Vehicle(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    //==============================
    // Getter Methods
    //==============================

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    //==============================
    // Business Methods
    //==============================

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
