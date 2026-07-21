package CoreJava.B01_OOPs.oops_4_pillers.Abstraction.Abstraction_vs_Interface;

public class Main {

    public static void main(String[] args) {

        Car car = new Car("BMW");

        System.out.println("---------------------------");

        car.showBrand();
        car.startEngine();
        car.playMusic();
        car.naviGate();

    }
}