package CoreJava.B01_OOPs.oops_4_pillers.Inheritance.SingleInheritance_01;

/**
 * -----------------------------------------------
 * Child Class
 * Car inherits Vehicle.
 * -----------------------------------------------
 */
public class Car extends Vehicle {

    //==============================
    // Child Specific Fields
    //==============================

    private String fuelType;
    private int numberOfDoors;

    //==============================
    // Constructor
    //==============================

    public Car(String brand,
               String model,
               double price,
               String fuelType,
               int numberOfDoors) {

        super(brand, model, price);

        this.fuelType = fuelType;
        this.numberOfDoors = numberOfDoors;
    }

    //==============================
    // Child Methods
    //==============================

    public void drive() {
        System.out.println(getBrand() + " Car is Driving...");
    }

    public void displayCarInfo() {

        displayVehicleInfo();

        System.out.println("Fuel Type : " + fuelType);
        System.out.println("Doors     : " + numberOfDoors);

        System.out.println("============================");
    }

}