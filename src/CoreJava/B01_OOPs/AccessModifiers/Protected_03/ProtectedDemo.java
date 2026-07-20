package CoreJava.B01_OOPs.AccessModifiers.Protected_03;

public class ProtectedDemo {

    public static void main(String[] args) {

        System.out.println("======= PROTECTED ACCESS MODIFIER =======");

        Animal animal = new Animal("Tiger", 5);

        System.out.println();

        animal.display();

        animal.eat();

        System.out.println();

        Dog dog = new Dog("Tommy", 3, "Labrador");

        dog.showDog();

        System.out.println();

        dog.display();

    }

}