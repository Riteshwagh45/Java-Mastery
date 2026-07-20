package CoreJava.D01_collectionFramework.Map.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AccountCRUD {

    static class Account {

        private int id;
        private String name;
        private double balance;

        public Account(int id, String name, double balance) {
            this.id = id;
            this.name = name;
            this.balance = balance;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public double getBalance() {
            return balance;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        @Override
        public String toString() {
            return "Account ID = " + id +
                    ", Name = " + name +
                    ", Balance = " + balance;
        }
    }

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinkedHashMap<Integer, Account> accountMap = new LinkedHashMap<>();

        while (true) {

            System.out.println("\n========== ACCOUNT MANAGEMENT ==========");
            System.out.println("1. Add User");
            System.out.println("2. Update Balance");
            System.out.println("3. Search User");
            System.out.println("4. Remove User");
            System.out.println("5. Display All Users");
            System.out.println("6. Exit");
            System.out.print("Enter your choice : ");

            int ch = sc.nextInt();

            // Add User
            if (ch == 1) {

                System.out.print("Enter Account ID : ");
                int id = sc.nextInt();

                if (accountMap.containsKey(id)) {

                    System.out.println("User already exists.");

                } else {

                    System.out.print("Enter Account Holder Name : ");
                    String name = sc.next();

                    System.out.print("Enter Balance : ");
                    double balance = sc.nextDouble();

                    accountMap.put(id, new Account(id, name, balance));

                    System.out.println("User Added Successfully.");
                }
            }

            // Update Balance
            else if (ch == 2) {

                if (accountMap.isEmpty()) {

                    System.out.println("No Users Available.");

                } else {

                    System.out.print("Enter Account ID : ");
                    int id = sc.nextInt();

                    if (accountMap.containsKey(id)) {

                        System.out.print("Enter New Balance : ");
                        double balance = sc.nextDouble();

                        accountMap.get(id).setBalance(balance);

                        System.out.println("Balance Updated Successfully.");

                    } else {

                        System.out.println("Invalid Account ID.");
                    }
                }
            }

            // Search User
            else if (ch == 3) {

                if (accountMap.isEmpty()) {

                    System.out.println("No Users Available.");

                } else {

                    System.out.print("Enter Account ID : ");
                    int id = sc.nextInt();

                    if (accountMap.containsKey(id)) {

                        System.out.println(accountMap.get(id));

                    } else {

                        System.out.println("Invalid Account ID.");
                    }
                }
            }

            // Remove User
            else if (ch == 4) {

                if (accountMap.isEmpty()) {

                    System.out.println("No Users Available.");

                } else {

                    System.out.print("Enter Account ID : ");
                    int id = sc.nextInt();

                    if (accountMap.containsKey(id)) {

                        accountMap.remove(id);

                        System.out.println("User Removed Successfully.");

                    } else {

                        System.out.println("Invalid Account ID.");
                    }
                }
            }

            // Display All Users
            else if (ch == 5) {

                if (accountMap.isEmpty()) {

                    System.out.println("No Users Available.");

                } else {

                    System.out.println("\n------- Account Details -------");

                    for (Map.Entry<Integer, Account> entry : accountMap.entrySet()) {

                        System.out.println(entry.getValue());
                    }
                }
            }

            // Exit
            else if (ch == 6) {

                System.out.println("Program Terminated.");

                sc.close();
                System.exit(0);
            }

            // Invalid Choice
            else {

                System.out.println("Invalid Choice.");
            }
        }
    }
}