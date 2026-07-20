package CoreJava.B01_OOPs.oops_4_pillers.Inheritance.MultilevelInheritance_02;

public class Car extends Vehicle {

    private String fuelType;
    private int numberOfDoors;

    public Car(String brand,
               String model,
               double price,
               String fuelType,
               int numberOfDoors) {

        super(brand, model, price);

        this.fuelType = fuelType;
        this.numberOfDoors = numberOfDoors;
    }

    public void drive() {

        System.out.println(getBrand() + " Car is Driving.");

    }

    public void displayCarInfo() {

        displayVehicleInfo();

        System.out.println("Fuel Type : " + fuelType);
        System.out.println("Doors     : " + numberOfDoors);

    }

}