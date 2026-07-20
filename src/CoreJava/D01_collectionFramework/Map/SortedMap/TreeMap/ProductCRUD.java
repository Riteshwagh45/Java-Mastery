package CoreJava.D01_collectionFramework.Map.SortedMap.TreeMap;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ProductCRUD {

    static class Product {

        private int id;
        private String name;
        private double price;

        public Product(int id, String name, double price) {
            this.id = id;
            this.name = name;
            this.price = price;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "Product ID = " + id +
                    ", Name = " + name +
                    ", Price = ₹" + price;
        }
    }

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        TreeMap<Integer, Product> productMap = new TreeMap<>();

        while (true) {

            System.out.println("\n========== PRODUCT MANAGEMENT ==========");
            System.out.println("1. Add Product");
            System.out.println("2. Update Price");
            System.out.println("3. Search Product");
            System.out.println("4. Remove Product");
            System.out.println("5. Display All Products");
            System.out.println("6. Display First Product");
            System.out.println("7. Display Last Product");
            System.out.println("8. Display Products Greater Than ID");
            System.out.println("9. Display Products Less Than ID");
            System.out.println("10. Exit");

            System.out.print("Enter your choice : ");

            int ch = sc.nextInt();

            switch (ch) {

                case 1:

                    System.out.print("Enter Product ID : ");
                    int id = sc.nextInt();

                    if (productMap.containsKey(id)) {

                        System.out.println("Product already exists.");

                    } else {

                        System.out.print("Enter Product Name : ");
                        String name = sc.next();

                        System.out.print("Enter Product Price : ");
                        double price = sc.nextDouble();

                        productMap.put(id, new Product(id, name, price));

                        System.out.println("Product Added Successfully.");
                    }

                    break;

                case 2:

                    if (productMap.isEmpty()) {

                        System.out.println("No Products Available.");
                        break;
                    }

                    System.out.print("Enter Product ID : ");
                    id = sc.nextInt();

                    if (productMap.containsKey(id)) {

                        System.out.print("Enter New Price : ");
                        double price = sc.nextDouble();

                        productMap.get(id).setPrice(price);

                        System.out.println("Price Updated Successfully.");

                    } else {

                        System.out.println("Invalid Product ID.");
                    }

                    break;

                case 3:

                    if (productMap.isEmpty()) {

                        System.out.println("No Products Available.");
                        break;
                    }

                    System.out.print("Enter Product ID : ");
                    id = sc.nextInt();

                    if (productMap.containsKey(id)) {

                        System.out.println(productMap.get(id));

                    } else {

                        System.out.println("Invalid Product ID.");
                    }

                    break;

                case 4:

                    if (productMap.isEmpty()) {

                        System.out.println("No Products Available.");
                        break;
                    }

                    System.out.print("Enter Product ID : ");
                    id = sc.nextInt();

                    if (productMap.containsKey(id)) {

                        productMap.remove(id);

                        System.out.println("Product Removed Successfully.");

                    } else {

                        System.out.println("Invalid Product ID.");
                    }

                    break;

                case 5:

                    if (productMap.isEmpty()) {

                        System.out.println("No Products Available.");
                    }

                    else {

                        System.out.println("\nProducts (Sorted by ID)");

                        for (Map.Entry<Integer, Product> entry : productMap.entrySet()) {

                            System.out.println(entry.getValue());
                        }
                    }

                    break;

                case 6:

                    if (productMap.isEmpty()) {

                        System.out.println("No Products Available.");
                    }

                    else {

                        System.out.println(productMap.get(productMap.firstKey()));
                    }

                    break;

                case 7:

                    if (productMap.isEmpty()) {

                        System.out.println("No Products Available.");
                    }

                    else {

                        System.out.println(productMap.get(productMap.lastKey()));
                    }

                    break;

                case 8:

                    if (productMap.isEmpty()) {

                        System.out.println("No Products Available.");
                        break;
                    }

                    System.out.print("Enter Product ID : ");
                    id = sc.nextInt();

                    System.out.println(productMap.tailMap(id, false));

                    break;

                case 9:

                    if (productMap.isEmpty()) {

                        System.out.println("No Products Available.");
                        break;
                    }

                    System.out.print("Enter Product ID : ");
                    id = sc.nextInt();

                    System.out.println(productMap.headMap(id, false));

                    break;

                case 10:

                    sc.close();

                    System.out.println("Program Terminated.");

                    System.exit(0);

                default:

                    System.out.println("Invalid Choice.");
            }
        }
    }
}