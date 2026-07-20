package CoreJava.B01_OOPs.Constructor.ConstructorOverloading_04;

public class Car {

    String company;
    String model;
    double price;

    Car() {

        company = "Unknown";
        model = "Unknown";
        price = 0;

    }

    Car(String company) {

        this.company = company;

    }

    Car(String company, String model) {

        this.company = company;
        this.model = model;

    }

    Car(String company, String model, double price) {

        this.company = company;
        this.model = model;
        this.price = price;

    }

    void display() {

        System.out.println("Company : " + company);
        System.out.println("Model   : " + model);
        System.out.println("Price   : " + price);

    }

}