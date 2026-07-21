package CoreJava.B01_OOPs.oops_4_pillers.Abstraction.Abstraction_vs_Interface;

public class Car extends Vehicle implements MusicPlayer,GPS{


    Car(String brand){
        super(brand);
    }

    @Override
    public void startEngine() {
        System.out.println("car is starting.....");

    }

    @Override
    public void playMusic() {
        System.out.println("Music is playing");
    }

    @Override
    public void naviGate() {
        System.out.println("Location is navigated....");
    }
}
