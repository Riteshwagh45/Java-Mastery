package CoreJava.B01_OOPs.oops_4_pillers.Inheritance.MultilevelInheritance_02;

public class MultilevelInheritance_02 {

    public static void main(String[] args) {

        ElectricCar car = new ElectricCar(
                "Tesla",
                "Model Y",
                6500000,
                "Electric",
                5,
                75,
                2
        );

        car.displayElectricCarInfo();

        System.out.println();

        car.start();     // Vehicle

        car.drive();     // Car

        car.charge();    // ElectricCar

        car.stop();      // Vehicle

    }

}