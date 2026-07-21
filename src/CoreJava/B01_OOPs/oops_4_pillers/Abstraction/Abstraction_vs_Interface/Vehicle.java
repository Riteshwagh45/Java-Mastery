package CoreJava.B01_OOPs.oops_4_pillers.Abstraction.Abstraction_vs_Interface;

public abstract class Vehicle {

    protected String brand;

    //Constructor
    public Vehicle(String brand){
        this.brand = brand;
        System.out.println("Vehicle Constructor is called ");
    }

    //abstract method
    public abstract void startEngine();

    //concrete method
    public void showBrand(){
        System.out.println("Brand is : " +brand);
    }
}
