package CoreJava.B01_OOPs.oops_4_pillers.Inheritance.MultilevelInheritance_02;

public class ElectricCar extends Car {

    private int batteryCapacity;
    private int chargingTime;

    public ElectricCar(String brand,
                       String model,
                       double price,
                       String fuelType,
                       int numberOfDoors,
                       int batteryCapacity,
                       int chargingTime) {

        super(brand, model, price, fuelType, numberOfDoors);

        this.batteryCapacity = batteryCapacity;
        this.chargingTime = chargingTime;
    }

    public void charge() {

        System.out.println(getBrand() + " is Charging...");

    }

    public void displayElectricCarInfo() {

        displayCarInfo();

        System.out.println("Battery Capacity : " + batteryCapacity + " kWh");
        System.out.println("Charging Time    : " + chargingTime + " Hours");

        System.out.println("==============================");
    }

}