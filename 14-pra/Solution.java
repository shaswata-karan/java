import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Customer> customers = new ArrayList<>();

        // Input number of customers
        System.out.print("Enter the number of customers: ");
        int n = scanner.nextInt();

        // Add customers dynamically
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Customer " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            System.out.print("Age: ");
            int age = scanner.nextInt();

            customers.add(new Customer(id, name, salary, age));
        }

        // Calculate average salary
        double averageSalary = findAverageSalaryOfCustomer(customers);
        System.out.println("\nAverage Salary: " + averageSalary);

        // Search customer by salary
        System.out.print("\nEnter salary to search for a customer: ");
        double searchSalary = scanner.nextDouble();
        Customer result = searchCustomerBySalary(customers, searchSalary);

        if (result != null) {
            System.out.println("Customer Found: " + result.getName());
        } else {
            System.out.println("Customer not found.");
        }

        scanner.close();
    }

    // Static method to find average salary
    public static double findAverageSalaryOfCustomer(ArrayList<Customer> customers) {
        if (customers.isEmpty()) {
            return 0;
        }
        double totalSalary = 0;
        for (Customer customer : customers) {
            totalSalary += customer.getSalary();
        }
        return totalSalary / customers.size();
    }

    // Static method to search customer by salary
    public static Customer searchCustomerBySalary(ArrayList<Customer> customers, double salary) {
        for (Customer customer : customers) {
            if (customer.getSalary() == salary) {
                return customer;
            }
        }
        return null;
    }
}

class Customer {
    private int id;
    private String name;
    private double salary;
    private int age;

    // Parameterized Constructor
    public Customer(int id, String name, double salary, int age) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }
}