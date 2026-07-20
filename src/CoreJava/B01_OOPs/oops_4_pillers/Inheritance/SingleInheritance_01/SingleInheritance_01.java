package CoreJava.B01_OOPs.oops_4_pillers.Inheritance.SingleInheritance_01;

public class SingleInheritance_01 {

    public static void main(String[] args) {

        Car car = new Car(
                "Toyota",
                "Fortuner",
                5200000,
                "Diesel",
                5
        );

        car.displayCarInfo();

        System.out.println();

        car.start();

        car.drive();

        car.stop();

    }

}
