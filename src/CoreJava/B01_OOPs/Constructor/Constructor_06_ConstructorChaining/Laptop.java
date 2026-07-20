package CoreJava.B01_OOPs.Constructor.Constructor_06_ConstructorChaining;

public class Laptop {

    String company;
    String model;
    int ram;

    Laptop() {

        this("HP");

        System.out.println("Default Constructor");

    }

    Laptop(String company) {

        this(company, "Unknown");

        System.out.println("Company Constructor");

    }

    Laptop(String company, String model) {

        this(company, model, 8);

        System.out.println("Company + Model Constructor");

    }

    Laptop(String company, String model, int ram) {

        this.company = company;
        this.model = model;
        this.ram = ram;

        System.out.println("Final Constructor");

    }

    void display() {

        System.out.println("Company : " + company);
        System.out.println("Model   : " + model);
        System.out.println("RAM     : " + ram + " GB");

    }

}