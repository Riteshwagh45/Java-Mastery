package CoreJava.B01_OOPs.oops_4_pillers.Inheritance.HierarchicalInheritance_03;

public class Truck extends Vehicle {

    public Truck(String brand, String model, double price) {
        super(brand, model, price);
    }

    public void loadGoods() {
        System.out.println(getBrand() + " Truck is Loading Goods.");
    }

}