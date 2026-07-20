package CoreJava.B01_OOPs.oops_4_pillers.Inheritance.HierarchicalInheritance_03;

public class HierarchicalInheritance_03 {

    public static void main(String[] args) {

        Car car = new Car("Toyota", "Fortuner", 5200000);
        Bike bike = new Bike("Yamaha", "R15", 220000);
        Truck truck = new Truck("Tata", "Signa", 3500000);

        System.out.println("----- CAR -----");
        car.start();
        car.drive();
        car.stop();

        System.out.println();

        System.out.println("----- BIKE -----");
        bike.start();
        bike.wheelie();
        bike.stop();

        System.out.println();

        System.out.println("----- TRUCK -----");
        truck.start();
        truck.loadGoods();
        truck.stop();
    }
}