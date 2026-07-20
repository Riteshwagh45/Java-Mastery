package CoreJava.B01_OOPs.AccessModifiers.Protected_03;

/*
 * Dog inherits Animal.
 *
 * Since Animal's members are protected,
 * Dog can directly access them.
 */

public class Dog extends Animal {

    String breed;

    public Dog(String name, int age, String breed) {

        super(name, age);

        this.breed = breed;
    }

    public void showDog() {

        // Direct access because of inheritance

        System.out.println("Dog Name : " + name);

        System.out.println("Dog Age : " + age);

        System.out.println("Breed : " + breed);

        eat();

    }

}